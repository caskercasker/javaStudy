// 5���� ������ �Է� �޾Ƽ�  => 5�� ������ ���  ==> ��,���
import java.util.Scanner;
public class �迭7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		for(int i=0; i<a.length;i++) {
			System.out.println((i+1)+"��° ���� �Է� ");
			a[i] = scan.nextInt();
			sum += a[i];
		}

		for(int j:a) { //����Ҷ��� ��� ����ȯ�� ���� ������ �����δ� �Է� �Ұ���

			System.out.println("�Էµ� ������ "+j);
		}
		avg = sum/a.length;
		System.out.println("�հ�� " + sum + " ����� " + avg);
	}
}
