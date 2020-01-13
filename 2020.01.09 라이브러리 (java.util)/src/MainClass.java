/*
 * StringTokenizer
 * =============== 문자열 나눠줄때 사용하는 클래스
 * 1) 객체단위로 전송
 * 2) 문자열 (0)
 * 	  id|pwd|avatar
 * 	  == === ====== Token 들이다.
 *					split => 정규식을 사용하여야 함
 *					Object 인 String을 활용할 수 있음.
 *		1. hasMoreTokens() //토큰이 존재하는 갯수
 *		2. nextToken() //존재하는 토근의
 *
 */
import java.util.StringTokenizer;
class Info {
	String id;
	String name;
	String pwd;
	String sex;
	String addr;
	String tel;
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="admin|홍길동|1234|남자|서울|1111-1111";
		StringTokenizer st=new StringTokenizer(data,"|"); //default 공백
//		String id = st.nextToken();
//		String name = st.nextToken();
//		String pwd = st.nextToken();
//		String sex = st.nextToken();
//		String addr = st.nextToken();
//		String tel = st.nextToken();
//
//		System.out.println("ID:"+id);
//		System.out.println("Name:"+name);
//		System.out.println("Pwd:"+pwd );
//		System.out.println("Sex:"+sex);
//		System.out.println("Address:"+addr);
//		System.out.println("Tel:"+tel);
		Info info = new Info();
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
