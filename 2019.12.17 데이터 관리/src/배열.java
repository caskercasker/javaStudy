/*
 * �迭=> ���������͸� �Ѱ��� �̸����� ���� => �ε���(÷��)�� �̿��Ѵ�.
 * 		** �ε����� 0���� ����
 * 1) ����
 * 		1.����
 * 			��������[] �迭�� //int name[] =
 * 							var
 * 			======
 * 				= �⺻Ÿ��(int, long,float,double....)
 * 					int[] arr
 * 					long[] arr
 * 					char[] arr
 * 				= ����� ���� Ÿ��(Ŭ����) Ŭ���� ��ü�� ������ ������ ���� �ؾ���.
 * 				class Movie // �ȿ� ���ִ� ������� �޼ҵ忡 ���ؼ� �� ũ�Ⱑ �ٸ� �迭��...
 * 				Movie[] arr  //#* Movie��� ������ ���� ���� �迭.......
 * 				String[] names
 * 				<String, �迭 > ������ ������
 * 				C/C++���� ���� java�� �ִ� ������ boolean
 * 		2.�ʱⰪ
 * 		= arr = {1,2,3,4,5,6}
 * 		= arr = new int[6] ==> ��ü �ʱ� ��(int:0, long:0L, String:null)
 * 			null ==> �޸𸮿� ����� �ּҰ��� �������� �ʴ´�.
 * 			> ���÷���(���շ��� ����), �ʿ��� ���� �����Ͽ� ���.) (������)  new �� ����ϸ� ������� ���.
 *
 * 		3.������ �б�
 * 			=arr[index] ==> �������� �Ѱ��� ����.
 * 		4.������ ����
 * 			=arr[1] = 10
 *
 *
 * 		���� �߱� ����
 * 		======== S B
 * 		=> ���� => 729
 * 		=> ����� �Է� => 567 => 0S-1B
 * 		=> 			 785 => 1S-0B
 * 					 793 => 1S-1B
 * 					 279 => 1S-2B
 * 					 729 => 3S-0B ==>break
 *
 */
//�ߺ����� ���� �߻�

//������Ʈ
/*
 * ����	������	 ���	���
 * 		========
 * 		�޼ҵ�
 * ==================== Ŭ����
 *
 *
 */
import java.util.Scanner;
public class �迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] com= {3,6,9}; //�ߺ����� ���� �߻� �޼ҵ�
		int[] com = new int[3];
		int su= 0;
		boolean bCheck = false;
		int overhead = 0;

		for(int i=0; i<com.length; i++) {

			bCheck = true;
			while(bCheck) {
			//�����߻�
			su =(int)(Math.random()*9)+1;
			bCheck = false;

			for (int j=0; j<i; j++) {
				if(com[j]==su) {
					overhead ++;
					bCheck = true;
					break;
				}
			}
			}
			com[i] = su;
		}

		int[] user=new int[3];

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3�ڸ� ���� �Է�:");
			int input = scan.nextInt();
			if(input<99 || input > 999) {
				System.out.println("�߸��� �Է�");
				continue; //������ ���� ���Ŀ� �ٽ� �Է� ����.
			}
			//�迭�� ����  ����
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			//����ó��  => �ߺ��� ���� ����� �� ����. 0�� ��� �� �� ����.
			//��ȿ�� �˻�
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("�ߺ��ȼ��� ��� �� �� �����ϴ�.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0�� ����� �� �����ϴ�.");
				continue;
			}
			//�񱳽���
			int s=0, b=0;
			for(int i=0; i<3; i++) {// i==> com
				for(int j=0; j<3; j++) { //j ==>user
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			//��Ʈ
			System.out.printf("input Number:%d,Result:%dS-%dB\n",input,s,b);
			//���� ���� Ȯ��
			System.out.println("===============================");
			System.out.print("S:");
			for(int i=0; i<s; i++) {
				System.out.print("��");
			}
			System.out.print("\nB:");
			for(int i=0; i<b; i++) {
				System.out.print("��");
			}
			System.out.println("\n===============================");

			if(s==3) {
				System.out.println("Gmae Over!!");
				break;
			}

		/*
		 * for(int i=0;i<3;i++) { com[i] = (int)(Math.random()*5)+1; }
		 *
		 *
		 * for(int i:com) { System.out.print("i="+i+"\t"); }
		 */
		}

	}
}
