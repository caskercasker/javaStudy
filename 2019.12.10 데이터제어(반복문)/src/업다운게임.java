/*
 * 	��ǻ�� => 1~100 ������ ������ ���� ����
 *
 *  ��Ʈ => UP/dOWN
 *
 */



import java.util.Scanner;
public class ���ٿ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random()*100+1);
		Scanner scan = new Scanner(System.in);
		//System.out.println("���� �Է�");
		int user = 0;

		System.out.println(a);
		/*
		 * while(user!=a) { System.out.println("���� �Է�"); user = scan.nextInt();
		 * if(a>user) System.out.println("UP"); else if(a<user)
		 * System.out.println("Down"); else break; } System.out.println("������"+a);
		 */
		while(true)
		{
			System.out.println("1~100������ ���� �Է�:");
			int users=scan.nextInt();
			if(users<1 || user>100) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;//while => ���ǽ����� �̵�
				//System.out.println("dfdf");
			}
			if(a>users) {
				System.out.println("�Է°����� ū���� �Է��ϼ���");
			}else if(a<user) {
				System.out.println("�Է°��Ҵ� �������� �Է��ϼ���");
			}else {
				System.out.println("Game OVer!!");
				//����
				break; //while �� ����
				//System.out.println("fkdjfdf");
				//System.exit(0); //���α׷��� ������ ����

			}
		}

	}

}
//break, continue ���Ŀ��� �۾��� ���� �ȵ�. ������ ���� ����.