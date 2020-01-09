package com.sist.Exception;

/*
 * 예외처리
 * ===== 소스상에서 수정이 가능한 에러 (가벼운 에러:프로그래머가 처리 가능)
 * 		 0으로 나눈다, 파일명이 틀리다, ip가 틀리다, URL주소가 틀리다, 배열의 범위가 초과
 * 예외처리
 * 		1) 에러가 발생시 예방을 하는 프로그램
 * 		2) 에러가 발생시 => 정상 상태 유지 방법
 * 		=> 1,000 ==> 10,00
 *		자바
 *	--------------------
 *	|					|
 *	컴파일시(javac)		런타임(java)
 *	------------		----------
 * 	JVM 이 검색			실행사마다 에러
 * 	=> 반드시 예외 처리 		=> 필요하면 예외처리
 *	입출력
 	= 메모리 입출력
 		System.out.print()
 		System.in.read()
 	= File 입출력
 	= 네트워크 입출력

 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];

		try {
		for(int i=0; i<=6; i++) {
			arr[i]=(int)(Math.random()*45)+1;
		}
		}catch(Exception e) {System.out.println("오류발생");}

		for(int i=0; i<6; i++) {
			System.out.print(arr[i]+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				e.getMessage();
				System.out.println("e.getMessage()");
				System.out.println("dflkdjfldjf");
			}
		}
//		  try {
//			  method1();
//		  }catch(ArithmeticException e){
//		  System.out.println("ArithmeticException");
//		  }catch(Exception e) {
//		  System.out.println("Exception");
//		  }
//		  	method2();
//		  	method3();
//		  	method4();
//		  }
//
//		  //예외 던지기 : throw로 예외를 던질때는 throws Exception(던질 예외들) 선언해줘야하마 현재 메소드를 실행할 경우
//		  //Excpetion, ArithmeticException 발생할수 있다고 선언해준 형태다......
//
//
//		  public static void method1() throws Exception, ArithmeticException{
//		  try {
//			  System.out.println(1);
//			  System.out.println(0/0);
//			  // 앞에서 Exception이 날 경우 다음 문장은  실행 안하고 catch 문으로 넘어감
//			  System.out.println(2);
//		  }catch (Exception e) }
//
	}
}
