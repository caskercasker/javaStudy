/*
 *  자바에서 제공하는 특수문자
 *  1) \n => newLine ==> 다음 줄에 출력 System.out.println()
 *  2) \t => tab  ==> 일정 간격
 *  3) \" => " ==>     따옴표 생략(인용부호)
 *  	System.out.println("\"Hello Java\"")
 *
 *  출력 형식
 *  홍길동
 *  심청이
 *  박문수
 *
 *
 *  ==>  System.out.println("홍길동");
 *  	System.out.println("심청이");
 *  	System.out.println("박문수");
 *
 *  홍길동 심청이 박문수
 *    System.out.print("홍길동\t");
 *    System.out.print("심청이\t");
 *    System.out.print("박문수\t");
 *
 *    서식이 있는 출력 ==> JDK 1.5   //서식을 건드리는 경우는 대부분의 경우 실수에서 소수점 자리가 길어져서 관리하기가 힘들어 질때 사용 한다.
 *    //print Format
 *    1) %d ==> 정수
 *    System.out.printf(%5d%5d%5d",100,90,60);
 *     100--90---60
 *    2) %f ==> 실수
 *    3) %c ==> 문자
 *    4) %s ==> 문자열
 *
 *    System.out.printf();
 *    이름	국어	영어	수학	총점
 *    홍길동 	90	90	90	270
 *    //... 갯수를 알수를 없을 떄
 */
public class 일주차정리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();

		System.out.printf("%5d%5d%5d",100,90,60);  //+값 오른쪽 정렬 -값 왼쪽 정렬

		System.out.printf("\n");

		System.out.printf("%-10.2f%-10.2f%-10.2f\n",100.1,90.0,60.0); //f는 기본형이 Int 값을 받으면 에러가 남,

		System.out.printf("%2c%2c%2c\n",'A','B','C');

		System.out.printf("%10s%10s%10s\n","Hello","Java","!!");

		//System.out.printf("%d%s%c",0,'A',"hello");
	}

}
