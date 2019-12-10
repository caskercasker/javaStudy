import java.util.Scanner;

// 정수2개를 입력 받아서 ==> 연산자 1개 ==> 사칙연산
// 자바 => 입력 받는 경우에 ==> char(불가능), String
// String => (==), equals
// int a = (int)"10"
// Integer.parseInt("10") 문자열을 정수 값으로 변환 하기.
public class 다중조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s1= new String("Hello"); String s2 = new String("Hello");
		 *
		 * if(s1.equals(s2)) { System.out.println("s1==s2"); } else {
		 * System.out.println("s1!=s2"); }
		 *
		 * if(s1==s2) { System.out.println("s1==s2"); } else {
		 * System.out.println("s1!=s2"); }
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번쨰 정수:");
		int num1=scan.nextInt();

		System.out.println("두번째정수");
		int num2 = scan.nextInt();

		System.out.println("연산자(+,-,*,/):");
		String op = scan.next();

		//처리
		// 결과값 출력
		if(op.equals("+")) {
			System.out.printf(("%d+%d=%d\n"),num1,num2,num1+num2);
		}else if (op.equals("-")) {
			System.out.printf(("%d-%d=%d\n"),num1,num2,num1-num2);

		}else if (op.equals("*")) {
			System.out.printf(("%d*%d=%d\n"),num1,num2,num1*num2);

		}else if (op.contentEquals("/")) {
			if(num2==0)
				System.out.println("0으로 나눌수 없습니다.");
			else
			System.out.printf(("%d/%d=%.2f\n"),num1,num2,num1/(double)num2);
		}else {
			System.out.println("잘못된 연산자 입니다");
		}




	}

}
