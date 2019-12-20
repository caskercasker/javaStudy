import java.util.Map;
import java.util.Vector;

import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.JPL;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

public class Prolog
{
	public static void init()
	{
		String[] args = {
			"pl",
			"-g", "true",
			"-nosignals",
			"-q"
		};

		JPL.init(args);

		consult("game.pl");
	}

	public static boolean consult(String filename)
	{
		Atom file = new Atom("../prolog/" + filename);
		Query q = new Query(new Compound("consult", new Term[] {file}));

		return q.hasSolution();
	}

	public static boolean makePlayers(int numPlayers)
	{
		org.jpl7.Integer num = new org.jpl7.Integer(numPlayers);


		Compound set_agents = new Compound("set_agents", new Term[] {num});
		Query q = new Query(set_agents);

		return q.hasSolution();
	}

	private static Compound createStone(int number, boolean open, boolean black)
	{
		Atom state;
		Atom colour;

		if (open)
			state = new Atom("open");
		else
			state = new Atom("closed");

		if (black)
			colour = new Atom("black");
		else
			colour = new Atom("white");

		org.jpl7.Integer num = new org.jpl7.Integer(number);

		return new Compound("stone", new Term[] {colour, num, state});
	}

	public static boolean addTile(int playerIndex, int number, boolean open, boolean black)
	{
		org.jpl7.Integer idx = new org.jpl7.Integer(playerIndex);
		Compound add_stone = new Compound("add_stone", new Term[]{idx, createStone(number, open, black)});

		Query q = new Query(add_stone);
		return q.hasSolution();
	}

	public static boolean addTile(int playerIndex, Tile tile)
	{
		//System.out.println("Adding tile: " + playerIndex + ", " + tile);
		return addTile(playerIndex, tile.getValue(), tile.getOpen(), tile.getBlack());
	}

	public static boolean guessed(int playerIndex, int number, boolean black)
	{
		// playerIndex guessed something, so he/she can't have the tile
		// him/her self
		Variable Agent = new Variable("_");
		Variable Position = new Variable("_");
		org.jpl7.Integer Target = new org.jpl7.Integer(playerIndex);
		org.jpl7.Integer Number = new org.jpl7.Integer(number);

		Atom Colour;
		if (black)
			Colour = new Atom("black");
		else
			Colour = new Atom("white");

		Compound is_stone = new Compound("is_stone", new Term[] {Target, Position, Colour, Number});
		Compound not = new Compound("not", new Term[] {is_stone});
		Compound knows = new Compound("knows", new Term[] {Agent, not});
		Compound as = new Compound("assert", new Term[] {knows});

		Query q = new Query(as);

		return q.hasSolution();
	}

	public static Vector<Vector<java.lang.Integer>> sequences(int requestIndex, int targetIndex)
	{
		//System.out.println("Sequencing: " + requestIndex + ", " + targetIndex);
		Variable Sequence = new Variable("Sequence");
		org.jpl7.Integer req = new org.jpl7.Integer(requestIndex);
		org.jpl7.Integer tar = new org.jpl7.Integer(targetIndex);

		Compound sequence = new Compound("sequence", new Term[] {req, tar, Sequence});
		Query q = new Query(sequence);

		Vector<Vector<java.lang.Integer>> result = new Vector<Vector<java.lang.Integer>>();
		//q.allSolutions()

		for (Map<String, Term> binding : q.allSolutions() )
		{
			Term t = binding.get("Sequence");
			Term[] terms = t.toTermArray();

			Vector<java.lang.Integer> items = new Vector<java.lang.Integer>();

			for (Term term : terms)
				items.add(term.arg(2).intValue());

			result.add(items);
		}

		return result;
	}

	private static Compound createIsStone(int targetIndex, int tileIndex, int number, boolean black)
	{
		Atom colour;

		if (black)
			colour = new Atom("black");
		else
			colour = new Atom("white");

		return new Compound("is_stone", new Term[] {new org.jpl7.Integer(targetIndex), new org.jpl7.Integer(tileIndex), colour, new org.jpl7.Integer(number)});
	}

	public static boolean failedGuess(int targetIndex, int tileIndex, int number, boolean black)
	{
		//System.out.println("Guess failed: target: " + targetIndex + ", tile: " + tileIndex + ", number: " + number + ", black: " + black);
		Variable Agent = new Variable("_");
		Compound not = new Compound("not", new Term[] {createIsStone(targetIndex, tileIndex, number, black)});
		Compound knows = new Compound("knows", new Term[] {Agent, not});
		Compound as = new Compound("assert", new Term[] {knows});

		Query q = new Query(as);
		return q.hasSolution();
	}

	public static boolean setTileOpen(int targetIndex, int tileIndex)
	{
		//System.out.println("Setting tile open. target: " + targetIndex + ", tile: " + tileIndex);
		org.jpl7.Integer Agent = new org.jpl7.Integer(targetIndex);
		org.jpl7.Integer Position = new org.jpl7.Integer(tileIndex);

		Compound set_stone_open = new Compound("set_stone_open", new Term[] {Agent, Position});
		Query q = new Query(set_stone_open);

		return q.hasSolution();
	}
}
