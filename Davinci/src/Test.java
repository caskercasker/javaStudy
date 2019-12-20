import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

class Test extends JFrame {
	public Test()
	{
		super("Test");

		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		MessageDialog m = new MessageDialog("Titel", "Dit is een test <b>berichtje</b> om te kijken of <i>MessageDialog</i> goed getoond wordt. Het is de bedoeling dat het halftransparant is en dat deze tekst goed afgebroken wordt.");
	
		JLabel t = new JLabel("test");
		t.setOpaque(true);
		t.setBackground(Color.white);
		t.setSize(100, 25);

		setSize(m.getWidth() + 50, m.getHeight() + 50);

		add(m);
		m.setLocation(10, 10);

		add(t);
		t.setLocation(30, 30);;

		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Test();
	}
}
