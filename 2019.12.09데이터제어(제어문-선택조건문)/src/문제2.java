/*
 *  정수 두개와 연산자를 받아서 사칙 연산
 *
 *  첫번째 정수 입력 : 10
 *  두번쨰 정수 입력 : 20
 *  연산자 입력 : +
 *
 *
 *
 */
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0;
		double b = 0;
		double result = 0;
		String op= "";

		//double test = 50/20.0;
		//System.out.println(test);

		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수입력");
		a = scan.nextInt();
		System.out.println("두번째 정수입력");
		b = scan.nextInt();

		System.out.println("연산자 입력");
		op = scan.next(); //연산자 입력

		char c = op.charAt(0);

		if(c=='+') {
			result = a + b;
			System.out.println(" + 결과값은 "+result);
		}if(c=='-') {
			result = a - b;
			System.out.println("- 결과값은 "+result);
		}
		if(c=='*') {
			result = a * b;
			System.out.println(" * 결과값은 "+result);
		}if(c== '/') {
			if (b==0) {
				System.out.println("ERROR");
			}
			result = a / b;
			System.out.println(" / 결과값은"+result);
		}

		//
		 System.out.println(10/20);

			//System.out.println();

	}

}
