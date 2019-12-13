/*
 * 	for : 반복문( 반복횟수가 지정)
 * 	====
 * 	일반 for
 * 		형식)
 * 			for(초기값;조건식;증가식)
 * 				실행문장
 *
 * 			=> 초기값 => 조건식 => 실행문장 => 증가식 => 조건식
 *
 * 			= 초기값  ==> 0
 * 			= 실행문장의 범위
 * 				==============> 한문장{}(x),여러문장{}(o)
 * 			= 증가식 ==> 1개씩,
 * 			= 변수가 1개 이상
				for(int i=0,j=1; i<=1 && j>=1;......
			= for(int i=0;.....) => 지역변수 i는 for 안에서만 사용)
			변수선언
						{
						변수선언
						}
 * 	향상된 for(jdk1.5이상) : 배열, 컬렉션(데이터베이스)
 *
 *  ====
 *  메소드(일반메소드,람다식(함수포인터):JDK1.8)
 *
 *
 */
public class 반복문1 {

	public static void main(String[] args) { //public static 순서 바꾸기 가능
		// TODO Auto-generated method stub
		int i=1;
		for(i=1; i<=10; i++) {
			System.out.println("i="+i);
		}
		System.out.println("i="+i);
		/*
		 * ABCD
		 * EFGH
		 * IJKL
		 * MNOP
		 *
		 * ABCD
		 * ABCD
		 * ABCD
		 * ABCD

		char c = 'A';
		for(int i=1; i<=4; i++) {
			for (int j=1;j<=4; j++) {
				System.out.println(c++);
			}
		}
	}*/
	}
}
