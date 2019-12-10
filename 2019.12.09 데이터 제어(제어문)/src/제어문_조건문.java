/*
 * 	조건문
 * 	단일 조건문
 * 	1)형식
 * 		if(조건문)
 * 			실행문장
 *
 * 		if(조건문) ===ㅣ> 1개이상의 실행문장이 있는 경우 ({})
 * 		{
 * 			실행문장1
 * 			실행문장2
 * 		}
 * 		if(조건문)
 * 			실행문장1 ===> if 소속문장
 * 			실행문장2 ===> if 와 관련없는 문장
 * 	2) 조건문 처리 방법
 * 	====
 * 		true/false => 부정연산자, 비교연산자, 논리연산자
 *
 * 	3) 실행 => 조건이 true ==> 문장수행
 * 			  조건이 false => 문장 수행을 하지 않는다/.
 * 	= 선택 조건문
 * 	= 다중 조건문
 *
 *	//정수를 입력 받아서 => 홀수/ 짝수
	1) 자바에서 생략이 가능
		1. import : 라이브러리 클래스를 불러온다.
					java.lang(String 관련)
					=======
					System.String.Math
		2. return : 모든 메소드는 return을 가지고 있다.
		3. 상속	: 모든 클래스는 (사용자 정의)는 object 상속 (슈퍼클래스, 상속받는 부모 클래스가 존재)
		4. 예외처리	 :모든 클래스는 예외처리를 가지고 있다.
		======
			비정상종료를 방지하고 정상상태를 유지 (미리 에러를 방지하는 프로그램)
 *
 *
 */
//정수를 입력 받아서 => 홀수/ 짝수
// import => 이미 만들어진 클래스를 불러올떄 사용
// CBD => 컴포넌트 베이스
// 조립식 프로그램
import java.util.Scanner;
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력
		Scanner scan=new Scanner(System.in); //엔터 쳤을 때 까지의 키보드 입력값을 저장
		System.out.println("정수입력:");
		//입력된 값을 저장
		int num = scan.nextInt();
		//짝수 조건
		//홀수 조건
		if(num%2 ==0) {
			System.out.println(num+"는(은) 짝수 입니다.");
		}
		if(num%2 !=0) //num%2 ==1
			{
			System.out.println(num+"는(은) 홀수 입니다.");
		}

	}

}
