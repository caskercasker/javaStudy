/// ��ǻ�� ����, ����� �Է� ==> ����,����,��
import java.util.Scanner;
public class �������ǹ�_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,2
		int com = (int)(Math.random()*3);




		Scanner scan = new Scanner(System.in);
		System.out.println("����(0),����(1),��(2)");

		int user = scan.nextInt();

		if(com==0)
			System.out.println("��ǻ��:����");
		if(com==1)
			System.out.println("��ǻ��:����");
		if(com==2)
			System.out.println("��ǻ��:��");
		if (user == 0)
			System.out.println("�÷��̾�:����");
		if (user == 1)
			System.out.println("�÷��̾�:����");
		if (user == 2)
			System.out.println("�÷��̾�:��");

		//���
		int result=com-user;
		if(result==-1 || result==2)
			System.out.println("�÷��̾�Win!!");
		if(result==1 || result==-2)
			System.out.println("��ǻ�� win!");
		if(result ==0)
			System.out.println("����");
	}
}






