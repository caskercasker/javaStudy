/*
 * 	Map => Ű,��
 * 	Ű = �ߺ��� ����.
 * 	�� => �ߺ��� ����
 * 	=============> ���� =====> put(Ű,��)
 * 						����� ��  ==> get(key)
 *
 * 	Map (interface)
 * 	===============
 * 	������ Ŭ����
 * 	Hashtable
 * 	HashMap ==> Hashtable�� ������ Ŭ����
 */
import java.util.HashMap;
import java.util.Map;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("id", "admin");
		map.put("pwd","1234");

		System.out.println("ID:"+map.get("id"));
		System.out.println("PassWord"+map.get("pwd"));
	}

}
