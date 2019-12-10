package 데이터저장;
//변수 => 프로그램에 필요한 한개의 데이터를 저장하는 메모리 이름
// 					=======
/*
 * 			값을 설정 -> 형식
 * 			1) 정수
 * 			========> 10진법 int a = 10
 * 						2진법  int b = 0b1010
 * 						8진법 int c = 012
 * 						16진법 int d = 0xFF
 * 
 * 			byte b=10(127)
 * 			short  s=100 (32767)
 * 			int i = 1000
 * 			long l = 1090L
 * 			2)실수형
 * 			float f = 10.5F
 * 			double d = 10.g
 * 			문자
 * 			char c ='a'
 * 			논리형
 * 			boolean b=true
 *  
 */

public class 변수 {
	
	public static void main(String[] args) {
		//1. 4byte 크기의 메모리를 만들어라
		// 이 메모리의 이름 => a
		// a 라는 메모리에 10을 저장해라
		int a=10; //10진법
		int b = 012; //8진법
		int c = 0xA; //16진법
		int d = 0b1010; //2진법
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int ii= Integer.MAX_VALUE;
		System.out.println("ii"+ii);
	}
}
