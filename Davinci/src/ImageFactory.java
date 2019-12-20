import javax.swing.ImageIcon;
import java.util.Hashtable;

public class ImageFactory {
	private static Hashtable<String, ImageIcon> s_icons;
	
	private static void Add(String filename) {
		ImageIcon icon = new ImageIcon("images/" + filename);
		s_icons.put(filename, icon);		
	}
	
	public static ImageIcon Image(String filename) {
		if (s_icons == null)
			s_icons = new Hashtable<String, ImageIcon>();

		if (!s_icons.containsKey(filename))
			Add(filename);
		
		return s_icons.get(filename);
	}
}
