import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TableRenderer extends JPanel {
	private Game d_game;
	private boolean d_firstDrawn;
	private Vector<Component> d_permanent;
	private Vector<NumberRenderer> d_numbers;

	private PileRenderer d_pileBlack;
	private PileRenderer d_pileWhite;
	
	private MessageDialog d_dlg;

	private int ANGLE_TRANS_X = 52;
	private int ANGLE_TRANS_Y = 34;
	private int BOTTOM_ROW = 100;
	private int NUMBER_OFFSET = 5;
	
	public TableRenderer(Game game) {
		d_game = game;
		d_permanent = new Vector<Component>();
		d_numbers = new Vector<NumberRenderer>();
		d_firstDrawn = true;

		// No layout
		setDoubleBuffered(true);
		setLayout(null);
	}
	
	private void drawTilesReal(Position position, Vector<Tile> tiles, Point start, Point translate, int playerIndex)
	{
		int x = start.x;
		int y = start.y;
		int index = 0;
		int direction;
		
		if (position == Position.LEFT || position == Position.TOP)
		{
			index = tiles.size() - 1;
			direction = -1;
		}
		else
		{
			index = 0;
			direction = 1;
		}
		
		for (Tile tile : tiles) {
			TileRenderer renderer = new TileRenderer(tile, position, index, playerIndex);
			
			if (position != Position.BOTTOM)
			{
				renderer.addListener(Integer.class, new CustomEvent.Listener<Integer>() {
					public void customEventOccurred(CustomEvent.Event<Integer> e) {
						guessTile((TileRenderer)e.getSource(), e.getValue());
					}
				});
			}

			add(renderer);
			Dimension size = renderer.getPreferredSize();
			
			if (position == Position.BOTTOM && tile.getOpen())
				renderer.setBounds(x, y - 20, (int)size.getWidth(), (int)size.getHeight());
			else
				renderer.setBounds(x, y, (int)size.getWidth(), (int)size.getHeight());

			x += translate.x;
			y += translate.y;
			
			index += direction;
		}

		if (position == Position.BOTTOM)
		{
			Player active = d_game.getActivePlayer();
			Tile aside = active.getAside();
			
			if (aside != null)
			{
				TileRenderer renderer = new TileRenderer(aside, position, -1, -1);
				renderer.setOverlayFromFile("tiles/tile_pink_bottom.png");
				
				add(renderer);
				Dimension size = renderer.getPreferredSize();
				
				renderer.setBounds(x + 50, y, (int)size.getWidth(), (int)size.getHeight());
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private void drawTiles(Position position, Player player, int playerIndex)
	{
		int width = getWidth();
		int height = getHeight() - BOTTOM_ROW;
		Point translate = new Point();
		Point start = new Point();
		Vector<Tile> tiles = (Vector<Tile>)player.getTiles().clone();
		
		if (width == 0 && height == 0)
			return;
		
		switch (position) {
			case LEFT: case RIGHT:
				start.y = (int)(((height - TileRenderer.HEIGHT * 2) / 2.0) + (tiles.size() / 2.0) * ANGLE_TRANS_Y);
				translate.y = -ANGLE_TRANS_Y;
				
				if (position == Position.LEFT) {
					start.x = 20;
					translate.x = ANGLE_TRANS_X;
					Collections.reverse(tiles);
				} else {
					start.x = width - 20 - TileRenderer.WIDTH;
					translate.x = -ANGLE_TRANS_X;
				}
			break;
			case BOTTOM:
				start.x = (int)((width / 2.0) - (tiles.size() / 2.0) * TileRenderer.WIDTH);
				start.y = height - TileRenderer.HEIGHT;
				
				translate.x = TileRenderer.WIDTH;
			break;
			case TOP:
				start.x = (int)((width / 2.0) - (tiles.size() / 2.0) * TileRenderer.WIDTH);
				start.y = 10;
				
				translate.x = TileRenderer.WIDTH;
				Collections.reverse(tiles);
			break;
		}
		
		drawTilesReal(position, tiles, start, translate, playerIndex);
	}
	
	private void drawName(Position position, Player player)
	{
		int width = getWidth();
		int height = getHeight() - BOTTOM_ROW;
		Point pos = new Point();
		Vector<Tile> tiles = player.getTiles();
		
		JLabel lbl = new JLabel(player.getName());
		lbl.setFont(new Font("Sans", Font.BOLD, 25));
		lbl.setForeground(Color.white);
		add(lbl);
				
		Dimension size = lbl.getPreferredSize();

		switch (position)
		{
			case LEFT: case RIGHT:				
				pos.y = (int)(height / 2.0 - size.getHeight() / 2.0);
				
				if (position == Position.LEFT)
					pos.x = (int)((tiles.size() / 2.0) * ANGLE_TRANS_X + TileRenderer.WIDTH);
				else
					pos.x = (int)(width - ((tiles.size() / 2.0) * ANGLE_TRANS_X) - size.getWidth() - TileRenderer.WIDTH);
			break;
			case TOP: case BOTTOM:
				pos.x = (int)(width / 2.0 - size.getWidth() / 2.0);
				
				if (position == Position.TOP)
					pos.y = TileRenderer.HEIGHT + 10;
				else
					pos.y = (int)(height - TileRenderer.HEIGHT - size.getHeight() - 40);
			break;
		}

		lbl.setBounds(pos.x, pos.y, (int)size.getWidth(), (int)size.getHeight());
	}
	
	private void drawPlayer(Position position, Player player)
	{
		drawTiles(position, player, d_game.getPlayers().indexOf(player));
		drawName(position, player);
		
		repaint();
	}
	
	public Component add(Component obj)
	{
		return add(obj, false);
	}
	
	public Component add(Component obj, boolean permanent)
	{
		super.add(obj);
		
		if (permanent)
			d_permanent.add(obj);
		
		return obj;
	}
	
	private void drawPiles()
	{
		if (d_pileBlack != null)
			return;

		d_pileBlack = new PileRenderer(true, d_game.getNumTiles(true));
		add(d_pileBlack, true);

		d_pileWhite = new PileRenderer(false, d_game.getNumTiles(false));
		add(d_pileWhite, true);

		// Put in middle of table
		int width = (int)d_pileBlack.getPreferredSize().getWidth() + PileRenderer.RAND_OFFSET * 2;
		int height = (int)d_pileBlack.getPreferredSize().getHeight();
		
		//black.setBounds(getWidth() / 2 - width - 20, (getHeight() - height) / 2, width, height);
		d_pileBlack.setLocation(getWidth() / 2 - width - 20, (getHeight() - BOTTOM_ROW - height) / 2);
		
		//white.setBounds(getWidth() / 2 + 20, (getHeight() - height) / 2, width, height);
		d_pileWhite.setLocation(getWidth() / 2 + 20, (getHeight() - BOTTOM_ROW - height) / 2);
	}
	
	private void drawNumbers()
	{
		if (d_numbers.size() == 0)
		{
			// Draw 13 NumberRenderers
			int startX = (getWidth() - 13 * NumberRenderer.WIDTH - 12 * NUMBER_OFFSET) / 2;
			int startY = (getHeight() - BOTTOM_ROW) + (BOTTOM_ROW - NumberRenderer.HEIGHT) / 2;
			
			for (int i = 0; i < 13; i++)
			{
				NumberRenderer rend;
				
				if (i == 12)
					rend = new NumberRenderer(-1);
				else
					rend = new NumberRenderer(i);
				
				d_numbers.add(rend);
				add(rend, true);
				
				rend.setLocation(startX, startY);
				startX += NumberRenderer.WIDTH + NUMBER_OFFSET;
				
				rend.setTransferHandler(new TransferHandler("number"));
				
				rend.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e)
					{
						JComponent c = (JComponent)e.getSource();
						
						if (c.isEnabled())
						{
							TransferHandler handler = c.getTransferHandler();
							handler.exportAsDrag(c, e, TransferHandler.COPY);
						}
					}
				});
			}
		}
	}
	
	private void enableTiles(boolean enable)
	{
		for (Component cmp : getComponents())
			if (cmp.getClass() == TileRenderer.class)
				cmp.setEnabled(enable);
	}
	
	private void enableNumbers(boolean enable)
	{
		for (NumberRenderer rend : d_numbers)
			rend.setEnabled(enable);
	}

	private void clear()
	{
		for (Component cmp : getComponents())
			if (!d_permanent.contains(cmp))
				remove(cmp);
	}
	
	private void showDialog(String title, String message, boolean okonly, CustomEvent.Listener<Integer> listener)
	{
		d_dlg = new MessageDialog(title, message, okonly);
		d_dlg.addDoneListener(Integer.class, listener);
		
		add(d_dlg, 0);
		
		int x;
		int y;
		
		x = (getWidth() - d_dlg.getWidth()) / 2;
		y = (getHeight() - d_dlg.getHeight()) / 2;

		d_dlg.setLocation(x, y);
		d_dlg.setVisible(true);
		doEnabled(false);
		
		validate();
		repaint();
		
		d_dlg.repaint();	
	}
	
	private void showDialogYesNo(String title, String message, CustomEvent.Listener<Integer> listener)
	{
		showDialog(title, message, false, listener);
	}
	
	private void showDialog(String title, String message, CustomEvent.Listener<Integer> listener)
	{
		showDialog(title, message, true, listener);
	}
		
	private void closeDialog()
	{
		remove(d_dlg);

		doEnabled(true);
		d_dlg = null;
		
		update();
	}
	
	private void doEnabled(boolean enable)
	{
		enableTiles(enable);
		enableNumbers(enable);
		enablePiles(enable);
	}
	
	private void showTakeTiles()
	{
		int numTiles;
		Vector<Player> players = d_game.getPlayers();
		
		if (players.size() == 4)
			numTiles = 3;
		else
			numTiles = 4;
		
		String message;
		String title;
		Player active = d_game.getActivePlayer();
		
		if (active == players.get(0))
		{
			title = "Begin of the game";
			message = "Each player takes <b>" + numTiles + "</b> tiles from the black or white pile of tiles. The first player to take " + numTiles + " tiles is <b>" + active.getName() + "</b>. The other players should look away while " + active.getName() + " is picking the tiles. Click <b>OK</b> to start picking tiles from the piles.";
		}
		else
		{
			title = "Done picking tiles";
			message = "You're done picking tiles. It's time for <b>" + active.getName() + "</b> to pick <b>" + numTiles + "</b> tiles from the piles of tiles. Click <b>OK</b> and tell " + active.getName() + " to start picking tiles.";
		}

		TableRenderer.this.enableTiles(false);
		TableRenderer.this.enableNumbers(false);

		showDialog(title, message, new CustomEvent.Listener<Integer>() {
			public void customEventOccurred(CustomEvent.Event args)
			{
				TableRenderer.this.closeDialog();
				
				TableRenderer.this.enableTiles(false);
				TableRenderer.this.enableNumbers(false);
			}
		});
	}
	
	public void startGame()
	{
		// Set active player to first player
		Vector<Player> vec = d_game.getPlayers();
		d_game.setActivePlayer(vec.get(0));

		// Update the game to render everything
		update();
		
		// Disable tiles so they can't be dragged
		enableTiles(false);
		
		// Disable numbers so they can't be dragged
		enableNumbers(false);

		
		d_pileBlack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				d_pileBlack.pop();
				TableRenderer.this.giveTile(true);
			}
		});
		
		d_pileWhite.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				d_pileWhite.pop();
				TableRenderer.this.giveTile(false);
			}
		});
		
		showTakeTiles();
	}
	
	private void removePileListeners()
	{
		for (MouseListener l : d_pileWhite.getMouseListeners())
			d_pileWhite.removeMouseListener(l);
		
		for (MouseListener l : d_pileBlack.getMouseListeners())
			d_pileBlack.removeMouseListener(l);	
	}
	
	private void enablePiles(boolean enable)
	{		
		d_pileBlack.setEnabled(enable);
		d_pileWhite.setEnabled(enable);
	}
	
	public void enableTable()
	{
		if (d_dlg != null)
		{
			remove(d_dlg);
			d_dlg = null;
		}

		update();

		if (d_game.getNumTiles() != 0)
		{
			enableNumbers(false);
			enableTiles(false);
		
			removePileListeners();
			enablePiles(true);

			d_pileBlack.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e)
				{
					TableRenderer.this.pickTile(true);
				}
			});
			d_pileWhite.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e)
				{
					TableRenderer.this.pickTile(false);
				}
			});
		}
		else
		{
			removePileListeners();
			enablePiles(false);
			enableNumbers(true);
		}
	}
	
	private void nextGuess(boolean endturn)
	{
		remove(d_dlg);
		d_dlg = null;
		
		if (!endturn)
		{
			enableTiles(true);
			enableNumbers(true);

			validate();
			repaint();
		}
		else
		{
			Player active = d_game.getActivePlayer();
			d_game.turnDone(active, true);
			hideBottomTiles();
			nextPlayer();
		}
	}
	
	private void nextPlayer()
	{
		d_game.nextTurn();
		Player active = d_game.getActivePlayer();

		clear();
		d_dlg = null;

		String message;
		if (d_game.getNumTiles() == 0)
			message = "Next player is <b>" + active.getName() + "</b>. Click <b>OK</b> to make your move by dragging one of the numbers below onto one of the tiles!";
		else
			message = "Next player is <b>" + active.getName() + "</b>. Click <b>OK</b> to pick a tile and make your move by dragging one of the numbers below onto one of the tiles!";

		showDialog("Next player", message, new CustomEvent.Listener<Integer>() {
			public void customEventOccurred(CustomEvent.Event e)
			{
				TableRenderer.this.enableTable();
			}
		});	
	}
	
	private void hideBottomTiles()
	{
		for (Component cmp : getComponents())
		{
			if (cmp.getClass() != TileRenderer.class)
				continue;
			
			TileRenderer rend = (TileRenderer)cmp;
			
			if (rend.getPosition() == Position.BOTTOM)
				rend.setVisible(false);
		}
	}
	
	private void showHint(TileRenderer renderer)
	{
		Tile tile = renderer.getTile();
		final Hashtable<Integer, Float> hints = tile.getHint();
		String title = "Hint";
		String message;
		int numHints = hints.values().size();
		
		if (numHints == 1)
		{
			// There is only one possibility
			message = "There is only one possibility for this tile. You should be able to know the number of this tile with the knowledge you have so far.";
		}
		else if (renderer.validHints())
		{
			message = "These are the possibilities (<i>with a probability > " + ((int)(Tile.MIN_PERC * 100)) + "%</i>) for this tile:<br><br>";
			Vector<Integer> numbers = new Vector<Integer>();
			Vector<Float> know = new Vector<Float>();
			
			for (Enumeration e = hints.keys(); e.hasMoreElements();)
			{
				Integer key = (Integer)e.nextElement();
				Float val = hints.get(key);
				
				numbers.add(key);
				know.add(val);
			}
			
			Collections.sort(numbers, new Comparator<Integer>() {
				public int compare(Integer i1, Integer i2)
				{					
					Float f1 = hints.get(i1);
					Float f2 = hints.get(i2);
					
					return Float.compare(f2, f1);
				}
			});
			
			Collections.sort(know);
			Collections.reverse(know);
			
			for (int i = 0; i < numbers.size(); i++)
			{
				if (i > 0)
				{
					if (i != numbers.size() - 1)
						message += ", ";
					else
						message += " or ";
				}
					
				message += "<b>" + numbers.get(i) + "</b> (<i>" + ((int)(know.get(i) * 100)) + "%</i>)";
			}
		}
		else
		{
			// No hints to show, too much unknown
			message = "There is still too much unknown to say anything sensible about this tile. It would be a wild guess.";
		}
		
		showDialog(title, message, new CustomEvent.Listener<Integer>() {
			public void customEventOccurred(CustomEvent.Event<Integer> e)
			{
				TableRenderer.this.nextGuess(false);
			}
		});
	}

	private void guessTile(TileRenderer renderer, int number)
	{
		if (number == -1)
		{
			showHint(renderer);
			return;
		}
	
		Tile tile = renderer.getTile();
		Player active = d_game.getActivePlayer();

		Prolog.guessed(d_game.getPlayers().indexOf(active), number, tile.getBlack());

		if (tile.getValue() == number)
		{
			// Guessed correctly, open tile
			tile.setOpen(true);
			Prolog.setTileOpen(renderer.getPlayerIndex(), renderer.getIndex());
			renderer.repaint();
			
			if (d_game.checkDone())
			{
				endGame();
				return;
			}
			
			// Show message
			showDialogYesNo("Guessed correct!", "<b><font color='green'>You guessed correct!</font></b> You can take another guess or end your turn. Do you want to take another guess <b>" + active.getName() + "</b>?", new CustomEvent.Listener<Integer>() {
				public void customEventOccurred(CustomEvent.Event<Integer> e)
				{
					if (e.getValue() == 1)
						TableRenderer.this.determineHints();

					TableRenderer.this.nextGuess(e.getValue() == 0);
				}
			});
		}
		else
		{
			// Notify prolog
			Prolog.failedGuess(renderer.getPlayerIndex(), renderer.getIndex(), number, tile.getBlack());
			
			// Guessed incorrect, set overlay
			renderer.setOverlay("red");
			tile = (Tile)(tile.clone());
			tile.setValue(number);
			tile.setOpen(true);
			renderer.setTile(tile);
			
			// Hide tiles from bottom player
			hideBottomTiles();
			
			Tile aside = active.getAside();
			d_game.turnDone(active, false);
			Prolog.setTileOpen(d_game.getPlayers().indexOf(active), active.getTiles().indexOf(aside));
			
			// Show message
			showDialog("Guessed incorrect!", "<b><font color='red'>You guessed wrong</font></b>. Please let the other players look at the screen to show them your guess.", new CustomEvent.Listener<Integer>() { 
				public void customEventOccurred(CustomEvent.Event e)
				{
					TableRenderer.this.nextPlayer();
				}
			});
		}
	}
	
	private void pickTile(boolean black)
	{
		if (black)
			d_pileBlack.pop();
		else
			d_pileWhite.pop();

		// Give a tile
		Tile tile = d_game.giveTile(d_game.getActivePlayer(), black);
		
		// Update prolog
		Prolog.addTile(d_game.getPlayers().indexOf(d_game.getActivePlayer()), tile);
		
		// Update field
		update();
		
		// Disable pile
		removePileListeners();
		enablePiles(false);
		
		// Enable numbers
		enableNumbers(true);
	}
	
	private void informBegin()
	{
		clear();
		d_dlg = null;

		showDialog("Playing the game", "Please click <b>OK</b> to make the first move by dragging one of the numbers onto one of the tiles <b>" + d_game.getActivePlayer().getName() + "</b>!", new CustomEvent.Listener<Integer>() {
			public void customEventOccurred(CustomEvent.Event e)
			{
				TableRenderer.this.enableTable();
			}
		});	
	}
	
	private void startRounds()
	{
		Player active = d_game.getActivePlayer();
		enablePiles(false);
		
		showDialog("Playing the game", "You are the last player to pick tiles. <b>" + active.getName() + "</b> will now begin with the actual game. Click <b>OK</b> and let <b>" + active.getName() + "</b> make the first move!", new CustomEvent.Listener<Integer>() {
			public void customEventOccurred(CustomEvent.Event e)
			{
				TableRenderer.this.informBegin();
			}
		});
	}
	
	private void giveTile(boolean black)
	{
		Player active = d_game.getActivePlayer();
		Vector<Player> players = d_game.getPlayers();
		
		// Give a tile to the active player
		Tile tile = d_game.giveTile(active, black);

		// Update prolog
		Prolog.addTile(players.indexOf(active), tile);

		// Player is done now
		active.turnDone(true);
		
		int numTiles;
		
		if (players.size() == 4)
			numTiles = 3;
		else
			numTiles = 4;

		// Player has enough tiles, so next player is up		
		if (active.getTiles().size() == numTiles)
		{
			update();
			d_game.nextTurn();

			if (active == players.lastElement())
			{
				// All players have their tiles, so begin the
				// game for real
				startRounds();
				return;
			}
			
			showTakeTiles();
		}
		else
		{
			update();
			TableRenderer.this.enableTiles(false);
			TableRenderer.this.enableNumbers(false);
		}
	}
	
	private void determineHints()
	{
		Vector<Player> players = d_game.getPlayers();
		Vector<Player> otherPlayers = d_game.getOtherPlayers();
		int reqIndex = players.indexOf(d_game.getActivePlayer());

		for (Player plr : otherPlayers)
		{
			Vector<Hashtable<Integer, Integer>> frequencies = new Vector<Hashtable<Integer, Integer>>(plr.getTiles().size());
			frequencies.setSize(plr.getTiles().size());
			Vector<Vector<Integer>> sequences = Prolog.sequences(reqIndex, players.indexOf(plr));
			
			for (Vector<java.lang.Integer> vec : sequences)
			{
				for (int i = 0; i < vec.size(); i++)
				{
					if (frequencies.get(i) == null)
						frequencies.set(i, new Hashtable<Integer, Integer>());

					Hashtable<Integer, Integer> frequency = frequencies.get(i);
					int number = vec.get(i);
					
					if (frequency.containsKey(number))
						frequency.put(number, frequency.get(number) + 1);
					else
						frequency.put(number, 1);
				}
			}

			plr.setHints(frequencies);
		}
		
		// Update renderers
		for (Component cmp : getComponents())
			if (cmp.getClass() == TileRenderer.class)
				((TileRenderer)cmp).processHints();
	}

	public void update()
	{
		// Draw the game real good
		clear();

		// Draw active player
		drawPlayer(Position.BOTTOM, d_game.getActivePlayer());
		determineHints();
		
		// Draw other players
		Vector<Player> otherPlayers = d_game.getOtherPlayers();
		Collections.reverse(otherPlayers);

		if (otherPlayers.size() == 1)
			drawPlayer(Position.TOP, otherPlayers.firstElement());
		else if (otherPlayers.size() == 2)
		{
			drawPlayer(Position.LEFT, otherPlayers.elementAt(0));
			drawPlayer(Position.RIGHT, otherPlayers.elementAt(1));
		} else {
			drawPlayer(Position.LEFT, otherPlayers.elementAt(0));
			drawPlayer(Position.TOP, otherPlayers.elementAt(1));
			drawPlayer(Position.RIGHT, otherPlayers.elementAt(2));
		}
		
		drawPiles();
		drawNumbers();
	}
	
	private void endGame()
	{
		removeAll();
		
		Player active = d_game.getActivePlayer();
		showDialog("End of game", "Congratulations <b><big>" + active.getName() + "</big></b>! You are the <b><big>winner</big></b> of this game!!!", new CustomEvent.Listener<Integer>() {
			public void customEventOccurred(CustomEvent.Event<Integer> e)
			{
				System.exit(0);
			}
		});
	}
}
