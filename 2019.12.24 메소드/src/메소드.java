/*
 * 메소드
 * 1) 형식
 * 		리턴형 메소드명 (매개변수...) ==> 선언부
 * 		===
 * 		{
 * 			기능 구현
 * 			return 결과값
 * 					=== 	리턴형 == 결과값
 * 		}
 * 		==> 리턴형이 없는 경우 ==> return 을 생략할 수 있다.
 * 		==> 모든 메소드는 종료하기 위해서 반드시 마지막에 return 을 사용한다.
 * 			예외  => 조건문을 사용해서 return 을 사용 할 수 있다.
 * 			=> return 문 아래는 어떤 문장도 사용이 불가능 하다.
 * 		display(10); => 메소드 호출
 * 		static void display(String a){
 * 			System.out.prStringln(a);
 * 			if(a==10)
 * 				return;
 * 			System.out.prStringLn(a+1); //오류
 * 		}
 *  2) 리턴형 : 기본형, 클래스, 배열
 *  	String method()
 *  	Movie method()
 *  	String[] method()
 *  	결과 값이 없는 경우 => void
 *  3) 매개변수 : 사용자 요청값
 *  	=> 3개이상이면 묶어서 요청 => 배열, 클래스
 *  		회원가입(클래스)
 *  		게시판 글쓰기 (클래스)
 *
 *  4) 매개변수 전송법
 *  	=> call by value : 기본형, String
 *  	================== 메모리를 따라 생성 (복제(값))
 *  	=> call by reference : 배열, 클래스
 *  	================== 같은 주소를 이용해서 값을 변경
 *
 *  5) 호출
 * 		메소드명()
 * 		메소드면(10,20)
 * 		============ return 이 없는 경우
 * 		데이터형 변수 = 메소드()
 * 		데이터형 변수 = 메소드(19,20)
 * 	*** 모든 메소드는 수행이 종료한 다음에 다시 호출한 위치로 돌아온다.
 *  *** 메소드를 여러개 호출시 => 한개의 메소드가 수행을 종료해야
 *  					 다음 메소드를 호출
 *  	a()
 *  	b()
 *  	c()
 *  	===============
 *  		c()
 *  	===============
 *  		b()
 *  	===============
 * 			a()  		-->  수행  (동기화 방식, full stack)
 * 		===============
 *
 *
 *
 */

//매개변수 전송 -> call by value
public class 메소드 {
	static void swap(String a, String b) {
		System.out.println("변경전 => swap: a="+a+",b="+b);
		//System.out.prStringln("변경전 :");
		//변경
		String temp = a;
		a=b;
		b=temp;

		System.out.println("변경후 =>swap : a="+a+",b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="HELLO";
		String b="JAVA";
		swap(a,b);
		System.out.println("main: a="+a+",b="+b);
	}

}
