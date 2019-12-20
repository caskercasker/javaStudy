import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PileRenderer extends JComponent
{
	private boolean d_black;
	private int d_num;
	private ImageIcon d_image;
	private ImageIcon d_glow;
	private boolean d_glowing;
	private Vector<Integer> d_offset;

	public static int TILE_HEIGHT = 13;
	public static int RAND_OFFSET = 5;
	
	public PileRenderer(boolean black, int num)
	{
		d_black = black;
		d_num = num;
		d_glowing = false;

		initOffsets();
		loadImage();
		
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setDoubleBuffered(true);
		enableEvents(MouseEvent.MOUSE_EXITED | MouseEvent.MOUSE_ENTERED);
	}
	
	public void pop()
	{
		d_num--;
	
		repaint();
	}
	
	private void initOffsets()
	{
		d_offset = new Vector<Integer>();

		for (int i = 0; i < d_num; i++)
			d_offset.add(Math.round((int)(Math.random() * RAND_OFFSET * 2)) - RAND_OFFSET);
	}

	private void loadImage()
	{
		String filename = "tiles/tile_pile_";
		String glow = "tiles/tile_glow_";

		if (d_black)
		{
			filename += "black";
			glow += "pile";
		}
		else
		{
			filename += "white";
			glow += "white_pile";
		}
			
		d_image = ImageFactory.Image(filename + ".png");
		d_glow = ImageFactory.Image(glow + ".png");

		if (d_image != null)
		{
			int width = d_image.getIconWidth() + RAND_OFFSET * 2;
			int height = d_image.getIconHeight() + 11 * TILE_HEIGHT;
			
			setMinimumSize(new Dimension(width, height));
			setPreferredSize(new Dimension(width, height));
			setSize(new Dimension(width, height));
		}
	}
	
	private Graphics2D initGraphics(Graphics g) {
		RenderingHints renderHints = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		Graphics2D result = (Graphics2D)g.create();
		result.setRenderingHints(renderHints);

		return result;
	}
	
	protected void paintComponent(Graphics g) {
		if (d_image != null) {
			int iconX = (getWidth() - d_image.getIconWidth()) / 2;
			int iconY = getHeight() - d_image.getIconHeight();
			
			Graphics2D g2d = initGraphics(g);			
			
			for (int i = 0; i < d_num; i++)
			{
				int offset = d_offset.get(i);
				d_image.paintIcon(this, g2d, iconX + offset, iconY);
				
				if (d_glowing && isEnabled())
					d_glow.paintIcon(this, g2d, iconX + offset, iconY);
				
				iconY -= TILE_HEIGHT;
			}

			g2d.dispose();
		}
	}

	protected void processMouseEvent(MouseEvent e) {
		super.processMouseEvent(e);

		if (!isEnabled())
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
	
	public void setEnabled(boolean enable)
	{
		super.setEnabled(enable);
		
		if (!enable && d_glowing)
		{
			d_glowing = false;
			repaint();
		}
	}
}
