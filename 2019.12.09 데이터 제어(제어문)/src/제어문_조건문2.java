// if ���๮���� ����
/*
 * 	if(���ǹ�)
 * 		���๮�� 1	=====> if�� �Ҽӹ���
 * 		���๮�� 2 =====> if�� ������ ���� ���� => true/false�� ���� ���� ������ ���� ����
 * 		=> �ڹٿ��� ��� ����� {}�� ���� ��� �ѹ��常 ����
 *
 *		if(���ǹ�)
 *	{
 *		���๮�� 1 ===> ������
 * }
 * 		���๮�� 2
 *
 * ==> ������, ����ȭ, (�����丵), ���̱׷��̼� (Spring ==> SpringBoot) Ajax <-> React
 * 	abc() ==> add()
 *  def() ==> minus()
 *
 */
public class ���_���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		//�������� ���๮���� ���ÿ� ���� �ҋ� ����ϴ� ���ǹ�
		if(num%2!=0) {
			int b = 100;

			System.out.println("b��"+b+"�Դϴ�");
			System.out.println(num+"��(��) ¦���Դϴ�");
			System.out.println("���α׷�����");
			b++;
		}
		//System.out.println(b); //==> {}�ȿ����� ����ϴ� ���� ��������
	}

}
