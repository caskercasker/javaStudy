/*
 * 2개의 정수를 입력받아서
 * 최대값, 최소값
 * do ~ while
 *
 *  10 30 ==> 최대값: 30, 최소값: 10
 */
import java.util.Scanner;
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int buf = 0;
		int buf2 = 0;
		Scanner scan = new Scanner(System.in);


		do {
			System.out.println("정수입력");
			buf = scan.nextInt();
			if(i==2) {
				//buf2 = buf;
				if(buf2-buf>0) {
					System.out.println("최대값"+buf2);
					System.out.println("최소값"+buf);
				}
				else {
					System.out.println("최대값"+buf);
					System.out.println("최소값"+buf2);
				}
			}
			buf2 = buf;
			i++;
		}while(i<=2);

		//System.out.println("최대값"+(Math.max(num1, num2)));
		//System.out.println("최소값"+(Math.min(num1, num2)));

	}

}
