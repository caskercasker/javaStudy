/*	구문에서 생략되어 있는 요소
 * 	1) extends Object
 * 	2) 생성자
 * 	3) 메소드 void => return
 *  4) import java.lang
 *  5) interface
 *  	void dips(); ==> public abstract void disp();
 *  	int a = 10 	 ==> public static final int a=10;
 *
 *		setBacgkground(new Color(0,0,0,1)) R G B alpha(투명도, 1불투명)
 *
 */
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainClass3 extends JFrame implements ItemListener {
	JLabel la1, la2,la3;
	JComboBox box = new JComboBox();
	public MainClass3() {
		la1 = new JLabel("선택"); //기본 투명모드
 		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("박문수");
		la2=new JLabel("");
		la3=new JLabel("");

		la2.setFont(new Font("굴림체",Font.BOLD,35));

		JPanel p = new JPanel(); //기본 불투명 모드
		p.add(la1);
		p.add(box);

		add("North",p);
		add("West",la3);
		add("Center",la2);
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		box.addItemListener(this);;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass3();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == box) {
			String name = box.getSelectedItem().toString();
			la2.setText(name);
		}
	}

}
