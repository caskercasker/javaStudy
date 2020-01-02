/* ex)
 * class Sawon{
 * 		String name;
 * 		String dept;
 * 		static String company;
 * }
 * 스태틱은 다른 영역에 따로 생긴다.
 * sawon s1 = new Sawon();
 * 					======== 초기값 넣어가는 시점. 생성자를 넣는 부분.
 * 			----
 * 			메모리할당, 주소 값 입력

 * 접근할 주소 		|		실제 데이터가 들어가는 곳.
 * 스택						힙
 * 블록을 벗어나면 날라감/
 *
 * 지역변수 매개변수 밤색
 * 멤버변수 파란색
 * 스태틱 필기체.
 */

// 변수는 우선순위가 => 지역변수(메소드내 지역변수,매개변수) {}이 종료되면 사라지는 변수

class Sawon{
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;
	static String company;

//	public Sawon(int a){
//		//int sabun = 10;
//		//sabun = sabun; // 메소드 안에서는 지역변수/매개변수 가 우선순위가 높다.
//		//지역변수와 멤버변수의 이름은 같아고 구분이 된다. // 연산하는 메모리 영역이 다르기 때문에.
//
//		int a = 10;
//		this.sabun = a;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1 = new Sawon();
		s1.sabun = 1;
		s1.name = "홀길동";
		s1.dept = "개발부";
		s1.loc = "서울";
		s1.pay = 3500;
		s1.company = "SIST";

		Sawon s2 = new Sawon();
		s2.sabun = 1;
		s2.name = "홀길동";
		s2.dept = "개발부";
		s2.loc = "서울";
		s2.pay = 3500;
		s2.company = "SIST2";

		Sawon.company = "SIST3"; //클래스 이름을 통해서도 접근이 가능하다.

	}

}
