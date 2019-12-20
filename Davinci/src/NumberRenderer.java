import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class NumberRenderer extends JComponent
{
	private int d_num;
	private ImageIcon d_image;
	public static int WIDTH = 50;
	public static int HEIGHT = 50;

	public NumberRenderer(int num)
	{
		d_num = num;

		loadImage();
		
		setDoubleBuffered(true);
		setCursor(new Cursor(Cursor.MOVE_CURSOR));
	}
	
	public int getNum()
	{
		return d_num;
	}
	
	private void loadImage()
	{
		d_image = ImageFactory.Image("tiles/number.png");

		if (d_image != null)
		{
			int width = d_image.getIconWidth();
			int height = d_image.getIconHeight();
			
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
		
		Font f = new Font("Sans", Font.BOLD, 25);
    	result.setFont(f);
    	
		result.setRenderingHints(renderHints);

		return result;
	}
	
	private void drawNumber(Graphics2D g2d)
	{
		String num;
		
		if (d_num == -1)
		{
			num = "?";
			g2d.setColor(Color.white);
		}
		else
		{
			num = Integer.toString(d_num);
			g2d.setColor(Color.black);
		}

		int width = g2d.getFontMetrics().stringWidth(num);
		int height = g2d.getFontMetrics().getHeight();

		g2d.drawString(num, (getWidth() - width) / 2 - 3, (getHeight() + height) / 2 - 5);
	}
	
	protected void paintComponent(Graphics g) {
		if (d_image != null) {
			int iconX = (getWidth() - d_image.getIconWidth()) / 2;
			int iconY = (getHeight() - d_image.getIconHeight()) / 2;
			
			Graphics2D g2d = initGraphics(g);

			d_image.paintIcon(this, g2d, iconX, iconY);
			drawNumber(g2d);
			
			g2d.dispose();
		}
	}
	
	public String getNumber()
	{
		return Integer.toString(d_num);
	}
	
	public void setNumber(String bla)
	{
	
	}
}
