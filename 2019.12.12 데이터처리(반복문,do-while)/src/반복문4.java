/*
 * 2���� ������ �Է¹޾Ƽ�
 * �ִ밪, �ּҰ�
 * do ~ while
 *
 *  10 30 ==> �ִ밪: 30, �ּҰ�: 10
 */
import java.util.Scanner;
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int buf = 0;
		int buf2 = 0;
		Scanner scan = new Scanner(System.in);


		do {
			System.out.println("�����Է�");
			buf = scan.nextInt();
			if(i==2) {
				//buf2 = buf;
				if(buf2-buf>0) {
					System.out.println("�ִ밪"+buf2);
					System.out.println("�ּҰ�"+buf);
				}
				else {
					System.out.println("�ִ밪"+buf);
					System.out.println("�ּҰ�"+buf2);
				}
			}
			buf2 = buf;
			i++;
		}while(i<=2);

		//System.out.println("�ִ밪"+(Math.max(num1, num2)));
		//System.out.println("�ּҰ�"+(Math.min(num1, num2)));

	}

}
