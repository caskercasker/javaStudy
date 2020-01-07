import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyRadioButton extends JFrame implements ActionListener{
	JLabel la1,la2,la3;
	JRadioButton rb1,rb2;
	JLabel la4;
	public MyRadioButton() {
		la1 = new JLabel(new ImageIcon("c:/image/movie1.jpg"));
		la2 = new JLabel(new ImageIcon("c:/image/movie2.jpg"));
		la3 = new JLabel(new ImageIcon("c:/image/movie3.jpg"));

		la4 = new JLabel("성별");
		rb1 = new JRadioButton("남자");
		rb2 = new JRadioButton("여자");
		//한개씩 선택 => 그룹으로 묶어서 처리
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		//디폴트 선택
		rb1.setSelected(true);

		JPanel p1 = new JPanel();
		p1.add(la4); p1.add(rb1); p1.add(rb2);

		JPanel p2 = new JPanel();
		p2.add(la1); p2.add(la2); p2.add(la3);

		add("North",p1);
		add("Center",p2);

		setSize(1024,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//이벤트 등록
		rb1.addActionListener(this);
		rb2.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyRadioButton();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == rb1) {
			la1.setIcon(new ImageIcon("c:/image/movie1.jpg"));
			la2.setIcon(new ImageIcon("c:/image/movie2.jpg"));
			la3.setIcon(new ImageIcon("c:/image/movie3.jpg"));

		}else if(e.getSource() == rb2) {
			la1.setIcon(new ImageIcon("c:/image/movie4.jpg"));
			la2.setIcon(new ImageIcon("c:/image/movie5.jpg"));
			la3.setIcon(new ImageIcon("c:/image/movie6.jpg"));
		}
	}

}
