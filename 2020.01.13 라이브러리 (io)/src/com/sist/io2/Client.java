package com.sist.io2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame implements ActionListener,Runnable{
	JTextArea ta;
	JTextField tf;
	JButton b;

	//서버
	Socket s;	//서버의 정보를 가지고 있다.
	OutputStream out;	//서버로 데이터 전송 위치
	BufferedReader in;  //서버로부터 데이터를 읽어 오는 위치
	public Client() {
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		ta.setEnabled(false);

		tf = new JTextField(20);
		b = new JButton("접속");
		JPanel p = new JPanel();
		p.add(tf);
		p.add(b);

		tf.setEnabled(false);
		add("Center",js);
		add("South",p);

		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		b.addActionListener(this);
		tf.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			try {
				//연결
				s = new Socket("211.238.142.199",8888);
				out = s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//서버로 부터 값을 읽어온다.
				b.setEnabled(false);
				tf.setEnabled(true);
				tf.requestFocus();

				new Thread(this).start();
			}catch(Exception ex) {}
		}
		else if(e.getSource()==tf) {
			String msg=tf.getText();
			if(msg.length()<1)
				return;
			try {
				out.write((msg+"\n").getBytes());
				tf.setText("");
			}catch(Exception ex) {}
		}
	}

	//서버에서 들어오는 값을 받아서 출력
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				String msg = in.readLine(); //서버에서 값을 받아온다.
				System.out.println(msg);
				ta.append(msg+"\n");
			}catch (Exception ex) {}
		}
	}

}
