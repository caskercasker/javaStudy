package com.sist.io2;
/*
 * 	Thread를 사용하는 방법
 * 	====== 한가지 일만 사용하게 만든다.
 * 	================
 * 		1. Runnable(interface) 이용하는 방법
 *			=> 클라이언트 (윈도우) JFrame 상속을 이미 받아서 추가 상속을 받지 모함
 *			=> run()메소드 구현 => 쓰레드 동작
 * 			class A implements Runnable
 * 		2. Thread를 상속을 받아서 처리
 * 			=> Thread의 역할을 확장
 * 			class A extends Thread
 *
 * 		===> 동작하는 방법
 * 		INIT(생성:CREATED) 	==> 	Runnable(대기)   ==>      Running  ==> 일시정지
 * 		=================
 *		Thread t1 = new Thread();	t1.start()데이터받고 자동호출 ==> run()  ==> sleep(), wait()
 *		Thread t2 = new Thread();	t2.start()	           ==> run()  ==> sleep(), wait()
 *		=>  JVM
 *			이름을 부여	thread-0
 *			순위 부여 (1~10)
 *			============ 멀티쓰레드(시분할 프로그램, 순위에 따라 한번씩 수행함)
 *				1 => MIN_PRIORITY (garbage collection)
 *				10 => MAX_PRIORITY (main methods)
 *				5 => NORM_PRIOIRTY
 *													   					==> 쓰레드 종료
 *																		interrupt(),join()
 * 동작이 다 틀릴경우에 사용 하기 때문에 Thread를 상속받은 클래스들이 존재한다.
 * interface를 쓰는 경우 한가지 경우에만 사용 가능
 */

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(getName()+":"+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		// 생성
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.setName("홍길동");
		t2.setName("심청이");
		t3.setName("박문수");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		//필요한 데이터를 가지고 오기
		t1.start();
		t2.start();
		t3.start();

		//1~10출력 동작
		//t1.run(), t2.run(), t3.run()
	}

}
