package com.sist.Exception;

public class Test {

	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}

		method2();

		method3();

		method4();

	}

	// ���� ������ : throw �� ���ܸ� �������� �޼��忡
	// throws Exception(���� ���ܵ�) ��������� ��.
	// ���� �޼��带 ������ ��� Exception, ArithmeticException �߻� �� ��
	// �ִٰ� �������� ���� �Դϴ�.
	public static void method1() throws Exception , ArithmeticException {
		try {
			System.out.println(1);
			System.out.println(0/0);
			// �տ��� Exception�� ����� ���� ������ ���� ���ϰ� catch������ �Ѿ.
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
			// method1�� ȣ���� �޼��忡�� ���ܸ� �ǵ��� �ش�.
			throw e;
			// catch �� ���� ���ο� �󱤾��� ������ finally ȣ��
		} finally {
			System.out.println("finally");
		}
	}

	// return �� ��쵵 finally ȣ��
	public static void method2() {
		try {
			System.out.println(1);
			return;
		} catch (Exception e) {
			System.out.println(2);
		} finally {
			System.out.println("finally");
		}
	}

	// String ���ڿ��� ��� Exception ����
	public static void method3() {
		try {
			throw new Exception("�������� Exception");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"method3");
		}
	}


	// Exception�� ��ӹ��� MyException Class ����� ��� �ϱ�
	public static void method4() {
		MyException myEx = new MyException("extends Exception!!");
		System.out.println("d======");
		try {
			throw myEx;
		} catch (Exception e) {
			System.out.println(e.getMessage()+"method4,e");
			System.out.println(((MyException) e).getErrCode());
			System.out.println(myEx.getMessage()+"method4.myEx");
			System.out.println(myEx.getErrCode()+"Err");
		}
	}

	// Exception ��� ���� MyException Class
	static class MyException extends Exception {

		private int Err_Code;

		public MyException(String msg, int errCode) {
			super(msg);
			this.Err_Code = errCode;
		}

		public MyException(String msg){
			this(msg, 100);
		}

		public int getErrCode(){
			return Err_Code;
		}
	}
}
