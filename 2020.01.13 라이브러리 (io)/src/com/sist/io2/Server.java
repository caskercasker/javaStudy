package com.sist.io2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
/*
 * 	Ŭ������ ����
 * 		= �Ϲ� Ŭ����
 * 		= �߻� Ŭ���� (�������̽�)
 * 		= ���� Ŭ����
 * 			1) Ŭ���� ���� �����͸� ����  => static		=> ��� Ŭ����
 * 				class A{
 * 					class B{
 * 					}
 * 				}
 * 				Server�� ������ �ִ� ��� ������ ����
 * 			2) ��Ӿ��� override ���	=> �͸��� Ŭ����
 */
public class Server implements Runnable{
	private ServerSocket ss;
	private final int PORT=8888;
	private Vector<Client> waitVC = new Vector<Client>(); //������ ������ ���� (ip, port) => Client ���� ��°�� ���� (+id)

	//���� ���� =>> Server => �޸� �Ҵ��� �ѹ��� ���
	public Server() {
		try {
			ss = new ServerSocket(PORT); //default 50�� �� ����
			//���� => bind, ������ => listen
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ Main �� ����....
		Server server = new Server();
		new Thread(server).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//��ȯ�� ���� waitVC������ ���� ��.
		// ���ӽÿ� ó��
		while(true) {
			try {
				//���ӽÿ� Ŭ���̾�Ʈ�� ������ �޾Ƽ� �����ϰ� => ������� ����
				//���ӽÿ� ���� ==> Socket(ip,port) ���� ���ļ� ��
				Socket s = ss.accept(); //������ �Ǹ� ȣ��Ǵ� �޼ҵ�
				//Socket ==>  Ŭ���̾�Ʈ (����)
				System.out.println("Ŭ���̾�Ʈ ���� �Ϸ� !!=>"+s.getInetAddress().getHostAddress());
				Client client = new Client(s);
				client.start(); //Client=> run() ����
				waitVC.add(client);
				//������ ����� ������ ����
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	// inner Ŭ���� => Thread (�ڿ��� ����� ���� �޾ƾ� �Ǳ� ������), ������ => ������
	class Client extends Thread{//[��� Ŭ����] port�� ���� ���� ������ ���� �ؾ� �Ǵµ�, �ٸ� Ŭ������ �����ϰ� �Ǹ� ������ �ι� ����� �Ǽ� ������ ����
		//Server�� ������ �ִ� ��� �����͸� ��� �� �� �ִ�.
		Socket s;	//Ŭ���̾�Ʈ�� ���� ��ȭ�� (���� ��� => ����Ʈ���� ����)
		OutputStream out; //Ŭ���̾�Ʈ�� ������� ����
		BufferedReader in; //Ŭ���̾�Ʈ�κ��� ��û���� �޴´�.
		public Client(Socket s) {
			try {
				this.s = s;
				out = s.getOutputStream();// Ŭ�󸮾�Ʈ�� ���� ������ ��������
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			}catch(Exception e) {}
		}
		@Override
		public void run() {
			while(true) {
				try {
					//Ŭ���̾�Ʈ �� ������ �޽��� �б�
					String msg = in.readLine();
					System.out.println("Client=>"+msg);
					//������ ��ü Ŭ���̾�Ʈ�� ���� ����
					for(Client c:waitVC) {
						c.out.write((msg+"\n").getBytes());
					}
				}catch(Exception ex) {}
			}
		}

	}
}

