/*
 * 	Wrapper Ŭ����
 * 	=======
 * 	�⺻��  (int, long ..) ���� ��� �����ϰ� ������� Ŭ����
 *  int ===> Integer		==> BOXING, AUTOBOXING
 *  Integer ii = new Integer(10);
 *  int i = ii.valueOf();
 *  int i = ii;
 *  Integer ii = 10; //���������� Ŭ������ ������
 *
 *  double ===> Double
 *  byte ====> Byte
 *  boolean ===> Boolean
 *
 *  ==> String s= "100";
 *  	int i=(int)s;
 *
 */

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer a = new Integer(10);
//		int i = a;
//		int k = 1000;
//		Integer kk=k;
//		//AutoBoxing �ڵ����� Ŭ������ ���������� ��ȯ��.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("���� �Է�");
//		String no1 = scan.next();
//
//		System.out.print("���� �Է�");
//		String no2 = scan.next();
//		//���ڿ� ���� ��ȯ���� ������ ����
//		System.out.println(Integer.parseInt(no1)+Integer.parseInt(no2));
//
//		Integer b = 1;
//		Integer c;
//		c = a+b;
//		System.out.println(c);
//	}
		String s = "true";
		if(Boolean.parseBoolean(s)) { //s.equals �� ���� ,static �޼ҵ� �޸� �Ҵ� ���� ���
			//���� ���� ���� ��Ʈ�����ڷ� �ٷ� ������ �ٷ� �Ǹ� static �޼ҵ�
			System.out.println("���");
		}
		String score="4.5";
		System.out.println(Double.parseDouble(score)+1);
		boolean b= true;
		System.out.println(String.valueOf(b)); //String Ŭ������ ������ Static �޼ҵ�
	}
}
