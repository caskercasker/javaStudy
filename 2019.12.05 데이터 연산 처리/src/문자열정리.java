/*
 * 	String : ���ڿ� ����
 * 	=======
 * 	���
 * 	1) ���ڿ��� �и� substring()
 * 	2) ���� ã��	indexOf(), lastIndexOf()
 * 				c:\javaDev\javaStudy      [index�� \]
 * 
 *  3) ���� ��	equals() ===>  ��ҹ��� ����
 *  			equalsIgnoreCase ===> ��ҹ��� ������ ���� ���
 *  4) ���鹮�� ���� trim() ///���̵� �Է� ���� ���� �ν��ؼ� ������, ��ĭ�� �Է� ���� �ʰ� ���̵� �Է��� ����Ѵ�. ����� ���� �ȵ�
 *  5) ��ҹ��� ���� toUpperCase, toLowerCase
 *  6) ��� ���������� ���ڿ��� ���� valueOf()
 *  7) ������ ���� length()
 *  8) ���� => replace, replcaceAll
 *  
 *  String ==>  char[]
 *  
 *  String ��ü �ּҴ� 4byte
 *  
   ex> ������
 */
public class ���ڿ����� {
	public static void main(String[] args) {
	String s=" Hello Java!! ";
	System.out.println("���ڼ�"+s.length());
	System.out.println(s.substring(0,5));
	//5�� ����
	System.out.println(s.replace("l", "k"));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s);
	System.out.println(s.trim());
	
	System.out.println(s.indexOf("l"));
	System.out.println(s.lastIndexOf("l"));
	
	String s1="Hello";
	String s2="hello";
	
	boolean res = s1.equals(s2);
	System.out.println(res);
	
	String res1=s1.equalsIgnoreCase(s2)?"����":"�ٸ���"; //��ҹ��� ���о��� ��
	
	System.out.println(res1
			);
			
	
	}
}
