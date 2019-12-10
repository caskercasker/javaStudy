/*
 * 	String : 문자열 저장
 * 	=======
 * 	기능
 * 	1) 문자열을 분리 substring()
 * 	2) 문자 찾기	indexOf(), lastIndexOf()
 * 				c:\javaDev\javaStudy      [index는 \]
 * 
 *  3) 문자 비교	equals() ===>  대소문자 구분
 *  			equalsIgnoreCase ===> 대소문자 구분이 없는 경우
 *  4) 공백문자 제거 trim() ///아이디 입력떄 공백 값을 인식해서 날리면, 빈칸은 입력 받지 않고 아이디 입력을 대기한다. 가운데는 제거 안됨
 *  5) 대소문자 변경 toUpperCase, toLowerCase
 *  6) 모든 데이터형을 문자열로 변경 valueOf()
 *  7) 문자의 갯수 length()
 *  8) 변경 => replace, replcaceAll
 *  
 *  String ==>  char[]
 *  
 *  String 객체 주소는 4byte
 *  
   ex> 꼬꼬마
 */
public class 문자열정리 {
	public static void main(String[] args) {
	String s=" Hello Java!! ";
	System.out.println("글자수"+s.length());
	System.out.println(s.substring(0,5));
	//5는 제외
	System.out.println(s.replace("l", "k"));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s);
	System.out.println(s.trim());
	
	System.out.println(s.indexOf("l"));
	System.out.println(s.lastIndexOf("l"));
	
	String s1="Hello";
	String s2="hello";
	
	boolean res = s1.equals(s2);
	System.out.println(res);
	
	String res1=s1.equalsIgnoreCase(s2)?"같다":"다르다"; //대소문자 구분없이 비교
	
	System.out.println(res1
			);
			
	
	}
}
