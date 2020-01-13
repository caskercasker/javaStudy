/*
 * 	Wrapper 클래스
 * 	=======
 * 	기본형  (int, long ..) 쉽게 제어가 가능하게 만들어진 클래스
 *  int ===> Integer		==> BOXING, AUTOBOXING
 *  Integer ii = new Integer(10);
 *  int i = ii.valueOf();
 *  int i = ii;
 *  Integer ii = 10; //데이터형에 클래스를 넣을때
 *
 *  double ===> Double
 *  byte ====> Byte
 *  boolean ===> Boolean
 *
 *  ==> String s= "100";
 *  	int i=(int)s;
 *
 */

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer a = new Integer(10);
//		int i = a;
//		int k = 1000;
//		Integer kk=k;
//		//AutoBoxing 자동으로 클래스와 데이터형을 변환함.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력");
//		String no1 = scan.next();
//
//		System.out.print("정수 입력");
//		String no2 = scan.next();
//		//문자열 숫자 변환에는 공백을 제거
//		System.out.println(Integer.parseInt(no1)+Integer.parseInt(no2));
//
//		Integer b = 1;
//		Integer c;
//		c = a+b;
//		System.out.println(c);
//	}
		String s = "true";
		if(Boolean.parseBoolean(s)) { //s.equals 도 가능 ,static 메소드 메모리 할당 없이 사용
			//새로 생성 없이 도트연산자로 바로 참조가 바로 되면 static 메소드
			System.out.println("출력");
		}
		String score="4.5";
		System.out.println(Double.parseDouble(score)+1);
		boolean b= true;
		System.out.println(String.valueOf(b)); //String 클래스의 유일한 Static 메소드
	}
}
