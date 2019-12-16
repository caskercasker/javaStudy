/*
 *	년도 월을 입력받아서  ==> 월의 마지막 날은 몇일?
 *	배열 => 일괄처리가 가능
 */

import java.util.Scanner;
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int year;
		int month;
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		//1,3,5,7,8,10,12
		// 4,6,9,11
		//2 - 28, 29
		System.out.println("년도입력");
		year = scan.nextInt();
		System.out.println("월 입력");
		month = scan.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0)){
			day[1] = 29;
		}
		System.out.println(day[month-1]);


	}

}
