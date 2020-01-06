import java.awt.BorderLayout;

/*
 * JPanel => �ܵ����� ���� �� �� ����.
 * 			Layout => �⺻���� (Default) FlowLayout() => ��(-)�� �迭�� ������ ����.
 *
 *
 * JFrame		Layout (default - BorderLayout())
 * JDialog		Layout (default - BorderLayout())
 *
 * ���̾ƿ��� �̿��ϸ� �������� ũ�⿡ ���� ������.
 *
 * GridLayout (�Ȱ��� ����� ��ġ)
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
		name = "�ܿ�ձ� 2 (2019)";

		la = new JLabel(new ImageIcon(poster)); //�޸� �Ҵ� �ʱ�ȭ
		f = new JTextField();
		f.setText(name);

		p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center",la);
		p.add("South",f);
	}
}
