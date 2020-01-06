import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass6 extends JFrame implements ActionListener,MouseListener {
	JButton b = new JButton("Click");
	public MainClass6() {
		//배치
		add("North",b);
		setSize(480, 300);
		setVisible(true);
		//b.addActionListener(this); //버튼 액션
		b.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass6();
	}

	@Override //버튼을 누르면 자동 처리 하는 콜백함수
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			System.out.println("B버튼 클릭!!");
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			System.out.println("마우스 버튼  클릭!!");
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
