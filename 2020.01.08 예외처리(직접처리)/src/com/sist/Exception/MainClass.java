package com.sist.Exception;

/*
 * ����ó��
 * ===== �ҽ��󿡼� ������ ������ ���� (������ ����:���α׷��Ӱ� ó�� ����)
 * 		 0���� ������, ���ϸ��� Ʋ����, ip�� Ʋ����, URL�ּҰ� Ʋ����, �迭�� ������ �ʰ�
 * ����ó��
 * 		1) ������ �߻��� ������ �ϴ� ���α׷�
 * 		2) ������ �߻��� => ���� ���� ���� ���
 * 		=> 1,000 ==> 10,00
 *		�ڹ�
 *	--------------------
 *	|					|
 *	�����Ͻ�(javac)		��Ÿ��(java)
 *	------------		----------
 * 	JVM �� �˻�			����縶�� ����
 * 	=> �ݵ�� ���� ó�� 		=> �ʿ��ϸ� ����ó��
 *	�����
 	= �޸� �����
 		System.out.print()
 		System.in.read()
 	= File �����
 	= ��Ʈ��ũ �����

 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];

		try {
		for(int i=0; i<=6; i++) {
			arr[i]=(int)(Math.random()*45)+1;
		}
		}catch(Exception e) {System.out.println("�����߻�");}

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
//		  //���� ������ : throw�� ���ܸ� �������� throws Exception(���� ���ܵ�) ����������ϸ� ���� �޼ҵ带 ������ ���
//		  //Excpetion, ArithmeticException �߻��Ҽ� �ִٰ� �������� ���´�......
//
//
//		  public static void method1() throws Exception, ArithmeticException{
//		  try {
//			  System.out.println(1);
//			  System.out.println(0/0);
//			  // �տ��� Exception�� �� ��� ���� ������  ���� ���ϰ� catch ������ �Ѿ
//			  System.out.println(2);
//		  }catch (Exception e) }
//
	}
}
