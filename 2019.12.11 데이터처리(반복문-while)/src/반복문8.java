//구구단 단을 입력 받아서 구구단 출력
/*
 * 		프로그램
 * 		======
 * 			사용자정의  + java라이브러리 + 외부 오픈 소스(mvnrepository.com)
 * 			========================================================
 * 								조립
 * 			5*1 = 5
 * 			5*2 = 10
 */
import java.util.Scanner;
public class 반복문8 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//문7.music();
		Scanner scan = new Scanner(System.in);
		int a;
		int i=1;
		System.out.println("단입력");
		a = scan.nextInt();
		/*
		 * System.out.println("단을 입력하시오"); a = scan.nextInt(); //String s =
		 * JOptionPane.showInputDialog("정수입력"); //int count=1; while(a<=9) { int
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

