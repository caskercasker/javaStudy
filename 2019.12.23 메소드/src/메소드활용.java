import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//JFrame (윈도우) ==>
public class 메소드활용 extends JFrame{
	JLabel la = new JLabel("나이");
	JTextField tf = new JTextField(10);
	메소드활용(){
		setLayout(new FlowLayout());
		add(la);
		add(tf);
		tf.setText(String.valueOf(100)); //tf 에 그냥 숫자를 못들어 간다. 문자로 변환 시켜줘야 함.0
		setSize(350,30);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 메소드활용();
	}

}
