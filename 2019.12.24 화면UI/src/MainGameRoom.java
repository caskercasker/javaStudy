import javax.swing.JPanel;
import javax.swing.JTextPane;

public class MainGameRoom extends JPanel{
	//JTable table1, table2;
	JPanel jp;
	JTextPane tp;


	MainGameRoom() {
		jp = new JPanel();
		tp = new JTextPane();
		//jp.setLayout(new GridLayout(3,2,5,5));
		//jp.setBounds(10,50,600,400);
		//jp.setBackground(Color.white);
		tp.setBounds(68, 650, 180, 30);
		setLayout(null);
		//tp.setBounds(10, 15, 600, 400);
		//tp.setBackground(Color.green);
		add(tp);
		add(jp);
	}

}
