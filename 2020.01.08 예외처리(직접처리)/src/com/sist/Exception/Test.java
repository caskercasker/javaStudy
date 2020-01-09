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

	// 예외 던지기 : throw 로 예외를 던질때는 메서드에
	// throws Exception(던질 예외들) 선언해줘야 함.
	// 현재 메서드를 실행할 경우 Exception, ArithmeticException 발생 할 수
	// 있다고 선언해준 형태 입니다.
	public static void method1() throws Exception , ArithmeticException {
		try {
			System.out.println(1);
			System.out.println(0/0);
			// 앞에서 Exception이 날경우 다음 문장은 실행 안하고 catch문으로 넘어감.
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
			// method1을 호출한 메서드에게 예외를 되돌려 준다.
			throw e;
			// catch 문 실행 여부와 상광없이 무조건 finally 호출
		} finally {
			System.out.println("finally");
		}
	}

	// return 일 경우도 finally 호출
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

	// String 문자열을 담는 Exception 생성
	public static void method3() {
		try {
			throw new Exception("직접만든 Exception");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"method3");
		}
	}


	// Exception을 상속받은 MyException Class 만들어 사용 하기
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

	// Exception 상속 받은 MyException Class
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
