//������ ���� �Է� �޾Ƽ� ������ ���
/*
 * 		���α׷�
 * 		======
 * 			���������  + java���̺귯�� + �ܺ� ���� �ҽ�(mvnrepository.com)
 * 			========================================================
 * 								����
 * 			5*1 = 5
 * 			5*2 = 10
 */
import java.util.Scanner;
public class �ݺ���8 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//��7.music();
		Scanner scan = new Scanner(System.in);
		int a;
		int i=1;
		System.out.println("���Է�");
		a = scan.nextInt();
		/*
		 * System.out.println("���� �Է��Ͻÿ�"); a = scan.nextInt(); //String s =
		 * JOptionPane.showInputDialog("�����Է�"); //int count=1; while(a<=9) { int
		 * count=1; while(count<=9) { System.out.println(a+"*"+count+"="+count*a);
		 * count++; } System.out.println(""); a++; }
		 */
		while(i<=9)
		{
			System.out.printf("%2d*%2d=%2d\n",a,i,a*i);
			i++;
		}
	}

}

