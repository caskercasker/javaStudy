// 5���� �̸��� �Է� �޾Ƽ� �����ϰ� => ����ϴ� ���α׷��� �ۼ�
import java.util.Scanner;
public class �迭6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[5];

		Scanner scan = new Scanner(System.in);

		for (int i=1; i<=name.length; i++) {
			System.out.println(i+"���� �̸� �Է�");
			name[i-1] = scan.next();
		}

		for (String names: name) {
			System.out.println(names);
		}
		/*
		 * for (int j = 0; j<5; j++) { System.out.print(name[j]+"\t"); }
		 */		//���
		//for-each => �迭, ����ü(Collection)
		/*
		 * int[] data = {1,2,3,4,5};
		 * for(int i=0, i<data.length; i++)
		 * {
		 * 	System.out.println(data[i])
		 *
		 *
		 * for(int i:data)
		 * {
		 * 		System.out.println(data[i])
		 * } //������ ���� �޾ƿ´�. ���� ������ ����.. NULL ���� ������ ����
		 *	//�������� ��ġ�� �߿��ϴ�. ū �����͸� �޴°� ����� ����.
		 *
		 */




	}

}
