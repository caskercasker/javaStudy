import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * interface ==> implements 인터페이스명
 * =========
 * 		다중 상속이 가능
 *
 * 		interface A
 * 		interface B
 * 		class C implements A,B,....
 */
//class MyEvent  {
//
//	public void actionPerformed(ActionEvent e) {
//	// TODO Auto-generated method stub
//
//	}
//
//}
public class MyTextField extends JFrame implements ActionListener {
	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	public MyTextField() {

		ta.setEditable(false); //편집여부를 (false)
		JScrollPane js = new JScrollPane(ta);//스크롤 바에 좌우 위아래 포함된 형태 ScrollPane
		add("Center",js);
		add("South",tf);
		setSize(350, 450);
		setVisible(true);

		//이벤트 등록
		tf.addActionListener(this);//actionperformed 의 위치는? this or super
									//Myevent의 actionPerformed 를 불러 올 수도 있다.
									//엔터시에 이벤트 발생
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTextField();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf) {	//엔터를 친 textfield 가 뭐냐?
			ta.append(tf.getText()+"\n");
			// append(문자열 결합), setText(새로운 문자만 출력)
			//tg.getText() 입력된 문자를 읽어온다.
			//ta.setText(tf.getText()+"\n");
			tf.setText("");
		}
	}

}
