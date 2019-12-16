/*
 * 	형식-순서)
 * 			1		2	==> false
 *
 * 			i		i<=5  i++
 * 		for(초기값;  조건식;  증가식) => 1차
 * 		{			true
 * 				1	2		==> false
 * 			for(초기값;조건식;증가식) => 2차
 * 			{			true
 * 				실행문장 (2차 for) ===> 2차 증가식
 * 			}
 * 			실행문장 (1차 for) === > 1차 for 증가식
 *			    *4
 *			   **3
 *		모래시계     위치
 *		5		12345		1
 *		3		 234		2
 *		1		  3			3
 *		3		 234		4
 *		5		12345		5
 *		전환
 *		다이아몬드
 *
 *
 */
// 모래시계, 전환, 다이아몬드
public class 이중반복문 {
	//절대값 함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		for (int i =1; i<=5; i++) {
			int k = Math.abs(i-3);

			if(k==2) {   //1번 5번쨰 줄
				for(int j=1; j<=5; j++) { //빈칸출력용
			    System.out.print("*");
				}
			}else if(k==1) { //2전째 4번쨰 줄
				for(int j=1; j<=5; j++) {
					if(j==1 || j==5) {
						System.out.print(" ");
					}else
						System.out.print("*");
				}
			}else if( k==0) {
				for(int j=1; j<=5; j++) {
					if (j==3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
		System.out.println();//줄바꾸기
		}
	}*/
		/*
		 * for (int i =1; i<=5; i++) { int k = Math.abs(i-3);
		 *
		 * if(k==2){ //2전째 4번쨰 줄 for(int j=1; j<=5; j++) { if(j==1 || j==5) {
		 * System.out.print("*"); }else System.out.print(" "); } }else if(k==1) {
		 * for(int j=1; j<=5; j++) { if (j==3) { System.out.print(" "); }else {
		 * System.out.print("*"); } } }else if( k==0) { //1번 5번쨰 줄 for(int j=1; j<=5;
		 * j++) { //빈칸출력용 System.out.print("*"); } } System.out.println();//줄바꾸기 }
		 */
		for (int i =1; i<=5; i++) {
			int k = Math.abs(i-3);

			if(k==2){
				for(int j=1; j<=5; j++) {
					if (j==3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}else if(k==1) { //2전째 4번쨰 줄
				for(int j=1; j<=5; j++) {
					if(j==1 || j==5) {
						System.out.print(" ");
					}else
						System.out.print("*");
				}
			}else if( k==0) {   //1번 5번쨰 줄
				for(int j=1; j<=5; j++) { //빈칸출력용
			    System.out.print("*");
				}
			}
		System.out.println();//줄바꾸기
		}
	}
}


