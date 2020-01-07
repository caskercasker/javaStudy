import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * interface ==> implements �������̽���
 * =========
 * 		���� ����� ����
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

		ta.setEditable(false); //�������θ� (false)
		JScrollPane js = new JScrollPane(ta);//��ũ�� �ٿ� �¿� ���Ʒ� ���Ե� ���� ScrollPane
		add("Center",js);
		add("South",tf);
		setSize(350, 450);
		setVisible(true);

		//�̺�Ʈ ���
		tf.addActionListener(this);//actionperformed �� ��ġ��? this or super
									//Myevent�� actionPerformed �� �ҷ� �� ���� �ִ�.
									//���ͽÿ� �̺�Ʈ �߻�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTextField();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf) {	//���͸� ģ textfield �� ����?
			ta.append(tf.getText()+"\n");
			// append(���ڿ� ����), setText(���ο� ���ڸ� ���)
			//tg.getText() �Էµ� ���ڸ� �о�´�.
			//ta.setText(tf.getText()+"\n");
			tf.setText("");
		}
	}

}
