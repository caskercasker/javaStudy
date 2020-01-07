/*
 * 클래스의 종류
 * =========
 * 1. 추상클래스 : 설계 => 구현하지 않은 메소드를 포함하고 있다.
 * 				공통점을 모아두고 => 해당 프로그램에서 구현
 * 				1) 서로 다른 클래스를 연결
 * 				2) 여러개 클래스를 모아서 관리
 * 				3) 표준화 (독립적 사용)
 * 		public abstract class ClassName{
 * 			일반변수
 * 			int a=10;
 * 			구현된 메소드
 * 			public void display(){
 * 				====
 * 			}
 * 			구현이 안된 메소드
 * 			public abstract int disp();
 * 		}
 * 		=> 미완성된 클래스 => 자신이 메모리 할당을 할 수 없다. (new 를 사용할 수 없다)
 * 						생성시에는 반드시 구현한 하위클래스를 통해서 생성이 가능
 * 		예)
 * 			public abstract class A{
 * 				구현이 안된 메소드
 * 			}
 * 			public class B extends A{
 * 				상속시에 반드시 구현해서 사용
 * 			}
 * 			B b = new B();
 * 			A a = new A(); (X)
 * 			A a = new B(); (표준)
 *
 * 			===============> 클래스 객체 생성
 * 							  ==========
 * 								new가 없다, 같은 생성자를 사용하지 않으면 추상클래스, 인터페이스
 * 								List list = new ArrayList();
 * 2. 인터페이스 : 추상클래스의 일종
 * 				서로 다른 클래스 연결
 * 				표준화 작업 (구현은 틀릴수도 있다)
 * 				여러개의 관련된 클래스를 묶어서 제어
 * 		public interface Interface명 {
 * 			변수
 * 			int a=10;			===> public static final int a=10; (상수형 변수)
 * 									====================
 * 									생략할 수 있다.
 * 			메소드 (구현이 안된 메소드)
 * 			void display(); 		====> public abstract void display();
 * 										  =================
 * 			public void disp();		====> public (abstract) void disp();
 * 		}
 * 		===> 라이브러리
 * 			 Swing => 이벤트 처리
 * 			 ================
 * 			 컴포넌트
 * 				JButton
 * 					=> JButton	=> JButton, JMenu,
 * 					=> ToggleButton => JRadioButton, JCheckBox
 * 				================================================
 * 						=> 처리 => interface : ActionListener
 * 								=> actionPerformed()
 * 				입력창
 * 					한줄
 * 						JTextField => JPasswrdField
 * 					여러줄
 * 						JTextArea(메모장) = > JTextPane(한글문서)
 *  			================================================
 * 						=> 처리 => interface : ActionListener
 * 								=> actionPerformed()
 * 				목록출력
 * 					JTable	=> MouseListener
 * 					JTree	=> MouseListener
 * 					JList	=> ItemListener
 * 					JComboBox	=> ItemListener
 * 				================================================ Key Listener
 * 					    =======
 * 						1) 자동 호출
 * 						2) 지정된 메소드
 * 			데이터베이스 => DB
 * 			Collection map (키값과 내용이 연결되어 있어, 키값으로 데이터를 구분) Spring
 * 					   set (중복이 허용이 안된 값들이 널려있음 ) -> 트리
 * 					   list (인덱스로 구분, 중복 허용)
 *
 * 3. 내부클래스
 * 		= 멤버 클래스 : 쓰레드 사용시   	(윈도우에 관련된 모든 일을 하기 위한 쓰레드)
 * 			public class A	{
 * 				O X => 자원
 * 				class B{
 * 				}
 * 			}
 * 		= 익명의 클래스 : 상속없이 오버라이딩, 메소드 추가가 가능
 * 			스프링에서 많이 쓴다? 상속을 받지 않고 행하기 위해서?
 *
 * 			public class A{
 * 				B b = new B(){
 * 					public void display(){}
 * 					public int plus(){}
 * 				};
 * 			}
 * 			public class B{
 * 				public void display(){}
 * 			}
 * 		= 지역 틀래스
 * 			public class A{
 * 				public void display(){
 * 					class B{
 * 					}
 * 				}
 * 			}
 * 4. 종단 클래스
 * 		public final class A{
 * 		}
 */

//메모리에 저장(할당) 조건 => 모든 메소드가 구현
abstract class Ani{
	public abstract void walking();
	public abstract void eating();
	//반드시 구현이 되어야할 부분
	public void setName() {
		System.out.println("");
	}
	//있을지 없을지 알수 없는 부분 필요하면 오버라이딩 혹은 활용
	//필요시에 재정의(오버라이딩)
}
class Human extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("사람이 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("사람이 먹는다");
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		System.out.println("홍길동이다");
	}
}

class Dog extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("개가 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("개같이 먹는다");
	}

}
class Pig extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("돼지가 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("돼지가 먹는다");
	}

}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ani ani = new Human();
		ani.walking();
		ani.eating();
		ani.setName();

		ani = new Dog();
		ani.walking();
		ani.eating();
		ani.setName();

		ani = new Pig();
		ani.walking();
		ani.eating();
		ani.setName();

	}
}
