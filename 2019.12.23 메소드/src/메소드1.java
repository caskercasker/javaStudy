/*
 * 메소드
 * 	= 매개변수 (사용자 요청값) => 행위
 * 		movieId = 135716
 * 		movieDetail(int movieID)
 *
 *  = 리턴형 => 요청내용에 대한 결과값 전송   ======>  한개 (데이터 여러개 => 묶어서)
 *  		 =================
 *  		 기본형, 배열, 클래스
 *
 * 	==================================================================
 *  형식)
 *  	리턴형 메소드명(매개변수, ...) => 선언부
 *  	{
 *  		==> 구현부
 *  		return 결과값    ======>  (리턴형 = 결과값)
 *  				====				=====  작은 데이터형을 사용할 수 있다.
 *  	}
 *
 * 		***
 * 		int aaa()
 * 		{
 * 			return (int, char, byte, short)
 * 		} ==> return 을 생략이 되는 경우 ==> 리턴형 (void 일때)
 *
 * 		배열
 * 		int[] aaa(){
 * 			return 배열명
 * 		}
 *
 * 		type casintg  은 큰것은 가능.
 *
 * 		클래스
 * 		String aaa(){
 * 			return = " "(문자열)
 * 		}
 *
 *  	결과값이 없는 경우
 *  	void aaa() {
 *  		return;
 *  	}
 *
 * 		aaa()
 * 		===========================================================
 *
 * 		매개변수가 있는 경우
 * 		int plus(int a, int b){
 * 			a=10, b=30;
 * 			return a+b;
 * 		}
 *
 * 		int a = plus(10, 30)
 *
 * 		void aaa(){
 * 			=== 1
 * 			=== 2
 * 			=== 3
 * 			=== 4
 * 			=== 5
 * 			=== 6
 * 			=== 7
 * 		}
 *
 * 		aaa()
 *
 * 		제어문 ==> 반드시 패턴이 조재
 * 		int[] arr = {1 4 5 4 5 2 3 1 }
 * 		=============================
 * 		String s = "Hello Java"; // String 은 부분별 메소드로 관리가 가능.
 *
 */
public class 메소드1 {

	static void message() {
			System.out.println("Hello Java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드1 a = new 메소드1();
		//a.message();

	}

}
