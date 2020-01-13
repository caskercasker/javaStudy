package com.sist.io2;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame{
	JTextArea ta;
	JTextField tf;
	JButton b;
	public Client() {
		ta = new JTextArea();
		JScrollPane js = new JScrollPane();
		ta.setEnabled(false);

		tf = new JTextField(20);
		b = new JButton("Á¢¼Ó");
		JPanel p = new JPanel();
		p.add(tf);
		p.add(ta);

		tf.setEnabled(false);
		add("Center",js);
		add("South",p);

		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();

	}

}
