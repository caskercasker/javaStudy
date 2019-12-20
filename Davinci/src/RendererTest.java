import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.awt.Color;

public class RendererTest extends JFrame implements KeyListener {
	public RendererTest(String name) {
		super(name);
		
		new SwingDragImages.GlobalImageProvider();
		
		addWindowListener(new WindowAdapter() { 
		    	public void windowClosing(WindowEvent e) { 
		        	System.exit(0);
		    	}
		});
		
		addKeyListener(this);

		Game game = new Game();
		Player kim = game.addPlayer("Kim");
		Player steph = game.addPlayer("Stephanie");
		Player jesse = game.addPlayer("Jesse");
		Player matthijs = game.addPlayer("Matthijs");
		
		for (int i = 0; i < 4; i++)
		{
			game.giveTile(kim);
			kim.turnDone(false);
			
			game.giveTile(steph);
			steph.turnDone(false);
			
			game.giveTile(jesse);
			jesse.turnDone(false);
			
			game.giveTile(matthijs);
			matthijs.turnDone(false);
		}
		
		game.nextTurn();

		setLook();
		setVisible(true);

		BackgroundPanel content = new BackgroundPanel();
		content.setOpaque(false);
		getContentPane().add(content, BorderLayout.CENTER);

		TableRenderer panel = new TableRenderer(game);
		panel.setOpaque(false);
		content.add(panel);
		
		content.setBounds(0, 0, getWidth(), getHeight());
		panel.setBounds(0, 0, getWidth(), getHeight());
		panel.update();
	}
	
	private void setLook() {
            	try
            	{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
		}

		setUndecorated(true);
		
		GraphicsEnvironment.getLocalGraphicsEnvironment().
			getDefaultScreenDevice().setFullScreenWindow(this);
	}
	
	public void keyPressed(KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
			System.exit(0);
	}
	
	public void keyReleased(KeyEvent evt) {
	}
	
	public void keyTyped(KeyEvent evt) {
	}

	public static void main(String[] args) {
		RendererTest renderer = new RendererTest("RendererTest");
	}
}
