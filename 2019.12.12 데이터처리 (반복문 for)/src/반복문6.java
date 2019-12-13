/*
 *
 * 	알파벳을 대문자
 *  DDD => AAA
 *  ZZZ => WWW
 */
import java.util.Scanner;
public class 반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("입력");
		Scanner scan = new Scanner(System.in);
		String s = "" ;
		s = scan.next();
		System.out.println("입력");

		for(int i=0 ; i<=s.length() ;i++) {

			char c = (char) (s.charAt(i)-3);
			System.out.println(c);

		}



	}

}
