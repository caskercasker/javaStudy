/*
 * 	1. if ~ else
 * 		������ �Ѱ� �Է� �޾Ƽ� ¦��/Ȧ��
 * 	2. ������ ���ĺ��� �޾Ƽ� �빮����/�ҹ���(if~else)
 *	   ====
 *		char a='A'
 *  3. ���� 3���� �Է��� �޾Ƽ�
 *  	��� => 90�̻� => 'A'
 *  		  80�̻� => 'B'
 *  		  70�̻� => 'C'
 *  		  60�̻� => 'D'
 *  		   ���� =>    'F'
 *
 *
 */
import java.util.Scanner;
public class �����ǹ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
/*		int a;

		System.out.println("������ �Է��Ͻÿ�");
		a = scan.nextInt();
		if(a%2==0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");*/
		///////////////
	/*	char b='Z';
		System.out.println((int)b);
		//if (a)
		if(b>=65 && 90>=b)
			System.out.println(b+"�� �빮��");
		else
			System.out.println(b+"�� �ҹ���");

*/		///////////////////
		int c=0,d=0,e = 0;
		int result = 0;

		System.out.println("C�Է�");
		c = scan.nextInt();
		System.out.println("D�Է�");
		d = scan.nextInt();
		System.out.println("E�Է�");
		e = scan.nextInt();
		result = (c+d+e)/3;
		System.out.println("������"+result);

		if(result>=90 && result <100)
			System.out.println("A");
		if(result>=80 && result <90)
			System.out.println("B");
		if(result>=70 && result <80)
			System.out.println("C");
		if(result>=60 && result <70)
			System.out.println("D");
		if( result <60)
			System.out.println("F");
	}
}
