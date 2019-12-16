/*
 * 5개 정수를 받아서
 * 최대값, 최소값 ...
 *
 *
 * 5개의 정수를 입력 받아서 받은 정수의 등수를 출력하라.
 */
import java.util.Scanner;
public class 배열9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<a.length; i++) {
			System.out.println((i+1)+"번쨰 정수 입력 ");
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
