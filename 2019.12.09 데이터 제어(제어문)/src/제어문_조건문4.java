//�Է�(����) => �⵵ ����
/*
 * 4�� ����
 * 100�� ���� ����
 * 400�⸶��
 * ============ �θ��ô� (����)
 * ��ȣȭ
 *
 * ABCD
 * DEFG
 *
 */
import java.util.Scanner;
public class ���_���ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵ �Է�");
		int year=scan.nextInt();
		if((year%4==0 && year%100!=0)||year%400==0)
			System.out.println(year+"���� �Դϴ�.");
		else if (!(year%4==0 && year%100!=0)||year%400==0){
			 System.out.println(year+"�� ������ �ƴմϴ�.");
		}else {
		}
	}

}
