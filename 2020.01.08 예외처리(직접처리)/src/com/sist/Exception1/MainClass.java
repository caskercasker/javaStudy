package com.sist.Exception1;
//����Ŭ ���� => CheckException
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//����� ���� jar ���� C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext
//����Ŭ jar ���� ��ġ C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
//printStackTrace ������ �� ��ġ
//getMessage

//������ �ݾƶ�, ����Ŭ ���ῡ�� ���ܰ� �߻� �Ͽ��� ���� Ư�� ������ �Ϸ� �Ͽ�����
//������ ��� �߰��Ǵ� ���� ���� ���� finally �� �̿��Ͽ��� ������ ���� �ؾ���.

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null; //����Ŭ ���� (Socket)
		PreparedStatement ps = null; //SQL���� ���� => ����
		try {
			//1. ����Ŭ ����̹� ���� : thin(�̵����, ���Ḹ ), oci(����Ŭ ������ ������ �����ص� )
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. ����
			//String url = "jdbc:oracle:thin:@localhost:1521:XE";//������ �������� ��ġ ����
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","happy"); //XML�� �����
			//��ȭ�� ����
			///conn=DriverManager.
			//3. sql����
			String sql="SELECT ename,job,sal FROM emp";
			ps=conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) { //���� ���� �� ���� true �����̺��̸�  false
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			rs.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			try {
				if(ps!=null) ps.close(); //���� ����
				if(conn!=null) conn.close(); //connection  �� ����� ��.
			}catch(Exception ex){

			}
		}
	}
}

//�ڹٷ� ����Ŭ�� �����Ҽ� �־����.����â�� �ƴ� ������
