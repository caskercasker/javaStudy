/*
 * 	while => while(true) : 무한루프
 * 	for   => for(;;)	: 무한루프
 *
 *  반복문을 제어
 *  ============
 *  	continue => 특정내용을 제외 ***********
 *  	break => 반복문을 종료
 *
 *  	1~10
 *
 */
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while ==> 1~100까지 짝수의 합, 홀수의 합, 총합을 구해서 출력
		Scanner scan = new Scanner(System.in);

		int a = 0;
		int even = 0;
		int odd = 0;
		int sum = 0;
		int i = 1;

		System.out.println("사용자 입력");
		a = scan.nextInt();

		while(i<=a) {
			sum = sum + i;
			if (i%2==0) {
				even = even + i;
			}else {
				odd = odd + i;
						}
			i++;
		}
		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);



	}

}
