import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;

public class TileRenderer extends JComponent implements DropTargetListener {
	private Tile d_tile;
	private Position d_position;
	private ImageIcon d_image;
	private ImageIcon d_glow;
	private ImageIcon d_overlay;
	private boolean d_glowing;
	private CustomEventImpl d_customEvent;
	private int d_index;
	private int d_playerIndex;
	
	public static int WIDTH = 80;
	public static int HEIGHT = 140;
	public static float MIN_HINT = 0.3f;

	public TileRenderer(Tile tile, Position position, int index, int playerIndex) {
		d_tile = tile;
		d_position = position;
		d_customEvent = new CustomEventImpl();
		d_index = index;
		d_playerIndex = playerIndex;

		loadImage();
		
		setDoubleBuffered(true);
		enableEvents(MouseEvent.MOUSE_EXITED | MouseEvent.MOUSE_ENTERED);
		
		new DropTarget(this, this);
		
		if (d_position == Position.BOTTOM || d_tile.getOpen())
			setEnabled(false);
		
		processHints();
	}
	
	public boolean validHints()
	{
		// Valid if one of the hints > MIN_HINT
		for (Float f : d_tile.getHint().values())
			if (f > MIN_HINT)
				return true;
		
		return false;
	}
	
	public void processHints()
	{
		Hashtable<Integer, Float> hints = d_tile.getHint();
		
		if (d_position == Position.BOTTOM)
			return;
		
		if (hints == null || !isEnabled() || d_tile.getOpen())
			setOverlay(null);		
		else if (hints.values().size() == 1 && !d_tile.getOpen())
			setOverlay("green");
		else if (validHints())
			setOverlay("blue");
		else
			setOverlay(null);

		repaint();
	}
	
	private String posToString()
	{
		switch (d_position) {
			case LEFT:
				return "left";
			case RIGHT:
				return "right";
			case BOTTOM: case TOP:
				return "bottom";
		}
		
		return "";		
	}
	
	private void loadImage() {
		String filename = "tiles/tile_";
		String glow = "tiles/tile_glow_";
		String pos = posToString();

		//if (!d_tile.getBlack())
		glow += "white_";
		
		filename += pos;
		glow += pos;

		if (d_tile.getBlack())
			filename += "_black";
		else
			filename += "_white";

		d_image = ImageFactory.Image(filename + ".png");
		d_glow = ImageFactory.Image(glow + ".png");
		
		if (d_image != null)
		{
			int width = Math.max(d_image.getIconWidth(), d_glow.getIconWidth());
			int height = Math.max(d_image.getIconHeight(), d_glow.getIconHeight());
			
			setMinimumSize(new Dimension(width, height));
			setPreferredSize(new Dimension(width, height));
			setSize(new Dimension(width, height));
		}
	}
	
	private void paintGlow(Graphics2D g2d) {
		if (!d_glowing || d_glow == null || !isEnabled())
			return;

		int iconX = (getWidth() - d_glow.getIconWidth()) / 2;
		int iconY = (getHeight() - d_glow.getIconHeight()) / 2;

		d_glow.paintIcon(this, g2d, iconX, iconY);
	}
	
	private void paintOverlay(Graphics2D g2d)
	{
		if (d_overlay == null)
			return;
			
		int iconX = (getWidth() - d_glow.getIconWidth()) / 2;
		int iconY = (getHeight() - d_glow.getIconHeight()) / 2;

		d_overlay.paintIcon(this, g2d, iconX, iconY);		
	}
	
	private void paintNumber(Graphics2D g2d) {
		if (d_position != Position.BOTTOM && !d_tile.getOpen())
			return;

		String num = Integer.toString(d_tile.getValue());
		int width = g2d.getFontMetrics().stringWidth(num);
		int height = g2d.getFontMetrics().getHeight();
		int offset = 0;
		
		if (d_tile.getValue() > 9)
			offset = 9;

		switch (d_position) {
			case LEFT:
				if (offset > 0)
					offset -= 4;

				g2d.translate(getWidth() / 2 + 5 - width / 2, getHeight() / 2 + 8 + offset);
				g2d.shear(-0.1, -0.7);
			break;
			case RIGHT:
				g2d.translate(getWidth() / 2 - 5 - width / 2, getHeight() / 2 - 6 - offset);
				g2d.shear(0.1, 0.7);
			break;
			case BOTTOM: case TOP:
				g2d.translate(getWidth() / 2 - 3 - width / 2, getHeight() / 2);
			break;
		}
		
		if (d_tile.getBlack())
			g2d.setColor(Color.white);
		else
			g2d.setColor(Color.black);

		g2d.drawString(num, 0, 0);
	}
	
