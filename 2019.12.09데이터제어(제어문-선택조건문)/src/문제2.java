/*
 *  ���� �ΰ��� �����ڸ� �޾Ƽ� ��Ģ ����
 *
 *  ù��° ���� �Է� : 10
 *  �ι��� ���� �Է� : 20
 *  ������ �Է� : +
 *
 *
 *
 */
import java.util.Scanner;
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0;
		double b = 0;
		double result = 0;
		String op= "";

		//double test = 50/20.0;
		//System.out.println(test);

		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° �����Է�");
		a = scan.nextInt();
		System.out.println("�ι�° �����Է�");
		b = scan.nextInt();

		System.out.println("������ �Է�");
		op = scan.next(); //������ �Է�

		char c = op.charAt(0);

		if(c=='+') {
			result = a + b;
			System.out.println(" + ������� "+result);
		}if(c=='-') {
			result = a - b;
			System.out.println("- ������� "+result);
		}
		if(c=='*') {
			result = a * b;
			System.out.println(" * ������� "+result);
		}if(c== '/') {
			if (b==0) {
				System.out.println("ERROR");
			}
			result = a / b;
			System.out.println(" / �������"+result);
		}

		//
		 System.out.println(10/20);

			//System.out.println();

	}

}
