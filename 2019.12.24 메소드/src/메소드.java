/*
 * �޼ҵ�
 * 1) ����
 * 		������ �޼ҵ�� (�Ű�����...) ==> �����
 * 		===
 * 		{
 * 			��� ����
 * 			return �����
 * 					=== 	������ == �����
 * 		}
 * 		==> �������� ���� ��� ==> return �� ������ �� �ִ�.
 * 		==> ��� �޼ҵ�� �����ϱ� ���ؼ� �ݵ�� �������� return �� ����Ѵ�.
 * 			����  => ���ǹ��� ����ؼ� return �� ��� �� �� �ִ�.
 * 			=> return �� �Ʒ��� � ���嵵 ����� �Ұ��� �ϴ�.
 * 		display(10); => �޼ҵ� ȣ��
 * 		static void display(String a){
 * 			System.out.prStringln(a);
 * 			if(a==10)
 * 				return;
 * 			System.out.prStringLn(a+1); //����
 * 		}
 *  2) ������ : �⺻��, Ŭ����, �迭
 *  	String method()
 *  	Movie method()
 *  	String[] method()
 *  	��� ���� ���� ��� => void
 *  3) �Ű����� : ����� ��û��
 *  	=> 3���̻��̸� ��� ��û => �迭, Ŭ����
 *  		ȸ������(Ŭ����)
 *  		�Խ��� �۾��� (Ŭ����)
 *
 *  4) �Ű����� ���۹�
 *  	=> call by value : �⺻��, String
 *  	================== �޸𸮸� ���� ���� (����(��))
 *  	=> call by reference : �迭, Ŭ����
 *  	================== ���� �ּҸ� �̿��ؼ� ���� ����
 *
 *  5) ȣ��
 * 		�޼ҵ��()
 * 		�޼ҵ��(10,20)
 * 		============ return �� ���� ���
 * 		�������� ���� = �޼ҵ�()
 * 		�������� ���� = �޼ҵ�(19,20)
 * 	*** ��� �޼ҵ�� ������ ������ ������ �ٽ� ȣ���� ��ġ�� ���ƿ´�.
 *  *** �޼ҵ带 ������ ȣ��� => �Ѱ��� �޼ҵ尡 ������ �����ؾ�
 *  					 ���� �޼ҵ带 ȣ��
 *  	a()
 *  	b()
 *  	c()
 *  	===============
 *  		c()
 *  	===============
 *  		b()
 *  	===============
 * 			a()  		-->  ����  (����ȭ ���, full stack)
 * 		===============
 *
 *
 *
 */

//�Ű����� ���� -> call by value
public class �޼ҵ� {
	static void swap(String a, String b) {
		System.out.println("������ => swap: a="+a+",b="+b);
		//System.out.prStringln("������ :");
		//����
		String temp = a;
		a=b;
		b=temp;

		System.out.println("������ =>swap : a="+a+",b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="HELLO";
		String b="JAVA";
		swap(a,b);
		System.out.println("main: a="+a+",b="+b);
	}

}
