import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.awt.Color;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class StartPanel extends JPanel
{
	private JTextField textfield;
	private JLabel label;
	private JLabel wrong; 
	private JLabel right; 
	private JButton b;
	private int width;
	private int height;
	private int pheight;
	private Font font = new Font("Sans", Font.BOLD, 13);

	private Game game;
	private	String player;
	private int nplayers;
	private int playercnt = 0;

	private ActionListener makePlayer;
	private ActionListener setNrPlayers;
	private CustomEventImpl d_customEvent;
	
	public StartPanel(Game game)
	{
		this.game = game;
		
		d_customEvent = new CustomEventImpl();
		setLayout(null);
	}
	
	public void Build()
	{
		width = getWidth();
		height = getHeight();
		pheight = height / 6;		

		label = new JLabel("");
		label.setForeground(Color.white);
		
		wrong = new JLabel("");
		wrong.setForeground(Color.white);
		
		right = new JLabel("");
		right.setForeground(Color.white);

		beginGame();
	}
	
	private void beginGame()
	{
		makeActionListeners();
		askNrPlayers();
	}

	private void askNrPlayers()
	{
		//ask numbers of players and names
		label.setText("Number of players: ");
		label.setSize(width / 6, 25);
		label.setLocation((width - label.getWidth()) / 2, 25);
		label.setFont(font);

		textfield = new JTextField("", 5);
		textfield.setEditable(true);
		textfield.setOpaque(false);
		textfield.setSize(width / 10, 25);
		textfield.setLocation((width - label.getWidth()) / 2, 2 * 25);
		textfield.setFont(font);

		wrong.setText("Give a correct number of players (2, 3 or 4)");
		wrong.setVisible(false);
		right.setVisible(false);
		wrong.setSize(width / 2, 25);
		right.setSize(width / 2, 25);		
		wrong.setLocation((width - label.getWidth()) / 2, 3 * 25);
		right.setLocation((width - label.getWidth()) / 2, 3 * 25);	
		wrong.setFont(font);
		right.setFont(font);	

		b = new JButton("Ok");
		b.setSize(width / 12, 30);
		b.setLocation((width - label.getWidth()) / 2 + width / 9, 2 * 25 - 3);
		b.setFont(font);
		b.setOpaque(false);

		b.addActionListener(setNrPlayers);
		textfield.addActionListener(setNrPlayers);

		add(label);
		add(textfield);
		add(b);
		add(wrong);
		add(right);

		textfield.grabFocus();

		repaint();
		b.repaint();
		revalidate();
	} //askNrPlayers

	private void createPlayers () {
		textfield.setColumns(20);
		wrong.setText("Please enter a name");
		wrong.setFont(font);
		right.setText("Player is added");
		right.setFont(font);
		
		revalidate();
		repaint();

		playercnt = 1;
		askPlayerName();
	}
	
	private void askPlayerName() {
		textfield.setText("");
		textfield.setFont(font);

		if (playercnt > nplayers) {
			//all players added
			cleanUp();
		}

		label.setText("Player " + (playercnt) + " : ");
		label.setFont(font);

		textfield.grabFocus();

		ActionListener [] tmp1 = b.getActionListeners();
		b.removeActionListener(tmp1[0]);

		ActionListener [] tmp2 = textfield.getActionListeners();
		textfield.removeActionListener(tmp2[0]);

		b.addActionListener(makePlayer);
		textfield.addActionListener(makePlayer);

		revalidate();
		repaint();
	} //askPlayerName

	private void cleanUp(){
		removeAll();
		repaint();
		
		d_customEvent.fire(Integer.class, new CustomEvent.Event<Integer>(this, 1));
	}
	
	private void makeActionListeners()
	{
		setNrPlayers = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				nplayers = 0;
				
				try
				{
					nplayers = Integer.parseInt(textfield.getText());
				}
				catch (Exception ex)
				{
				}
				
				if (nplayers <= 1 || nplayers > 4) {
					right.setVisible(false);
					wrong.setVisible(true);
					revalidate();
					repaint();
				}
				else
				{
					wrong.setVisible(false);
					right.setVisible(false);
					revalidate();
					repaint();
					createPlayers();
				}
			}
		};

		makePlayer = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					player = textfield.getText();
					player = player.trim();
				}
				catch (Exception ex)
				{
				}

				if (player.equals(""))
				{
					right.setVisible(false);
					wrong.setVisible(true);
					revalidate();
					repaint();
				}
				else
				{
					game.addPlayer(player);
					//System.out.println("Speler aangemaakt: " + player);
					wrong.setVisible(false);
					right.setVisible(true);
					revalidate();
					repaint();
					playercnt++;
					askPlayerName();
				}
			}
		};
	}

	public <T> void addDoneEventListener(Class<T> cl, CustomEvent.Listener<T> listener) {
		d_customEvent.addListener(cl, listener);
	}

	public <T> void removeDoneEventListener(Class<T> cl, CustomEvent.Listener<T> listener) {
		d_customEvent.removeListener(cl, listener);
	}
}
