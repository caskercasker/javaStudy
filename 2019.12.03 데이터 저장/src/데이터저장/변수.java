package ����������;
//���� => ���α׷��� �ʿ��� �Ѱ��� �����͸� �����ϴ� �޸� �̸�
// 					=======
/*
 * 			���� ���� -> ����
 * 			1) ����
 * 			========> 10���� int a = 10
 * 						2����  int b = 0b1010
 * 						8���� int c = 012
 * 						16���� int d = 0xFF
 * 
 * 			byte b=10(127)
 * 			short  s=100 (32767)
 * 			int i = 1000
 * 			long l = 1090L
 * 			2)�Ǽ���
 * 			float f = 10.5F
 * 			double d = 10.g
 * 			����
 * 			char c ='a'
 * 			����
 * 			boolean b=true
 *  
 */

public class ���� {
	
	public static void main(String[] args) {
		//1. 4byte ũ���� �޸𸮸� ������
		// �� �޸��� �̸� => a
		// a ��� �޸𸮿� 10�� �����ض�
		int a=10; //10����
		int b = 012; //8����
		int c = 0xA; //16����
		int d = 0b1010; //2����
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int ii= Integer.MAX_VALUE;
		System.out.println("ii"+ii);
	}
}
