/*
 * 	�ڹ� (Ŭ������ ������) ==> �� ����. ������ ����  ���� ���
 *  �Ѱ��� ���Ͽ��� ���
 *  =============
 *  class A
 *  class C
 *  class D
 *  public class B
 *  ============= B.java ����...(public Ŭ������ �Ѱ��� ����)
 *
 *  class A
 *  class B
 *  ========
 *  public �� �ݵ�� �����ؾ���.
 *
 */
// ������ main �� �ִ� ���� ���� �ϴ� ��.




/*class Human {
 * 	String name;
 *  String sex;
 *  int age;
 *  }
 *
 *  Human hon = new Human();
 *  "new" ���� �޸��Ҵ� (������ �� �޸𸮰� ���������.)
 *
 */
class News {
	String title;
	String content;
	String author;
	String regdate;

	//���� �ϴ� ����
	//static String site;	//����� ���� �ϳ��� ����.. �޸� ������ �Ź� �Ҵ� ���� ����.  ���뺯��.
	// ���������� Ȱ���ϰ��� �ϸ�, �޼ҵ带 ���ؼ� ���� �޾ƿͼ� Ȱ��.

} //News ��������

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����  = ������ ����
		// �޸𸮸� �����
		News n1 = new News();
		n1.title = "\"8��° 1��\"..'��λ�', 450���� ����..'õ��' ���� ù�� 14�� ���� 2��";
		n1.content = "[OSEN=�ϼ��� ����] ��ȭ '��λ�'�� ��ź���� �̾� ��ȭ�� ������ ���� ������ ���װ�, 'õ��: �ϴÿ� ���´�'�� ù�� 2���� ������   �ڽ����ǽ� �ǵ��� �� �ٲ����. 27�� ��ȭ������";
		n1.author = "OSEN";
		n1.regdate = "19.12.27";

		//n1=new New(); �ּҰ��� �ٲ�� ������ �ִ� ���� ������ �ݷ����� ���.
		News n2 = new News();
		n2.title = "�����ԡ������� ��ȭ 'ī��Ʈ' ĳ����";
		n2.content = "��� �����Կ� �������� ��ȭ ��ī��Ʈ������ ȣ���� ����ٰ� ��޻� CJ�������θ�Ʈ�� 27�� ���ߴ�. �ݸ޴޸���Ʈ ��� ��ĩ���� ü������(������)�� �ָ� �ϳ��� Ÿ�� ���׾�(������";
		n2.author = "�ƽþư���";
		n2.regdate = "19.12.27";

		//���
		/*
		 * int a=10;
		 */
		System.out.println(n1.title);
		System.out.println(n2.title);
	}

}
