// euqals => return (boolean)
// 저장된 문자열이 같은지 확인
//

import java.util.Scanner;
public class 문자열클래스2 {
	static boolean isLogin(String id, String pwd) {
		boolean bCheck = false;
		final String ID = "admin";
		final String PWD = "1234";

		if(id.equals(ID)&&pwd.equals(PWD)){
			bCheck = true;
		}
		return bCheck;
	}
	static void process() {
		Scanner scan = new Scanner(System.in);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
	}

}
