package com.sist.io2;
/*
 * 	Thread�� ����ϴ� ���
 * 	====== �Ѱ��� �ϸ� ����ϰ� �����.
 * 	================
 * 		1. Runnable(interface) �̿��ϴ� ���
 *			=> Ŭ���̾�Ʈ (������) JFrame ����� �̹� �޾Ƽ� �߰� ����� ���� ����
 *			=> run()�޼ҵ� ���� => ������ ����
 * 			class A implements Runnable
 * 		2. Thread�� ����� �޾Ƽ� ó��
 * 			=> Thread�� ������ Ȯ��
 * 			class A extends Thread
 *
 * 		===> �����ϴ� ���
 * 		INIT(����:CREATED) 	==> 	Runnable(���)   ==>      Running  ==> �Ͻ�����
 * 		=================
 *		Thread t1 = new Thread();	t1.start()�����͹ް� �ڵ�ȣ�� ==> run()  ==> sleep(), wait()
 *		Thread t2 = new Thread();	t2.start()	           ==> run()  ==> sleep(), wait()
 *		=>  JVM
 *			�̸��� �ο�	thread-0
 *			���� �ο� (1~10)
 *			============ ��Ƽ������(�ú��� ���α׷�, ������ ���� �ѹ��� ������)
 *				1 => MIN_PRIORITY (garbage collection)
 *				10 => MAX_PRIORITY (main methods)
 *				5 => NORM_PRIOIRTY
 *													   					==> ������ ����
 *																		interrupt(),join()
 * ������ �� Ʋ����쿡 ��� �ϱ� ������ Thread�� ��ӹ��� Ŭ�������� �����Ѵ�.
 * interface�� ���� ��� �Ѱ��� ��쿡�� ��� ����
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
		// ����
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.setName("ȫ�浿");
		t2.setName("��û��");
		t3.setName("�ڹ���");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		//�ʿ��� �����͸� ������ ����
		t1.start();
		t2.start();
		t3.start();

		//1~10��� ����
		//t1.run(), t2.run(), t3.run()
	}

}
