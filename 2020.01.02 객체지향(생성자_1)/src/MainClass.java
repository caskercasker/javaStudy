/* 	Ŭ������ �������
 * 	=================
 * 	���� (��������, �������)
 * 	=> �ٸ� Ŭ�������� ����� ����
 * 	=> �޸𸮿��� �����Ǵ� ������ ���α׷� �����
 * 		(�޸� => heap)
 * 	==================
 * 	������ : ��������� ���� �ʱ�ȭ ���
 * 	Ư¡)		1.Ŭ������� ����
 * 			2. �������� ����(void�� ������)
 * 			3. �����ڴ� ������ ���� �� �ְ�
 * 				������� ���� ���� �ִ�. =====> JVM�� �ڵ����� �����ڸ� ����..........
 * 			4. �����ε��� �����Ѵ�.
 * 				======
 * 				1) �Ѱ��� Ŭ���� �ȿ��� ���� �̸��� �޼ҵ带 ������ ���
 * 					=========
 * 				2) �Ű������� �ٸ���.(�Ű������� ���������� �ٸ���, ������ Ʋ���� �ٸ� �޼ҵ带 �ν�)
 * 				3) �������� �������.
 * 					void display()
 * 					int display() 		���� �޼ҵ�� �Ǵ�.
 * 				4) ����� ����.
 * 					plus(int a, int b)
 * 					plus(double d1, double d2)
 *
 * 			5. ��� ���� ���� (������ ,static) ������ �Ұ���
 *
 * �����ڵ� �޼ҵ�
 * EX> �����츦 �׸��� ���� (setVisible, Set title)
 * �����ڿ��� ���� �Ҽ��� �ְ�, �޼ҵ忡�� �����Ҽ��� �ִ� (�����ڿ��� �����ϰ� �Ǹ� ������ �Ұ���, ��ӹ��� ���ϱ� ������)
 * =====================
 * 	===> ��ɹ��� ���� => ���õ� ����� ��Ƽ� ó��  (������ ���α׷�)
 * 	 �޼ҵ� : ��������� Ȱ�� => ���
 * 		   ����ó�� = ��� ó��
 * 		  => ����� ��û�� ó��
 * =====================
 */
public class MainClass {
	String name="ȫ�浿";
	String sex = "����";
	int age = 30;
	//�ʱ�ȭ => MainClass mc = new MainClass()
	public MainClass() {
		// �ʱ�ȭ ==> ������, ��Ʈ��ũ, �����ͺ��̽�
		name = "��û��";
		sex = "����";
		age = 25;
	}
	//�Ű������� ������ �ִ� ������(�����ε�)
	public MainClass(String sex, String name, int age) {
		// �������� �켱..
		// �������� ������� ���� ==> ���������� �켱 ����
		this.name = name;
		this.sex = sex;
		this.age = age;
		// �ڽ��� ��ü �ּ� => this => �ݵ�� �޼ҵ� �ȿ����� ����� ����.

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MainClass mc = new MainClass(); //static�� �ƴ� ������ ��������� ������ ���� �����ؾ� �Ѵ�(new)
		 * //�����ڴ� ȣ��� �ݵ�� new�� �����Ѵ�. System.out.println(mc.name);
		 * System.out.println(mc.sex); System.out.println(mc.age);
		 */
		MainClass mc = new MainClass("����","��û��",25);
		System.out.println(mc.name);
		System.out.println(mc.sex);
		System.out.println(mc.age);

		System.out.println(new MainClass("����","�ڹ���",10).name);

		//new�� ���� this�� ������ �ִ� �ּҰ��� �޶�����?


	}

}
