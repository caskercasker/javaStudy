/*
 * ����
 * = instance ���� : ���� => new �޸𸮸� ���� ���
 * = static  ���� : ������ �� ��  ==> �޼ҵ忡�� ����� �Ұ���
 * 	static �� Ŭ���� �ȿ����� ���.
 *  �޼ҵ� (���, ����)
 * ===============> �ڵ� �ʱ�ȭ
 * = ���� ����  : �޼ҵ� ȣ�� ��
 * ===============> �ݵ�� �ʱ�ȭ�� �Ѵ�.
 *
 *
 */


class Data{
	// ���� ���� (���� => ����ó��, ���, �޼ҵ�ȣ��)		==> {}

	int a; //0
	float f; //0.0F
	double d; //0.0
	boolean boo; //false
	long l; //0L
	char c; //'\0'
	String s="Hello"; //null
	String ss = "";
	//��������δ� �ʱⰪ�� ����. �ڵ�����.......
	//null �ּҰ� ����. null point exception
	static int aa;
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Data.aa);
		/*
		 * Data dd = new Data(); System.out.println(dd.a); System.out.println(dd.boo);
		 * System.out.println(dd.c); System.out.println(dd.d); System.out.println(dd.f);
		 * System.out.println(dd.l); System.out.println(dd.s);
		 * System.out.println(dd.ss);
		 */

	}

}
