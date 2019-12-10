/*
 * 	1. if ~ else
 * 		정수를 한개 입력 받아서 짝수/홀수
 * 	2. 임의의 알파벳을 받아서 대문자인/소문자(if~else)
 *	   ====
 *		char a='A'
 *  3. 정수 3개를 입력을 받아서
 *  	평균 => 90이상 => 'A'
 *  		  80이상 => 'B'
 *  		  70이상 => 'C'
 *  		  60이상 => 'D'
 *  		   이하 =>    'F'
 *
 *
 */
import java.util.Scanner;
public class 오늘의문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
/*		int a;

		System.out.println("정수를 입력하시오");
		a = scan.nextInt();
		if(a%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");*/
		///////////////
	/*	char b='Z';
		System.out.println((int)b);
		//if (a)
		if(b>=65 && 90>=b)
			System.out.println(b+"는 대문자");
		else
			System.out.println(b+"는 소문자");

*/		///////////////////
		int c=0,d=0,e = 0;
		int result = 0;

		System.out.println("C입력");
		c = scan.nextInt();
		System.out.println("D입력");
		d = scan.nextInt();
		System.out.println("E입력");
		e = scan.nextInt();
		result = (c+d+e)/3;
		System.out.println("평균출력"+result);

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
