/*
 * 	컴퓨터 => 1~100 사이의 임의의 수를 추출
 *
 *  힌트 => UP/dOWN
 *
 */



import java.util.Scanner;
public class 업다운게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random()*100+1);
		Scanner scan = new Scanner(System.in);
		//System.out.println("숫자 입력");
		int user = 0;

		System.out.println(a);
		/*
		 * while(user!=a) { System.out.println("숫자 입력"); user = scan.nextInt();
		 * if(a>user) System.out.println("UP"); else if(a<user)
		 * System.out.println("Down"); else break; } System.out.println("정답은"+a);
		 */
		while(true)
		{
			System.out.println("1~100사이의 정수 입력:");
			int users=scan.nextInt();
			if(users<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				continue;//while => 조건식으로 이동
				//System.out.println("dfdf");
			}
			if(a>users) {
				System.out.println("입력값보다 큰수를 입력하세요");
			}else if(a<user) {
				System.out.println("입력갑소다 작은수를 입력하세요");
			}else {
				System.out.println("Game OVer!!");
				//종료
				break; //while 문 종료
				//System.out.println("fkdjfdf");
				//System.exit(0); //프로그램을 완전히 종료

			}
		}

	}

}
//break, continue 이후에는 작업이 오면 안됨. 시행이 되지 않음.