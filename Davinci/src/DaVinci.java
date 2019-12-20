import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.awt.Color;

class DaVinci extends JFrame
{
	private Game d_game;
	private BackgroundPanel d_bg;
	private TableRenderer d_renderer;
	private StartPanel d_start;
	private Timer d_timer;
	
	public DaVinci(String[] args)
	{
		super("Da Vinci Code Game");
	
		setIconImage(ImageFactory.Image("icoon.png").getImage());
		
		// Initialize game
		d_game = new Game();
		
		// Set global image provider for dnd
		new SwingDragImages.GlobalImageProvider();
		
		// Enable to exit the game
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
					DaVinci.this.dispose();
			}
		});
		
		// Fullscreen and native look and feel
		setLook();
		
		// Exit on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Set background panel
		d_bg = new BackgroundPanel(0.5f);
		getContentPane().add(d_bg, BorderLayout.CENTER);
		
		d_bg.setLayout(new BorderLayout());
		d_bg.setOpaque(false);
		setVisible(true);
		
		final MouseAdapter listener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				d_bg.removeMouseListener(this);
				d_timer.stop();
				DaVinci.this.initStartGame();
			}
		};

		d_bg.addMouseListener(listener);
		
		d_timer = new Timer(3000, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				d_timer.stop();
				d_bg.removeMouseListener(listener);
				DaVinci.this.initStartGame();
			}
		});
		
		d_timer.start();
	}
	
	private void initStartGame()
	{
		d_bg.setDim(0.05f);
		d_start = new StartPanel(d_game);
		d_start.setOpaque(false);
		d_bg.add(d_start, BorderLayout.CENTER);
		
		validate();
		d_start.Build();
		
		d_start.addDoneEventListener(Integer.class, new CustomEvent.Listener<Integer>() {
			public void customEventOccurred(CustomEvent.Event<Integer> e)
			{
				DaVinci.this.startGame();
			}
		});	
	}
	
	private void startTestGame()
	{
		d_bg.removeAll();

		d_renderer = new TableRenderer(d_game);
		d_renderer.setOpaque(false);
		
		d_bg.add(d_renderer, BorderLayout.CENTER);
		d_bg.validate();

		Prolog.makePlayers(4);
		d_game.addPlayer("Kim");
		d_game.addPlayer("Stephanie");
		d_game.addPlayer("Jesse");
		d_game.addPlayer("Matthijs");
		
		for (Player plr : d_game.getPlayers())
		{
			for (int i = 0; i < 4; i++)
			{
				Tile tile = d_game.giveTile(plr);
				Prolog.addTile(d_game.getPlayers().indexOf(plr), tile);
				plr.turnDone(true);
			}
		}
		
		d_renderer.enableTable();
		repaint();	
	}
	
	private void startGame()
	{
		// Make players in prolog
		Prolog.makePlayers(d_game.getPlayers().size());
		d_bg.removeAll();

		d_renderer = new TableRenderer(d_game);
		d_renderer.setOpaque(false);
		
		d_bg.add(d_renderer, BorderLayout.CENTER);
		d_bg.validate();

		d_renderer.startGame();		
		repaint();
	}

	private void setLook() {
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
		}

		//setUndecorated(true);
		
		//GraphicsEnvironment.getLocalGraphicsEnvironment().
		//	getDefaultScreenDevice().setFullScreenWindow(this);
		setSize(1024, 768);
	}

	public static void main(String[] args) 
	{
		Prolog.init();
		DaVinci app = new DaVinci(args); 
	}

}
