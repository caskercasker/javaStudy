package com.sist.Exception1;
//오라클 연결 => CheckException
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//사용자 정의 jar 파일 C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext
//오라클 jar 파일 위치 C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
//printStackTrace 에러가 난 위치
//getMessage

//소켓을 닫아라, 오라클 연결에서 예외가 발생 하였을 때나 특정 행위를 완료 하였을때
//연결이 계속 추가되는 것을 막기 위해 finally 를 이용하여서 연결을 해제 해야함.

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null; //오라클 연결 (Socket)
		PreparedStatement ps = null; //SQL문장 전송 => 수신
		try {
			//1. 오라클 드라이버 설정 : thin(미들웨어, 연결만 ), oci(오라클 정보를 가지고 저장해둠 )
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. 연결
			//String url = "jdbc:oracle:thin:@localhost:1521:XE";//저정된 데이터의 위치 설정
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","happy"); //XML로 감춘다
			//방화벽 문제
			///conn=DriverManager.
			//3. sql문장
			String sql="SELECT ename,job,sal FROM emp";
			ps=conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) { //값이 없을 때 까지 true 빈테이블이면  false
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			rs.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			try {
				if(ps!=null) ps.close(); //먼저 끊고
				if(conn!=null) conn.close(); //connection  을 끊어야 함.
			}catch(Exception ex){

			}
		}
	}
}

//자바로 오라클을 설정할수 있어야함.도스창이 아닌 곳에서
