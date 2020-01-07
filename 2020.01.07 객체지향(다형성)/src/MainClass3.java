/*
 * Ŭ������ ����
 * =========
 * 1. �߻�Ŭ���� : ���� => �������� ���� �޼ҵ带 �����ϰ� �ִ�.
 * 				�������� ��Ƶΰ� => �ش� ���α׷����� ����
 * 				1) ���� �ٸ� Ŭ������ ����
 * 				2) ������ Ŭ������ ��Ƽ� ����
 * 				3) ǥ��ȭ (������ ���)
 * 		public abstract class ClassName{
 * 			�Ϲݺ���
 * 			int a=10;
 * 			������ �޼ҵ�
 * 			public void display(){
 * 				====
 * 			}
 * 			������ �ȵ� �޼ҵ�
 * 			public abstract int disp();
 * 		}
 * 		=> �̿ϼ��� Ŭ���� => �ڽ��� �޸� �Ҵ��� �� �� ����. (new �� ����� �� ����)
 * 						�����ÿ��� �ݵ�� ������ ����Ŭ������ ���ؼ� ������ ����
 * 		��)
 * 			public abstract class A{
 * 				������ �ȵ� �޼ҵ�
 * 			}
 * 			public class B extends A{
 * 				��ӽÿ� �ݵ�� �����ؼ� ���
 * 			}
 * 			B b = new B();
 * 			A a = new A(); (X)
 * 			A a = new B(); (ǥ��)
 *
 * 			===============> Ŭ���� ��ü ����
 * 							  ==========
 * 								new�� ����, ���� �����ڸ� ������� ������ �߻�Ŭ����, �������̽�
 * 								List list = new ArrayList();
 * 2. �������̽� : �߻�Ŭ������ ����
 * 				���� �ٸ� Ŭ���� ����
 * 				ǥ��ȭ �۾� (������ Ʋ������ �ִ�)
 * 				�������� ���õ� Ŭ������ ��� ����
 * 		public interface Interface�� {
 * 			����
 * 			int a=10;			===> public static final int a=10; (����� ����)
 * 									====================
 * 									������ �� �ִ�.
 * 			�޼ҵ� (������ �ȵ� �޼ҵ�)
 * 			void display(); 		====> public abstract void display();
 * 										  =================
 * 			public void disp();		====> public (abstract) void disp();
 * 		}
 * 		===> ���̺귯��
 * 			 Swing => �̺�Ʈ ó��
 * 			 ================
 * 			 ������Ʈ
 * 				JButton
 * 					=> JButton	=> JButton, JMenu,
 * 					=> ToggleButton => JRadioButton, JCheckBox
 * 				================================================
 * 						=> ó�� => interface : ActionListener
 * 								=> actionPerformed()
 * 				�Է�â
 * 					����
 * 						JTextField => JPasswrdField
 * 					������
 * 						JTextArea(�޸���) = > JTextPane(�ѱ۹���)
 *  			================================================
 * 						=> ó�� => interface : ActionListener
 * 								=> actionPerformed()
 * 				������
 * 					JTable	=> MouseListener
 * 					JTree	=> MouseListener
 * 					JList	=> ItemListener
 * 					JComboBox	=> ItemListener
 * 				================================================ Key Listener
 * 					    =======
 * 						1) �ڵ� ȣ��
 * 						2) ������ �޼ҵ�
 * 			�����ͺ��̽� => DB
 * 			Collection map (Ű���� ������ ����Ǿ� �־�, Ű������ �����͸� ����) Spring
 * 					   set (�ߺ��� ����� �ȵ� ������ �η����� ) -> Ʈ��
 * 					   list (�ε����� ����, �ߺ� ���)
 *
 * 3. ����Ŭ����
 * 		= ��� Ŭ���� : ������ ����   	(�����쿡 ���õ� ��� ���� �ϱ� ���� ������)
 * 			public class A	{
 * 				O X => �ڿ�
 * 				class B{
 * 				}
 * 			}
 * 		= �͸��� Ŭ���� : ��Ӿ��� �������̵�, �޼ҵ� �߰��� ����
 * 			���������� ���� ����? ����� ���� �ʰ� ���ϱ� ���ؼ�?
 *
 * 			public class A{
 * 				B b = new B(){
 * 					public void display(){}
 * 					public int plus(){}
 * 				};
 * 			}
 * 			public class B{
 * 				public void display(){}
 * 			}
 * 		= ���� Ʋ����
 * 			public class A{
 * 				public void display(){
 * 					class B{
 * 					}
 * 				}
 * 			}
 * 4. ���� Ŭ����
 * 		public final class A{
 * 		}
 */

//�޸𸮿� ����(�Ҵ�) ���� => ��� �޼ҵ尡 ����
abstract class Ani{
	public abstract void walking();
	public abstract void eating();
	//�ݵ�� ������ �Ǿ���� �κ�
	public void setName() {
		System.out.println("");
	}
	//������ ������ �˼� ���� �κ� �ʿ��ϸ� �������̵� Ȥ�� Ȱ��
	//�ʿ�ÿ� ������(�������̵�)
}
class Human extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("����� �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("����� �Դ´�");
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		System.out.println("ȫ�浿�̴�");
	}
}

class Dog extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("���� �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}

}
class Pig extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("������ �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}

}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ani ani = new Human();
		ani.walking();
		ani.eating();
		ani.setName();

		ani = new Dog();
		ani.walking();
		ani.eating();
		ani.setName();

		ani = new Pig();
		ani.walking();
		ani.eating();
		ani.setName();

	}
}
