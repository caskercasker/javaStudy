/*
 * 	=====================
 * 	 1. 메소드 호출
 * 	 2. 메소드 블록으로 접근
 * 	 3. 블록 안에 있는 모든 문장 수행
 *   4. 메소드 호출한 위치로 돌아간다.
 *  =====================
 *
 *	 게시판
 *
 *	  목록출력 (페이지가 매개변수, 출력값은 목록값(배열)?) 주소를 넘길 때 숫자를 보고 매개변수로 삼는다.
 *   내용보기 (클래스를 리턴, 매개변수는 영화 고유 번호)
 *
 *   글쓰기      	}
 *   수정하기	}
 *   답변하기	}
 *   삭제하기     }	void형 목록보기로 돌아갈뿐??
 *
 *   찾기 (매개변수 검색어, 출력값(결과물 배열)
 *   //기능별로 구현...
 *
 *   ex> 로그인
 *   	매개변수는 아이디와 PWD
 *
 *   	리턴형(상수 문자열) (경우의 수에 따라) 후보 )int, char, String
 *   	1. 아이디가 없다
 *   	2. 비밀번호가 틀리다
 *   	3. 로그인 성공
 *
 *   메소드를 만들때
 *   1. 값을 넣어주고 세팅을 한다. 		set (void)
 *   2. 값을 가지고 오고 싶다. 			get (return 형 존재)
 *   3. 존재하는지 안하는지  boolean		is
 *
 *   boolean a  isLogin
 *
 */
import java.util.Scanner;

public class 메소드4 {
	static void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}

	}
	static String gugudan2(int dan) {
		String result = "";
		for(int i=1; i<=9; i++) {
			result+=dan+"*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
	static void gugudan(double d) { //오버로딩?
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d\n",d,i,d*i);
		}

	}
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력: ");
		int dan = scan.nextInt();
		//
		String res = gugudan2(dan);
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
