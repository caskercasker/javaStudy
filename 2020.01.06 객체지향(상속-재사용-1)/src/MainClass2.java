/*	상속에서 static 은 제외되지만 상수는 제외되지 않는다.
 *	상수를 상속받는다.
 *  추상클래스의 존재 의미. 메소드의 선언만 이루어져 있고
 *  내부 구현은 상속을 받는 클래스의 몫 (추상클래스의 발전 형태 인터페이스)

 자동호출(콜백함수?)
 */

import javax.swing.JFrame;
public class MainClass2 extends JFrame {
	public MainClass2() {
		setSize(800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new MainClass2();
		//
	}

}
