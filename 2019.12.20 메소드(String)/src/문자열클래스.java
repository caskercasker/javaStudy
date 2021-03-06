// String : 문자열을 제어
/*
 *
 * java.lang => import를 생략할수있다.
 *  문자열을 저장하는 방법
 *  	1) String 변수명 = "Hello Java ";
 *  	2) String 변수명 = new String("Hello Java"); //같은 문자열 => 별도로 저장
 *  					====
 * 	 					새로운 메모리에 저장.
 * 	String 에서 제공하는 기능
 * 	1) equals : 저장된 문자열 같은지 여부 확인 (true/false)
 * 		ID, PWD ==> 로그인(대소문자 구분)
 * 		문자열은 (==)을 사용하면 않된다.(X)
 *
 * 		String s = "Hello";
 * 		String s1 = "Hello";
 * 		String s1 = new String ("Hello")
 * 		if(s==s1)	true; //문자열 주소가 같다.. 값이 같음을 비교한것이 아니라 참조한 주소값이 같다. "같은 문자열이 저장 되었기 때문에"
 		if(s.equals(s1))// value를 비교할떄 사용.
 *
 *		=> 원형
			boolean eaquals (String data)

 * 	2) substring : 문자열을 자를 때							-- 웹 페이지에서 넘치는 글자를 가져오거나, 가져오틑 데이터의 형태가 일정하지 않을 때 문자열을 자른다.
 * 			String s = "0123456789";
 * 			substring(3) => "3456789"
 * 			String s = "112분, 15세 이상 관람가"
 * 			substring(0,3) => "112"
 * 						===
 * 						end-1 ==> 0,1,2 자름
 * 			substring(int start)
 * 			substring(int start, int end)
 *
 *  3) length : 문자열 갯수
 *   	String s = "Hello 홍길동"; //c언어는 한글자당  2byte 씩 읽기 때문에 문자열의 갯수는 9
 *
 *  4) trim : 좌우의 공백문자 제거									-- 실수로 입력된 문자열의 공백을 제거한다.
 *
		String s = "Hello Java";
				=> s.length
 *  5) startWith,endWith //시작 문자열이 같은경우/ 마지막 문자열이 같은 경우  // 검색기??
 *  	startsWith("자바")
 *
 *
 *  6) indexOf, lastIndexOf  				//경로명 이 '/'로 구분되서 많이 쓴다.
 *  	문자의 위치 (indexOf:앞에서 lastIndexOf:뒤에서)
 *  	String s = "Hello Java";
 *  				0123456789
 *  	s.indexOf('a') ==>  7
 *  	s.lastIndexOf('a') ==>  9
 *
 *  7) split
 *	   String s = "이병헌, 하정우, 마동석, 전혜진, 수지";
 *	   String[] names = s.split(",")
 *		정규식
 *		====
 *		211.238.132.181
 *		211.238.142.180
 *		211.238.142.1
 *		211.238.1.1
 *		211.238.142.0
 *
 *		[0-9]{1,3}\\.[0-9]{1,3}
*
 *
 *
 *  8) toUpperCase, toLowerCase
 *  	대문자 변환, 	소문자 변환
 *  	String s= "Hello";
 *  	s.toUpperCase(s) ==> HELLO
 *  	s.toLowerCase(s) ==> hello
 *  9) replace , replaceAll ==> 정규식
 *  			String s="113분"
 *  			s.replaceAll("[^0-9]"," ")==>113 //숫자를 제외하고 모두 공백으로 바꿔라  ,, 괄호내부에서 부정 $ 끝나는..
 *  			s.replaceAll("^[0-9]"," ")  //숫자로 시작한. '^' 괄호 밖 시작 의미
 *				s.replaceAll("[^가-힣]"," ")  = 한글을 제외하고 모두 공백으로 바꿔라
 *				s.replaceAll("[^A-Za-z]"," ") = 영문을 제외하고 모두 공백으로 바꿔라.
 *
 * 10) contains() : 포함된 문자를 찾는 경우
 *
 *  	======
 *  		변경 ==>  String s="Hello Java"
 *  				s.replace('a','b') ==> "Hello Jbvb"
 *
 *
 *
 *  ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※
 *  String 은  char[] 형태가 저장된 클래스이다.
 *
 *
 */
import java.util.Scanner;

public class 문자열클래스 {
	static String[] autoComplete(String data) {
		String[] ss = {"자바와 JSP","자바 프로그래밍","스프링 5","AJAX 와 JSP","리덕스와 리액트",
						"자바 오라클","mvc 구조","코틀린과 안드로이드","코틀린 프로그램","스프링 데이터",
						"혼자배우는 자바","지능형 웹 프로그램","웹 프로그램","자바 웹프로그램","오라클 자바"};
		String[] findData = new String[10];
		int j=0;
		for (int i=0; i<ss.length;i++) {
			/*
			 * if(ss[i].startsWith(data)) { findData[j] = ss[i]; j++; }
			 */
			if(ss[i].contains(data)) {
				findData[j] = ss[i];
				j++;

			}
		}
		return findData;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력:");
		String data = scan.next();
		String[] fd =autoComplete(data);
		for(int i=0; i<fd.length; i++) {
			if(fd[i]!=null) {
				System.out.println(fd[i]);
			}
		}
	}

}
