// ���� ���� ��  ==> 5 	==> 1�� 3�� 1��
import java.util.Scanner;
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	int com = (int)(Math.random()*3);
	int i = 1;
	int win = 0;
	int draw = 0;
	int lose = 0;
	int user = 0;
	int cal = 0;

	System.out.println(com);
	while(i<=5)
	{
		System.out.println("����(0)����(1)��(2)�Է�");
		user = scan.nextInt();
		cal = com-user;
		/*if(cal == -1 || cal ==2) {
			win++;
		}else if (cal ==1 || cal == -2) {
			lose++;
		}else {
			draw++;*/
		switch(cal) {
		case -1 :
		case 2:	win++;
			break;
		case 1:
		case -2 : lose++;
			break;
		default: draw++;
		}
		i++;
		}


		System.out.println(win+"��"+draw+"��"+lose+"��");
	}

}
