import java.util.Scanner;

// ����2���� �Է� �޾Ƽ� ==> ������ 1�� ==> ��Ģ����
// �ڹ� => �Է� �޴� ��쿡 ==> char(�Ұ���), String
// String => (==), equals
// int a = (int)"10"
// Integer.parseInt("10") ���ڿ��� ���� ������ ��ȯ �ϱ�.
public class �������ǹ�3 {

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
		System.out.println("ù���� ����:");
		int num1=scan.nextInt();

		System.out.println("�ι�°����");
		int num2 = scan.nextInt();

		System.out.println("������(+,-,*,/):");
		String op = scan.next();

		//ó��
		// ����� ���
		if(op.equals("+")) {
			System.out.printf(("%d+%d=%d\n"),num1,num2,num1+num2);
		}else if (op.equals("-")) {
			System.out.printf(("%d-%d=%d\n"),num1,num2,num1-num2);

		}else if (op.equals("*")) {
			System.out.printf(("%d*%d=%d\n"),num1,num2,num1*num2);

		}else if (op.contentEquals("/")) {
			if(num2==0)
				System.out.println("0���� ������ �����ϴ�.");
			else
			System.out.printf(("%d/%d=%.2f\n"),num1,num2,num1/(double)num2);
		}else {
			System.out.println("�߸��� ������ �Դϴ�");
		}




	}

}
