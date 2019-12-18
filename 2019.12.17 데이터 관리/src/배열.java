/*
 * 배열=> 여러데이터를 한개의 이름으로 제어 => 인덱스(첨자)를 이용한다.
 * 		** 인덱스는 0부터 시작
 * 1) 형식
 * 		1.선언
 * 			데이터형[] 배열명 //int name[] =
 * 							var
 * 			======
 * 				= 기본타입(int, long,float,double....)
 * 					int[] arr
 * 					long[] arr
 * 					char[] arr
 * 				= 사용자 정의 타입(클래스) 클래스 자체를 데이터 형으로 이해 해야함.
 * 				class Movie // 안에 들어가있는 변수들과 메소드에 의해서 그 크기가 다른 배열들...
 * 				Movie[] arr  //#* Movie라는 데이터 형이 들어가는 배열.......
 * 				String[] names
 * 				<String, 배열 > 데이터 참조형
 * 				C/C++에는 없고 java에 있는 변수는 boolean
 * 		2.초기값
 * 		= arr = {1,2,3,4,5,6}
 * 		= arr = new int[6] ==> 자체 초기 값(int:0, long:0L, String:null)
 * 			null ==> 메모리에 저장된 주소값이 존재하지 않는다.
 * 			> 리플렉션(결합력이 약함), 필요할 때만 연결하여 사용.) (스프링)  new 를 사용하면 영향력이 쎼다.
 *
 * 		3.데이터 읽기
 * 			=arr[index] ==> 갯수보다 한개가 적다.
 * 		4.데이터 저장
 * 			=arr[1] = 10
 *
 *
 * 		숫자 야구 게임
 * 		======== S B
 * 		=> 난수 => 729
 * 		=> 사용자 입력 => 567 => 0S-1B
 * 		=> 			 785 => 1S-0B
 * 					 793 => 1S-1B
 * 					 279 => 1S-2B
 * 					 729 => 3S-0B ==>break
 *
 */
//중복없는 난수 발생

//프로젝트
/*
 * 변수	연산자	 제어문	출력
 * 		========
 * 		메소드
 * ==================== 클래스
 *
 *
 */
import java.util.Scanner;
public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] com= {3,6,9}; //중복없는 난수 발생 메소드
		int[] com = new int[3];
		int su= 0;
		boolean bCheck = false;
		int overhead = 0;

		for(int i=0; i<com.length; i++) {

			bCheck = true;
			while(bCheck) {
			//난수발생
			su =(int)(Math.random()*9)+1;
			bCheck = false;

			for (int j=0; j<i; j++) {
				if(com[j]==su) {
					overhead ++;
					bCheck = true;
					break;
				}
			}
			}
			com[i] = su;
		}

		int[] user=new int[3];

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수 입력:");
			int input = scan.nextInt();
			if(input<99 || input > 999) {
				System.out.println("잘못된 입력");
				continue; //오류를 받은 이후에 다시 입력 받음.
			}
			//배열에 값을  변경
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			//오류처리  => 중복된 수를 사용할 수 없다. 0을 사용 할 수 없다.
			//유효성 검사
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("중복된수를 사용 할 수 없습니다.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 사용할 수 없습니다.");
				continue;
			}
			//비교시작
			int s=0, b=0;
			for(int i=0; i<3; i++) {// i==> com
				for(int j=0; j<3; j++) { //j ==>user
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			//힌트
			System.out.printf("input Number:%d,Result:%dS-%dB\n",input,s,b);
			//종료 여부 확인
			System.out.println("===============================");
			System.out.print("S:");
			for(int i=0; i<s; i++) {
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0; i<b; i++) {
				System.out.print("○");
			}
			System.out.println("\n===============================");

			if(s==3) {
				System.out.println("Gmae Over!!");
				break;
			}

		/*
		 * for(int i=0;i<3;i++) { com[i] = (int)(Math.random()*5)+1; }
		 *
		 *
		 * for(int i:com) { System.out.print("i="+i+"\t"); }
		 */
		}

	}
}
