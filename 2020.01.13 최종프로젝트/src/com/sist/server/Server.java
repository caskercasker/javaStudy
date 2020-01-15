package com.sist.server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.sist.common.Function;
public class Server implements Runnable{
	//���� => ���� => ServerSocket
	//�� Ŭ���̾�Ʈ���� ��Ŵ�� (Thread) => Socket <=> Socket
	//1.���� ����
	private ServerSocket ss;
	private final int PORT = 8888;
	//������ ���� ����

	private Vector<Client> waitVC = new Vector<Client>();
	public Server() {
		try {
			ss = new ServerSocket(PORT); //bind,listen
			System.out.println("Server Start .......");
		}catch (Exception ex) {}
	}
	//���ӽ� ó��
	@Override
	public void run() {
		try {
			while(true) {
				//������ �ߴٸ� Ŭ���̾�Ʈ�� ���� ���� => IP,PORT(Socket);
				Socket s = ss.accept();
				//s(Ŭ���̾�Ʈ�� ���� (ip,port) => Thread�� ���� (���ڸ��� ����� �� �� �ִ�)
				Client client = new Client(s);
				client.start();
			}
		}catch(Exception ex) {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}
	//����� ����ϴ� �κ� (�� Ŭ���̾�Ʈ���� ���� �۾��� �Ѵ�)
	class Client extends Thread{
		String id,name,sex,pos;
		//pos => ����ġ
		//���
		Socket s; //������
		//������
		OutputStream out;
		//�ޱ�
		BufferedReader in;

		public Client(Socket s) {
			try {
				this.s = s;
				out = s.getOutputStream(); //Ŭ���̾�Ʈ�� ������ġ => �Ͼ�� �ְ� �����.
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//inputStreamReader( ���ͽ�Ʈ��) => byte -> 2bte�� ��ȯ
			}catch (Exception ex) {}
		}
		//�ݺ��� ���� => �޼ҵ�
		// �������� => ����
		// ���������� ����

		//Ŭ���̾�Ʈ�� ���
		@Override
		public void run() {
			try {
				//100|hong|ȫ�浿|����\n
				while(true) {
					String msg = in.readLine();
					StringTokenizer st = new StringTokenizer(msg,"|");
					int protocol = Integer.parseInt(st.nextToken());
					switch(protocol) {
					case Function.LOGIN:{
						id=st.nextToken();
						name = st.nextToken();
						sex = st.nextToken();
						pos = "����";


						messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
						waitVC.add(this);
						messageTo(Function.MYLOG+"|"+id);
						for(Client user:waitVC) {
							messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex+"|"+user.pos);
						}
						break;
					}
					case Function.WAITCHAT:{

						messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
						break;
					}


					}
				}
			}catch(Exception ex) {}
		}

		//�ݺ��� ���� => �޼ҵ�
		// �������� => ����
		// ���������� ����
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
				//readLine() => ������ ���� =(\n)
			}catch(Exception ex) {}
		}
		// ��ü������ ����
		public synchronized void messageAll(String msg) {
			try {
				for(Client user:waitVC) {
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}
}
