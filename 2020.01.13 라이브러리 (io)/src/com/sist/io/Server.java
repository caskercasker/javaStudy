package com.sist.io;
import java.net.ServerSocket;
import java.net.Socket;


/*
 *	MVC, Spring, Kotlin
 *	====================
 *  ���� :
 *  	��⼭�� => 1��	==> ������ (Socket) => ��ȭ�� accept ���� ������ ����. read()/write()�� ����.
 *  																1byte�� ������(OutputStream)	 2byte�� �޾ƾ� �ѱ��� �ȱ��� (Reader)
 *  																encoding decoding
 *  			ServerSocket => ���ӽ� ó�� (���Ӹ� ��) ip,port�� Ȯ��
 *  	��ż��� => ���Ӽ���ū ���� (Thread)
 *				Socket => ��ü ���
 *
 *	���� => �������� ����ϴ� ���α׷��� �ʿ�
 *			========= ����
 */
public class Server implements Runnable {
	private ServerSocket ss;
	private Server() {
		try {
			ss=new ServerSocket(3355);  //������ �Ϸ�� ���(listen ���±��� JVM�� ��)
			//bind => ����(����� ����)
			//bind => 1. IP, 2. Port
			//������ port => ���� ��Ʈ, Ŭ���̾�Ʈ => �ӽ� ��Ʈ (�ڵ����� ��Ʈ��ȣ�� ����� �ߺ��� �ȵǴ�)
			//listen => ������
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
		//server�� �ִ� run�Լ��� ȣ��
	}
	//������ �۵�
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) { //������ �Ǿ��ٸ�
			try {
				Socket s = ss.accept(); //������ Ŭ���̾�Ʈ�� ������ �޾ƾ��� (Socket)
				System.out.println("������ Ŭ���̾�Ʈ�� IP:"+s.getInetAddress().getHostAddress()); //�����͸� ������ �ξ����.
				System.out.println("�ӽ� ��Ʈ:" + s.getPort());
				System.out.println("===================");
			}catch(Exception ex) {}
		}
	}

}
