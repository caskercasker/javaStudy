package com.sist.io2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
/*
 * 	클래스의 종류
 * 		= 일반 클래스
 * 		= 추상 클래스 (인터페이스)
 * 		= 내부 클래스
 * 			1) 클래스 끼리 데이터를 공유  => static		=> 멤버 클래스
 * 				class A{
 * 					class B{
 * 					}
 * 				}
 * 				Server가 가지고 있는 모든 변수를 공유
 * 			2) 상속없이 override 사용	=> 익명의 클래스
 */
public class Server implements Runnable{
	private ServerSocket ss;
	private final int PORT=8888;
	private Vector<Client> waitVC = new Vector<Client>(); //접속한 유저의 정보 (ip, port) => Client 정보 통째로 저장 (+id)

	//서버 가동 =>> Server => 메모리 할당을 한번만 사용
	public Server() {
		try {
			ss = new ServerSocket(PORT); //default 50명 용 서버
			//개통 => bind, 대기상태 => listen
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//접속은 Main 이 받음....
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//교환을 위한 waitVC정보를 저장 함.
		// 접속시에 처리
		while(true) {
			try {
				//접속시에 클라이언트의 정보를 받아서 저장하고 => 쓰레드로 전송
				//접속시에 정보 ==> Socket(ip,port) 값이 합쳐서 들어감
				Socket s = ss.accept(); //접속이 되면 호출되는 메소드
				//Socket ==>  클라이언트 (유저)
				Client client = new Client(s);
				waitVC.add(client);
				//접속한 사람의 정보를 저장
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	// inner 클래스 => Thread (자원을 만들기 보다 받아야 되기 때문에), 윈도우 => 빅데이터
	class Client extends Thread{//[멤버 클래스] port와 서버 소켓 정보를 공유 해야 되는데, 다른 클래스를 생성하게 되면 서버가 두번 생기게 되서 오류가 생김
		//Server가 가지고 있는 모든 데이터를 사용 할 수 있다.
		Socket s;	//클라이언트와 연결 전화기 (연결 기계 => 소프트웨어 제작)
		OutputStream out; //클라이언트로 결과값을 전송
		BufferedReader in; //클라이언트로부터 요청값을 받는다.
		public Client(Socket s) {
			try {
				this.s = s;
				out = s.getOutputStream();// 클라리언트로 값을 전송할 목적으로
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			}catch(Exception e) {

			}
		}

	}
}
