package com.sist.io;
import java.net.ServerSocket;
import java.net.Socket;


/*
 *	MVC, Spring, Kotlin
 *	====================
 *  서버 :
 *  	대기서버 => 1개	==> 연결기기 (Socket) => 전화기 accept 에서 저장을 한후. read()/write()가 교차.
 *  																1byte씩 보내고(OutputStream)	 2byte씩 받아야 한글이 안깨짐 (Reader)
 *  																encoding decoding
 *  			ServerSocket => 접속시 처리 (접속만 함) ip,port를 확인
 *  	통신서버 => 접속수만큰 생성 (Thread)
 *				Socket => 실체 통신
 *
 *	서버 => 여러개의 통신하는 프로그램이 필요
 *			========= 동일
 */
public class Server implements Runnable {
	private ServerSocket ss;
	private Server() {
		try {
			ss=new ServerSocket(3355);  //생성자 완료시 대기(listen 상태까지 JVM이 함)
			//bind => 개통(통신이 가능)
			//bind => 1. IP, 2. Port
			//서버는 port => 고정 포트, 클라이언트 => 임시 포트 (자동으로 포트번호를 만든다 중복아 안되는)
			//listen => 대기상태
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
		//server에 있는 run함수를 호출
	}
	//쓰레드 작동
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) { //접속이 되었다면
			try {
				Socket s = ss.accept(); //접속한 클라이언트의 정보를 받아야함 (Socket)
				System.out.println("접속한 클라이언트의 IP:"+s.getInetAddress().getHostAddress()); //데이터를 저장해 두어야함.
				System.out.println("임시 포트:" + s.getPort());
				System.out.println("===================");
			}catch(Exception ex) {}
		}
	}

}
