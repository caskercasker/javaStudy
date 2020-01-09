package com.sist.Exception;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//int[] arr = new int[2];
			int a = 10;
			int b = 0;
			System.out.println("a="+a+",b"+b);
			int c = a/b;


		}catch(NumberFormatException ex) {
			System.out.println("NumberFormatException");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}catch(NullPointerException ex) {
			System.out.println("NullPointerException");
		}catch(ClassCastException ex) {
			System.out.println("ClassCastException");
		}catch(RuntimeException ex) {
			System.out.println("RuntimeException");
		}
		System.out.println("프로그램 종료");
	}

}
