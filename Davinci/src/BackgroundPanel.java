import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.awt.Color;

public class BackgroundPanel extends JPanel
{
	private float d_dim = 1.0f;

	public BackgroundPanel()
	{
		super();
	}
	
	public BackgroundPanel(float dim)
	{
		super();
		setDim(dim);
	}
	
	public void setDim(float dim)
	{
		d_dim = dim;
		repaint();
	}

	protected void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g.create();
		ImageIcon icon = ImageFactory.Image("achtergrond.png");
		g2d.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), 0, 0, icon.getIconWidth(), icon.getIconHeight(), this);

		// Draw splash
		if (d_dim != 1.0f)
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, d_dim));

		icon = ImageFactory.Image("splash2.png");
		icon.paintIcon(this, g2d, (getWidth() - icon.getIconWidth()) / 2, (getHeight() - icon.getIconHeight()) / 2);
		
		g2d.dispose();
		super.paintComponent(g);
	}
}
