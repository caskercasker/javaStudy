// String : ���ڿ��� ����
/*
 *
 * java.lang => import�� �����Ҽ��ִ�.
 *  ���ڿ��� �����ϴ� ���
 *  	1) String ������ = "Hello Java ";
 *  	2) String ������ = new String("Hello Java"); //���� ���ڿ� => ������ ����
 *  					====
 * 	 					���ο� �޸𸮿� ����.
 * 	String ���� �����ϴ� ���
 * 	1) equals : ����� ���ڿ� ������ ���� Ȯ�� (true/false)
 * 		ID, PWD ==> �α���(��ҹ��� ����)
 * 		���ڿ��� (==)�� ����ϸ� �ʵȴ�.(X)
 *
 * 		String s = "Hello";
 * 		String s1 = "Hello";
 * 		String s1 = new String ("Hello")
 * 		if(s==s1)	true; //���ڿ� �ּҰ� ����.. ���� ������ ���Ѱ��� �ƴ϶� ������ �ּҰ��� ����. "���� ���ڿ��� ���� �Ǿ��� ������"
 		if(s.equals(s1))// value�� ���ҋ� ���.
 *
 *		=> ����
			boolean eaquals (String data)

 * 	2) substring : ���ڿ��� �ڸ� ��							-- �� ���������� ��ġ�� ���ڸ� �������ų�, �������z �������� ���°� �������� ���� �� ���ڿ��� �ڸ���.
 * 			String s = "0123456789";
 * 			substring(3) => "3456789"
 * 			String s = "112��, 15�� �̻� ������"
 * 			substring(0,3) => "112"
 * 						===
 * 						end-1 ==> 0,1,2 �ڸ�
 * 			substring(int start)
 * 			substring(int start, int end)
 *
 *  3) length : ���ڿ� ����
 *   	String s = "Hello ȫ�浿"; //c���� �ѱ��ڴ�  2byte �� �б� ������ ���ڿ��� ������ 9
 *
 *  4) trim : �¿��� ���鹮�� ����									-- �Ǽ��� �Էµ� ���ڿ��� ������ �����Ѵ�.
 *
		String s = "Hello Java";
				=> s.length
 *  5) startWith,endWith //���� ���ڿ��� �������/ ������ ���ڿ��� ���� ���  // �˻���??
 *  	startsWith("�ڹ�")
 *
 *
 *  6) indexOf, lastIndexOf  				//��θ� �� '/'�� ���еǼ� ���� ����.
 *  	������ ��ġ (indexOf:�տ��� lastIndexOf:�ڿ���)
 *  	String s = "Hello Java";
 *  				0123456789
 *  	s.indexOf('a') ==>  7
 *  	s.lastIndexOf('a') ==>  9
 *
 *  7) split
 *	   String s = "�̺���, ������, ������, ������, ����";
 *	   String[] names = s.split(",")
 *		���Խ�
 *		====
 *		211.238.132.181
 *		211.238.142.180
 *		211.238.142.1
 *		211.238.1.1
 *		211.238.142.0
 *
 *		[0-9]{1,3}\\.[0-9]{1,3}
*
 *
 *
 *  8) toUpperCase, toLowerCase
 *  	�빮�� ��ȯ, 	�ҹ��� ��ȯ
 *  	String s= "Hello";
 *  	s.toUpperCase(s) ==> HELLO
 *  	s.toLowerCase(s) ==> hello
 *  9) replace , replaceAll ==> ���Խ�
 *  			String s="113��"
 *  			s.replaceAll("[^0-9]"," ")==>113 //���ڸ� �����ϰ� ��� �������� �ٲ��  ,, ��ȣ���ο��� ���� $ ������..
 *  			s.replaceAll("^[0-9]"," ")  //���ڷ� ������. '^' ��ȣ �� ���� �ǹ�
 *				s.replaceAll("[^��-�R]"," ")  = �ѱ��� �����ϰ� ��� �������� �ٲ��
 *				s.replaceAll("[^A-Za-z]"," ") = ������ �����ϰ� ��� �������� �ٲ��.
 *
 * 10) contains() : ���Ե� ���ڸ� ã�� ���
 *
 *  	======
 *  		���� ==>  String s="Hello Java"
 *  				s.replace('a','b') ==> "Hello Jbvb"
 *
 *
 *
 *  �ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�
 *  String ��  char[] ���°� ����� Ŭ�����̴�.
 *
 *
 */
import java.util.Scanner;

public class ���ڿ�Ŭ���� {
	static String[] autoComplete(String data) {
		String[] ss = {"�ڹٿ� JSP","�ڹ� ���α׷���","������ 5","AJAX �� JSP","�������� ����Ʈ",
						"�ڹ� ����Ŭ","mvc ����","��Ʋ���� �ȵ���̵�","��Ʋ�� ���α׷�","������ ������",
						"ȥ�ڹ��� �ڹ�","������ �� ���α׷�","�� ���α׷�","�ڹ� �����α׷�","����Ŭ �ڹ�"};
		String[] findData = new String[10];
		int j=0;
		for (int i=0; i<ss.length;i++) {
			/*
			 * if(ss[i].startsWith(data)) { findData[j] = ss[i]; j++; }
			 */
			if(ss[i].contains(data)) {
				findData[j] = ss[i];
				j++;

			}
		}
		return findData;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� �Է�:");
		String data = scan.next();
		String[] fd =autoComplete(data);
		for(int i=0; i<fd.length; i++) {
			if(fd[i]!=null) {
				System.out.println(fd[i]);
			}
		}
	}

}
