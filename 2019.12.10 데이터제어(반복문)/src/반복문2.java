/*
 * 	while => while(true) : ���ѷ���
 * 	for   => for(;;)	: ���ѷ���
 *
 *  �ݺ����� ����
 *  ============
 *  	continue => Ư�������� ���� ***********
 *  	break => �ݺ����� ����
 *
 *  	1~10
 *
 */
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while ==> 1~100���� ¦���� ��, Ȧ���� ��, ������ ���ؼ� ���
		Scanner scan = new Scanner(System.in);

		int a = 0;
		int even = 0;
		int odd = 0;
		int sum = 0;
		int i = 1;

		System.out.println("����� �Է�");
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