	public void setEnabled(boolean enable)
	{
		if (enable && (d_position == Position.BOTTOM || d_tile.getOpen()))
			return;
		
		super.setEnabled(enable);
		
		if (!enable && d_glowing)
		{
			d_glowing = false;
			repaint();
		}
		
		processHints();
	}
	
	public void setOverlayFromFile(String filename)
	{
		if (filename == null)
			d_overlay = null;
		else
			d_overlay = ImageFactory.Image(filename);
		
		repaint();
	}
	
	public void setOverlay(String name)
	{
		if (name == null)
			setOverlayFromFile(null);
		else
			setOverlayFromFile("tiles/tile_" + name + "_" + posToString() + ".png");
	}
	
	private Graphics2D initGraphics(Graphics g) {
		RenderingHints renderHints = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		Graphics2D result = (Graphics2D)g.create();
		result.setRenderingHints(renderHints);
		
		Font f = new Font("Sans", Font.BOLD, 25);
		result.setFont(f);

		return result;
	}
	
	protected void paintComponent(Graphics g) {
		if (d_image != null) {
			int iconX = (getWidth() - d_image.getIconWidth()) / 2;
			int iconY = (getHeight() - d_image.getIconHeight()) / 2;

			Graphics2D g2d = initGraphics(g);			
			
			d_image.paintIcon(this, g2d, iconX, iconY);

			paintGlow(g2d);
			paintOverlay(g2d);			
			paintNumber(g2d);
			
			g2d.dispose();
		}
	}
	
	protected void processMouseEvent(MouseEvent e) {
		super.processMouseEvent(e);

		if (d_position == Position.BOTTOM || !isEnabled())
			return;

		switch (e.getID()) {
			case MouseEvent.MOUSE_ENTERED:
				d_glowing = true;
				repaint();
			break;
			case MouseEvent.MOUSE_EXITED:
				d_glowing = false;
				repaint();
			break;
		}
	}

	// This methods allows classes to register for MyEvents
	public <T> void addListener(Class<T> cl, CustomEvent.Listener<T> listener) {
		d_customEvent.addListener(cl, listener);
	}

	// This methods allows classes to unregister for MyEvents
	public <T> void removeListener(Class<T> cl, CustomEvent.Listener<T> listener) {
		d_customEvent.removeListener(cl, listener);
	}
	
	private boolean check(DropTargetDragEvent e)
	{
		if (d_position == Position.BOTTOM || !isEnabled())
		{
			e.rejectDrag();
			return false;
		}
		else
		{
			e.acceptDrag(DnDConstants.ACTION_COPY);
			return true;
		}
	}
    
	public void dragEnter(DropTargetDragEvent dtde)
	{
		if (!check(dtde))
			return;

		d_glowing = true;
		repaint();
	}
    
	public void dragExit(DropTargetEvent dtde)
	{
		if (d_position == Position.BOTTOM || !isEnabled())
			return;

		d_glowing = false;
		repaint();
	}
    
	public void dragOver(DropTargetDragEvent dtde) 
	{
		check(dtde);
	}

	public void drop(DropTargetDropEvent dtde) 
	{
		if (d_position == Position.BOTTOM || !isEnabled())
		{
			dtde.rejectDrop();
		}
		else
		{
			dtde.acceptDrop(DnDConstants.ACTION_COPY);
			
			try
			{
				Transferable trans = dtde.getTransferable();
				DataFlavor flr = new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType + "; class=java.lang.Object", null);

				String data = (String)trans.getTransferData(flr);
				
				int num = Integer.parseInt(data);
				d_customEvent.fire(Integer.class, new CustomEvent.Event<Integer>(this, num));
			}
			catch (Exception e)
			{
			}
			
			dtde.dropComplete(true);
		}
	}
    
	public void dropActionChanged(DropTargetDragEvent dtde)
	{
		check(dtde);
	}
	
	public Tile getTile()
	{
		return d_tile;
	}
	
	public Position getPosition()
	{
		return d_position;
	}
	
	public void setTile(Tile tile)
	{
		d_tile = tile;
		repaint();
	}
	
	public int getIndex()
	{
		return d_index;
	}

	public int getPlayerIndex()
	{
		return d_playerIndex;
	}
}
