/*
 * 	for : �ݺ���( �ݺ�Ƚ���� ����)
 * 	====
 * 	�Ϲ� for
 * 		����)
 * 			for(�ʱⰪ;���ǽ�;������)
 * 				���๮��
 *
 * 			=> �ʱⰪ => ���ǽ� => ���๮�� => ������ => ���ǽ�
 *
 * 			= �ʱⰪ  ==> 0
 * 			= ���๮���� ����
 * 				==============> �ѹ���{}(x),��������{}(o)
 * 			= ������ ==> 1����,
 * 			= ������ 1�� �̻�
				for(int i=0,j=1; i<=1 && j>=1;......
			= for(int i=0;.....) => �������� i�� for �ȿ����� ���)
			��������
						{
						��������
						}
 * 	���� for(jdk1.5�̻�) : �迭, �÷���(�����ͺ��̽�)
 *
 *  ====
 *  �޼ҵ�(�Ϲݸ޼ҵ�,���ٽ�(�Լ�������):JDK1.8)
 *
 *
 */
public class �ݺ���1 {

	public static void main(String[] args) { //public static ���� �ٲٱ� ����
		// TODO Auto-generated method stub
		int i=1;
		for(i=1; i<=10; i++) {
			System.out.println("i="+i);
		}
		System.out.println("i="+i);
		/*
		 * ABCD
		 * EFGH
		 * IJKL
		 * MNOP
		 *
		 * ABCD
		 * ABCD
		 * ABCD
		 * ABCD

		char c = 'A';
		for(int i=1; i<=4; i++) {
			for (int j=1;j<=4; j++) {
				System.out.println(c++);
			}
		}
	}*/
	}
}
