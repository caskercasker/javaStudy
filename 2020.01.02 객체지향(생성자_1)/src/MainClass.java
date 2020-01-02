/* 	클래스의 구성요소
 * 	=================
 * 	변수 (전역변수, 멤버변수)
 * 	=> 다른 클래스에서 사용이 가능
 * 	=> 메모리에서 해제되는 시점이 프로그램 종료시
 * 		(메모리 => heap)
 * 	==================
 * 	생성자 : 멤버변수에 대한 초기화 담당
 * 	특징)		1.클래스명과 동일
 * 			2. 리턴형이 없다(void는 리턴형)
 * 			3. 생성자는 여러개 만들 수 있고
 * 				사용하지 않을 수도 있다. =====> JVM이 자동으로 생성자를 생성..........
 * 			4. 오버로딩을 지원한다.
 * 				======
 * 				1) 한개의 클래스 안에서 같은 이름의 메소드를 여러개 사용
 * 					=========
 * 				2) 매개변수가 다르다.(매개변수의 데이터형이 다르다, 갯수가 틀리면 다른 메소드를 인식)
 * 				3) 리턴형은 관계없다.
 * 					void display()
 * 					int display() 		같은 메소드로 판단.
 * 				4) 기능이 같다.
 * 					plus(int a, int b)
 * 					plus(double d1, double d2)
 *
 * 			5. 상속 예외 조건 (생성자 ,static) 재사용이 불가능
 *
 * 생성자도 메소드
 * EX> 윈도우를 그릴떄 시작 (setVisible, Set title)
 * 생성자에서 구현 할수도 있고, 메소드에서 시작할수도 있다 (생성자에서 구현하게 되면 재사용이 불가능, 상속받지 못하기 때문에)
 * =====================
 * 	===> 명령문의 집합 => 관련된 명령을 모아서 처리  (구조적 프로그램)
 * 	 메소드 : 멤버변수를 활용 => 기능
 * 		   연산처리 = 제어문 처리
 * 		  => 사용자 요청을 처리
 * =====================
 */
public class MainClass {
	String name="홍길동";
	String sex = "남자";
	int age = 30;
	//초기화 => MainClass mc = new MainClass()
	public MainClass() {
		// 초기화 ==> 윈도우, 네트워크, 데이터베이스
		name = "심청이";
		sex = "여자";
		age = 25;
	}
	//매개변수를 가지고 있는 생성자(오버로딩)
	public MainClass(String sex, String name, int age) {
		// 지역변수 우선..
		// 지역변수 멤버변수 동일 ==> 지역변수가 우선 적용
		this.name = name;
		this.sex = sex;
		this.age = age;
		// 자신의 객체 주소 => this => 반드시 메소드 안에서만 사용이 가능.

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MainClass mc = new MainClass(); //static이 아닌 변수는 저장공간을 별도로 만들어서 저장해야 한다(new)
		 * //생성자는 호출시 반드시 new를 동반한다. System.out.println(mc.name);
		 * System.out.println(mc.sex); System.out.println(mc.age);
		 */
		MainClass mc = new MainClass("여자","심청이",25);
		System.out.println(mc.name);
		System.out.println(mc.sex);
		System.out.println(mc.age);

		System.out.println(new MainClass("남자","박문수",10).name);

		//new를 쓰면 this가 가지고 있는 주소값이 달라진다?


	}

}
