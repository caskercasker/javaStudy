import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class MainClass5 extends JFrame implements MouseListener{
							// 웹
	JTextField tf1,tf2,tf3; // <input type=text>
	JLabel la;				// <label>
	JComboBox box;			// <select>
	public MainClass5() {
		tf1 = new JTextField(9);
		tf2 = new JTextField(9);
		tf3 = new JTextField(9);
		la = new JLabel("=");
		box = new JComboBox();
		box.addItem("+");
		box.addItem("-");
		box.addItem("*");
		box.addItem("/");

		setLayout(new FlowLayout()); // -자 배치

		add(tf1);
		add(box);
		add(tf2);
		add(la);
		add(tf3);

		setSize(450, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		la.addMouseListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la) {
			String num1=tf1.getText();
			String num2=tf2.getText();

			String op=box.getSelectedItem().toString();

			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int n3 = 0;

			switch(op) {
			case "+":
				n3=n1+n2;
				break;
			case "-":
				n3=n1-n2;
				break;
			case "*":
				n3=n1*n2;
				break;
			case "/":
				n3=n1/n2;
				break;
			}

			tf3.setText(String.valueOf(n3));

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
