import java.io.IOException;
import java.sql.SQLException;

class MyException {
	//구현된 내용중에 예상되는 에러가 있다 => 시스템에 알려준다. => throws
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
		MyException me = new MyException(); //me주소에 display() 저장
		me.display(); //RuntimeException => 생략 가능
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
