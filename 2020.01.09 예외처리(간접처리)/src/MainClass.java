import java.io.IOException;
import java.sql.SQLException;

class MyException {
	//������ �����߿� ����Ǵ� ������ �ִ� => �ý��ۿ� �˷��ش�. => throws
	public void display() throws NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException{
		System.out.println("Myexception:display()Call......");
	}
	public void display1() throws IOException, SQLException{
		System.out.println("Myexception:display1()Call......");
	}
}
public class MainClass {

	public static void main(String[] args) {// throws IOException, SQLException
		// TODO Auto-generated method stub
		MyException me = new MyException(); //me�ּҿ� display() ����
		me.display(); //RuntimeException => ���� ����
//		try {
//			me.display1();
//
//		}catch(IOException e) {}
//		catch(SQLException e) {}
		try {
			me.display1();
		}//catch(Exception e) {}
		catch(Throwable e) {}
	}

}
