import java.util.*;

class Player {
	private String d_name;
	private boolean d_turn;
	private Vector<Tile> d_tiles;
	private Tile d_aside;

	public Player(String nm) {
		d_tiles = new Vector<Tile>();
		d_name = nm;
	}
	
	// A tile can be added to the list in the correct position (low to high, black-white)
	public void addTile(Tile nw) {
		for (int i = 0; i < d_tiles.size(); i++) {
			Tile temp = d_tiles.get(i);
			
			if (nw.getValue() < temp.getValue())
			{
				d_tiles.insertElementAt(nw, i);
				break;
			}

			if (nw.getValue() == temp.getValue()) {
				if (nw.getBlack())
					d_tiles.insertElementAt(nw, i);
				else
					d_tiles.insertElementAt(nw, i + 1);
				
				break;
			}
		}

		if (!d_tiles.contains(nw))
			d_tiles.add(nw);
	} //addTile

	public void setTurn(boolean turn) {
		d_turn = turn;
	}	

	public boolean getTurn() {
		return d_turn;
	}

	public Vector<Tile> getTiles() {
		return d_tiles;
	}

	public String getName() {
		return d_name;
	}

	public void setAside(Tile aside) {
		d_aside = aside;
	}

	public Tile getAside() {
		return d_aside;
	}
	
	public void turnDone(boolean ok)
	{
		if (d_aside == null)
			return;
		
		d_aside.setOpen(!ok);
		addTile(d_aside);
		d_aside = null;
	}
	
	public void setHints(Vector<Hashtable<Integer, Integer>> frequencies)
	{
		for (int i = 0; i < frequencies.size(); i++)
			d_tiles.get(i).setHint(frequencies.get(i));
	}
	
	public void printTiles()
	{
		System.out.print(d_name + ": ");
		
		for (Tile tile : d_tiles)
		{
			if (tile.getBlack())
				System.out.print("b");
			else
				System.out.print("w");

			System.out.print(tile.getValue() + ", ");
		}
		
		System.out.println("\n");
	}

} //class Player
