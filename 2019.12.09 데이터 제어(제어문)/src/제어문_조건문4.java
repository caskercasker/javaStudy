//입력(정수) => 년도 윤년
/*
 * 4년 마다
 * 100년 마다 제외
 * 400년마다
 * ============ 로마시대 (윤년)
 * 암호화
 *
 * ABCD
 * DEFG
 *
 */
import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력");
		int year=scan.nextInt();
		if((year%4==0 && year%100!=0)||year%400==0)
			System.out.println(year+"윤년 입니다.");
		else if (!(year%4==0 && year%100!=0)||year%400==0){
			 System.out.println(year+"는 윤년이 아닙니다.");
		}else {
		}
	}

}
