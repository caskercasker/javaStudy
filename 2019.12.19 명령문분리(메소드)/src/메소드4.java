/*
 * 	=====================
 * 	 1. �޼ҵ� ȣ��
 * 	 2. �޼ҵ� ������� ����
 * 	 3. ��� �ȿ� �ִ� ��� ���� ����
 *   4. �޼ҵ� ȣ���� ��ġ�� ���ư���.
 *  =====================
 *
 *	 �Խ���
 *
 *	  ������ (�������� �Ű�����, ��°��� ��ϰ�(�迭)?) �ּҸ� �ѱ� �� ���ڸ� ���� �Ű������� ��´�.
 *   ���뺸�� (Ŭ������ ����, �Ű������� ��ȭ ���� ��ȣ)
 *
 *   �۾���      	}
 *   �����ϱ�	}
 *   �亯�ϱ�	}
 *   �����ϱ�     }	void�� ��Ϻ���� ���ư���??
 *
 *   ã�� (�Ű����� �˻���, ��°�(����� �迭)
 *   //��ɺ��� ����...
 *
 *   ex> �α���
 *   	�Ű������� ���̵�� PWD
 *
 *   	������(��� ���ڿ�) (����� ���� ����) �ĺ� )int, char, String
 *   	1. ���̵� ����
 *   	2. ��й�ȣ�� Ʋ����
 *   	3. �α��� ����
 *
 *   �޼ҵ带 ���鶧
 *   1. ���� �־��ְ� ������ �Ѵ�. 		set (void)
 *   2. ���� ������ ���� �ʹ�. 			get (return �� ����)
 *   3. �����ϴ��� ���ϴ���  boolean		is
 *
 *   boolean a  isLogin
 *
 */
import java.util.Scanner;

public class �޼ҵ�4 {
	static void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}

	}
	static String gugudan2(int dan) {
		String result = "";
		for(int i=1; i<=9; i++) {
			result+=dan+"*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
	static void gugudan(double d) { //�����ε�?
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d\n",d,i,d*i);
		}

	}
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� �Է�: ");
		int dan = scan.nextInt();
		//
		String res = gugudan2(dan);
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
