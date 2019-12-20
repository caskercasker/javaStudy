import java.lang.*;
import java.util.*;

class Tile implements Cloneable {

	private boolean black;
	private boolean open;
	private int value;
	private Hashtable<Integer, Float> d_hints;
	public static float MIN_PERC = 0.1f;

	public Tile(boolean blk, boolean opn, int val) {
		black = blk;
		open = opn;
		value = val;
	}

	public void setOpen(boolean val) {
		open = val;
	}

	public boolean getOpen() {
		return open;
	}
	
	public boolean getBlack() {
		return black;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	private int totalHints(Hashtable<Integer, Integer> hints)
	{
		if (hints == null)
			return 0;

		int result = 0;
		
		for (Integer freq : hints.values())
			result += freq;
		
		return result;
	}
	
	public void setHint(Hashtable<Integer, Integer> hints)
	{
		if (hints == null)
		{
			d_hints = null;
			return;
		}
		
		// Normalize
		int total = totalHints(hints);
		d_hints = new Hashtable<Integer, Float>();
		
		for (Enumeration e = hints.keys(); e.hasMoreElements();)
		{
			Integer key = (Integer)e.nextElement();
			
			float perc = hints.get(key) / (float)total;
			
			if (perc > MIN_PERC)
				d_hints.put(key, perc);
		}
	}
	
	public Hashtable<Integer, Float> getHint()
	{
		return d_hints;
	}	

	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	public String toString()
	{
		return "[Tile; n: " + value + ", b: " + black + ", o: " + open + "]";
	}
}
