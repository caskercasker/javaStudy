/* ex)
 * class Sawon{
 * 		String name;
 * 		String dept;
 * 		static String company;
 * }
 * ����ƽ�� �ٸ� ������ ���� �����.
 * sawon s1 = new Sawon();
 * 					======== �ʱⰪ �־�� ����. �����ڸ� �ִ� �κ�.
 * 			----
 * 			�޸��Ҵ�, �ּ� �� �Է�

 * ������ �ּ� 		|		���� �����Ͱ� ���� ��.
 * ����						��
 * ����� ����� ����/
 *
 * �������� �Ű����� ���
 * ������� �Ķ���
 * ����ƽ �ʱ�ü.
 */

// ������ �켱������ => ��������(�޼ҵ峻 ��������,�Ű�����) {}�� ����Ǹ� ������� ����

class Sawon{
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;
	static String company;

//	public Sawon(int a){
//		//int sabun = 10;
//		//sabun = sabun; // �޼ҵ� �ȿ����� ��������/�Ű����� �� �켱������ ����.
//		//���������� ��������� �̸��� ���ư� ������ �ȴ�. // �����ϴ� �޸� ������ �ٸ��� ������.
//
//		int a = 10;
//		this.sabun = a;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1 = new Sawon();
		s1.sabun = 1;
		s1.name = "Ȧ�浿";
		s1.dept = "���ߺ�";
		s1.loc = "����";
		s1.pay = 3500;
		s1.company = "SIST";

		Sawon s2 = new Sawon();
		s2.sabun = 1;
		s2.name = "Ȧ�浿";
		s2.dept = "���ߺ�";
		s2.loc = "����";
		s2.pay = 3500;
		s2.company = "SIST2";

		Sawon.company = "SIST3"; //Ŭ���� �̸��� ���ؼ��� ������ �����ϴ�.

	}

}
