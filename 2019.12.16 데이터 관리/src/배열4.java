/*
 *	�⵵ ���� �Է¹޾Ƽ�  ==> ���� ������ ���� ����?
 *	�迭 => �ϰ�ó���� ����
 */

import java.util.Scanner;
public class �迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int year;
		int month;
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		//1,3,5,7,8,10,12
		// 4,6,9,11
		//2 - 28, 29
		System.out.println("�⵵�Է�");
		year = scan.nextInt();
		System.out.println("�� �Է�");
		month = scan.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0)){
			day[1] = 29;
		}
		System.out.println(day[month-1]);


	}

}
