/*
 * StringTokenizer
 * =============== ���ڿ� �����ٶ� ����ϴ� Ŭ����
 * 1) ��ü������ ����
 * 2) ���ڿ� (0)
 * 	  id|pwd|avatar
 * 	  == === ====== Token ���̴�.
 *					split => ���Խ��� ����Ͽ��� ��
 *					Object �� String�� Ȱ���� �� ����.
 *		1. hasMoreTokens() //��ū�� �����ϴ� ����
 *		2. nextToken() //�����ϴ� �����
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
		String data ="admin|ȫ�浿|1234|����|����|1111-1111";
		StringTokenizer st=new StringTokenizer(data,"|"); //default ����
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
