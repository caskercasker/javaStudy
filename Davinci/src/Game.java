import java.util.Vector;

class Game {

	private Vector<Player> d_players; //A vector filled with Player objects.
	private Vector<Tile> d_pile; //A vector filled with Tiles, the tiles still on the table.
	private Player d_activePlayer;

	public Game () {
		d_pile = new Vector<Tile>();
		d_players = new Vector<Player>();

		initPile();
	}

	public Player addPlayer(String nm) {
		Player plr = new Player(nm);
		d_players.add(plr);

		if (d_activePlayer == null)
			d_activePlayer = plr;

		return plr;
	}

	void initPile() {
		for (int i = 0; i <= 11; i++) {
			Tile nwtileB = new Tile(true, false, i);
			Tile nwtileW = new Tile(false, false, i);

			d_pile.add(nwtileB);
			d_pile.add(nwtileW);
		}
	}

	public Tile giveTile(Player tmp) {
		// get tile from pile on table
		double size = d_pile.size();
		double random = Math.random();
		int number = (int) Math.round(random * (size - 1));

		Tile tile = d_pile.get(number);

		tmp.setAside(tile);
		d_pile.remove(number);

		return tile;
	}

	public Tile giveTile(Player tmp, boolean black) {
		// get tile from pile on table (of a specific color)
		double size = d_pile.size();
		double random = Math.random();
		int number = (int) Math.round(random * (size - 1));
		Tile temp = d_pile.get(number);
		if (temp.getBlack() == black){
			tmp.setAside(temp);
			d_pile.remove(number);

			return temp;
		}
		else {
			return giveTile(tmp, black);
		}
	}

	public void turnDone(Player plr, boolean ok)
	{
		plr.turnDone(ok);
	}

	public Vector<Player> getPlayers() {
		return d_players;
	}

	public Player getActivePlayer() {
		return d_activePlayer;
	}

	public void setActivePlayer(Player plr) {
		d_activePlayer = plr;
	}

	public void nextTurn() {
		if (d_activePlayer == null)
			d_activePlayer = d_players.firstElement();
		else {
			int index = d_players.indexOf(d_activePlayer);

			if (index == d_players.size() - 1)
				d_activePlayer = d_players.firstElement();
			else
				d_activePlayer = d_players.elementAt(index + 1);
		}
	}

	public Vector<Player> getOtherPlayers() {
		Vector<Player> result = new Vector<Player>();

		for (int i = d_players.indexOf(d_activePlayer) + 1; i < d_players.size(); i++)
			result.add(d_players.get(i));

		for (int i = 0; i < d_players.indexOf(d_activePlayer); i++)
			result.add(d_players.get(i));

		return result;
	}

	public int getNumTiles(boolean black) //!!!!
	{
		int result = 0;

		for (Tile tile : d_pile)
		{
			if (tile.getBlack() == black)
				result++;
		}

		return result;
	}

	public int getNumTiles()
	{
		return d_pile.size();
	}

	private boolean checkPlayer(Player plr)
	{
		for (Tile tile : plr.getTiles())
			if (!tile.getOpen())
				return false;

		return true;
	}

	public boolean checkDone()
	{
		for (Player plr : d_players)
		{
			if (checkPlayer(plr))
				return true;
		}

		return false;
	}


	/*
	public void printPile(GUI g) {
		String pl = "";
		for (int i = 0; i < pile.size(); i++) {
			pl = pl + "\t" + pile.get(i);
		}
		g.writeText(pl);
	}
	*/


}
