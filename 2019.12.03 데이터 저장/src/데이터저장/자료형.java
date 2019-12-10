package 데이터저장;
/*
 *  프로그램(언어) : java,c/c++,kotlin
 * 
 * => 데이터 저장 ======== 데이터 제어 ======== 화면 출력
 * 										dos,window :Application
 * 										브라우저 : web application
 * 										스마트폰 : 모바일
 * 
 * 
 *    =======
 *    1) 변수 : 한개의 데이터 저장하는 공간
 *    2) 배열 : 같은 유형의 데이터를 여러개 저장하는 공간 
 *    3) 클래스 : 다른 유형의 데이터를 여러개 저장하는 공간
 *    =========  메모리에 저장
 *    4) 파일
 *    5) RDBMS (오라클)
 *  
 *	  1. 변수
 *		1) 저장공간의 크기 
 *			= 자료형(데이터형)
 *            정수저장
 *             byte => (1byte) => -128~127
 *             ==> 100, 50, 90, 120, 38
 *             ============================
 *             변수설정 => 데이터 저장
 *             메모리 크기 변수명 = 값;
 *             ======
 *             byte b = 10
 *             int kor = 90  ==> 변경해서 이용이 가능
 *             
 *             데이터 크기 지정
 *             *********** int/ long 구분
 *             				===0=====
 *             				10,20 .. 10L. 20L (20l)
 *             				long a = 10L
 *             				long b = 10 => int => long
 *             				
 *             
 *             
 *            실수저장
 *            	float ( 4byte) 소수점 6자리
 *              double (8byte) => default => 소수점 15
 *              float vs double
 *              float f=10.5 => error
 *              ==4byte  == 8byte
 *              float f=10.5F  => 10.5F, 10.5f
 *              double = 10.5,  10.5d, 10.5D
 *              ===> 실수형을 정수로 변환 => 소수점 이하는 제외
 *                   (int)10.55 ==> 10
 *                   
 *            문자저장
 *             char (2byte) => 0~65535 (각국의 모든 국어 저장)
 *             		==> 'A', '한'
 *             		홍길동 => char[], String => ""
 *            True/False/
 *              boolean => boolean b = true 
 *              		   boolean b = false
 *            *** 참조형
 *             String => 문자열(문자 여러개를 저장할 경우)
 *             String name = "홍길동"
 *		2) 메모리에 이름 부여
 *			= 문법(식별자)
 *			= 글자수는 제한이 없다((3~7)
 *			1. 알파벳, 한글로 시작(단 알파벳은 대소문자 구분)
 *				영어점수 => engScore , eng_score
 *			2. 숫자사용 가능
 *				(단 앞에 사용이 불가능)
 *				kor2, en2 ..... a1b
 *			3. 특수문자( _, $) 보통 많이 사용 _ _ 단어가 여러개일경우
 *				file_name, file_size, first_name, second_name
 *				********* 임시파일
 *							_Hello.java
 *          4. 예약어(자바에서 사용하는 단어)
 *             int int_value
 *
 *
 */		
import java.util.*; //Scanner => 


public class 자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 'A' ;
		kor += 1;
		System.out.print(kor);
		//try {}

	}

}
