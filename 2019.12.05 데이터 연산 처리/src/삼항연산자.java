// ? : 
//(조건문?값1:값2) => 웹 (React = > 삼항연산자)
//조건(true) => 값1
// 조건(false) => 값2


/*
 * <%
 * 		int sex 1
 * 		if(sex==1)
 * 	{
 * 
 *  %> 
 * 			남자
 * 
 * <%
 * 		}else
 * {
 * 			
 * %>
 * 
 * 	여자
 * 
 * <%
 * 		}
 		
 *  %>
 * 
 * ===================================================================
 * 
 * <%	
 * 	sex==1? "남자":"여자"
 * %>
 * 
 * 
 */
import java.util.Scanner;
/*
 * 
 * 
 * 			나이를 입력 ==> 15세 이상이면 (영화관람가능) / 이하(영화관람불가)
 * 
 * 
 * 		// 좌석 => 1,2,3,4,5,= > 1,2,4 ==> 좌석예매 불가능  3,5 => 좌석 예매 가능
 */



public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("좌석번호 입력");
		int book = scan.nextInt();
		
		String result = (book==3)|(book==5)?"좌석예매가능":"좌석예매불가능";
		System.out.println("결과"+result);
		
		/*System.out.println("나이 입력");
		int age = scan.nextInt();
		String result = age>=15?"영화관람가능":"영화관람불가능";
		System.out.println("결과"+result);
		
				
		
		System.out.print("국어  점수:");
		//저장
		int kor= scan.nextInt();
		System.out.println("영어 점수:");
		int eng=scan.nextInt();
		System.out.println("수학 점수:");
		int math=scan.nextInt();
		
		
		int avg=(kor+eng+math)/3;
		
		//String result = avg>=60?"Pass":"NonPass";
		//System.out.println("결과:"+result);
		 
		 */
	}

}
