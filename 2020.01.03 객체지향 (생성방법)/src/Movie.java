import java.awt.BorderLayout;

/*
 * JPanel => 단독으로 실행 할 수 없다.
 * 			Layout => 기본으로 (Default) FlowLayout() => 일(-)자 배열을 가지고 있음.
 *
 *
 * JFrame		Layout (default - BorderLayout())
 * JDialog		Layout (default - BorderLayout())
 *
 * 레이아웃을 이용하면 윈도우의 크기에 따라 가변형.
 *
 * GridLayout (똑같은 모양을 배치)
 */
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Movie {
	JPanel p;
	JLabel la;
	JTextField f;

	private String poster;
	private String name;
	public Movie() {
		poster = "c:\\image\\poster.jpeg";
		name = "겨울왕국 2 (2019)";

		la = new JLabel(new ImageIcon(poster)); //메모리 할당 초기화
		f = new JTextField();
		f.setText(name);

		p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center",la);
		p.add("South",f);
	}
}
