/*
 *
 * 	���ĺ��� �빮��
 *  DDD => AAA
 *  ZZZ => WWW
 */
import java.util.Scanner;
public class �ݺ���6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Է�");
		Scanner scan = new Scanner(System.in);
		String s = "" ;
		s = scan.next();
		System.out.println("�Է�");

		for(int i=0 ; i<=s.length() ;i++) {

			char c = (char) (s.charAt(i)-3);
			System.out.println(c);

		}



	}

}
