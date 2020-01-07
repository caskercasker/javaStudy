/*
 * 		�������̵�
 * 		======= �߻� Ŭ����, �������̽�
 * 		����� ����
 * 		�޼ҵ� ���� ����
 * 		�Ű����� ����
 * 		�������� ����
 * 		���� �������� Ȯ��
 * 		============
 * 			private < default < protected < public
 *
 * 		==> Interfcae I{
 * 				int a;			=> ���� ====> 	public static final int a = 10
 * 											===============================
 * 				void display();		=====>		public abstract void display();
 * 			}
 *
 * 			public A Implements I{
 * 				void display(){		==> ����
 * 				}
 * 			}
 *
 * 	����� �ȵǴ� Ŭ���� : ���� Ŭ����
 *  public final class
 *  ����� ���� : static , ������
 *
 */
class Super{
	public void display() {
		System.out.println("Super:display() Call");
	}
}
class Sub extends Super{
	@Override
	public void display() {
		System.out.println("Sub.display() Call");
	}
}
class Sub2 {
	Super su = new Super() {
		@Override
		public void display() {
			System.out.println("sub.display() Call");
		}
	};//�����ݷ��� ��ġ
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.display();
		Sub2 s2 = new Sub2();
		s2.su.display();
	}

}
