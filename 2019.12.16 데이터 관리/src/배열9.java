/*
 * 5�� ������ �޾Ƽ�
 * �ִ밪, �ּҰ� ...
 *
 *
 * 5���� ������ �Է� �޾Ƽ� ���� ������ ����� ����϶�.
 */
import java.util.Scanner;
public class �迭9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<a.length; i++) {
			System.out.println((i+1)+"���� ���� �Է� ");
			a[i] = scan.nextInt();
		}

		int max = a[0];
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max)
				max = a[i];
			if(a[i] < min)
				min = a[i];

		}

			System.out.println(max);
			System.out.println(min);



	}

}
