/*
 * 	����-����)
 * 			1		2	==> false
 *
 * 			i		i<=5  i++
 * 		for(�ʱⰪ;  ���ǽ�;  ������) => 1��
 * 		{			true
 * 				1	2		==> false
 * 			for(�ʱⰪ;���ǽ�;������) => 2��
 * 			{			true
 * 				���๮�� (2�� for) ===> 2�� ������
 * 			}
 * 			���๮�� (1�� for) === > 1�� for ������
 *			    *4
 *			   **3
 *		�𷡽ð�     ��ġ
 *		5		12345		1
 *		3		 234		2
 *		1		  3			3
 *		3		 234		4
 *		5		12345		5
 *		��ȯ
 *		���̾Ƹ��
 *
 *
 */
// �𷡽ð�, ��ȯ, ���̾Ƹ��
public class ���߹ݺ��� {
	//���밪 �Լ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		for (int i =1; i<=5; i++) {
			int k = Math.abs(i-3);

			if(k==2) {   //1�� 5���� ��
				for(int j=1; j<=5; j++) { //��ĭ��¿�
			    System.out.print("*");
				}
			}else if(k==1) { //2��° 4���� ��
				for(int j=1; j<=5; j++) {
					if(j==1 || j==5) {
						System.out.print(" ");
					}else
						System.out.print("*");
				}
			}else if( k==0) {
				for(int j=1; j<=5; j++) {
					if (j==3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
		System.out.println();//�ٹٲٱ�
		}
	}*/
		/*
		 * for (int i =1; i<=5; i++) { int k = Math.abs(i-3);
		 *
		 * if(k==2){ //2��° 4���� �� for(int j=1; j<=5; j++) { if(j==1 || j==5) {
		 * System.out.print("*"); }else System.out.print(" "); } }else if(k==1) {
		 * for(int j=1; j<=5; j++) { if (j==3) { System.out.print(" "); }else {
		 * System.out.print("*"); } } }else if( k==0) { //1�� 5���� �� for(int j=1; j<=5;
		 * j++) { //��ĭ��¿� System.out.print("*"); } } System.out.println();//�ٹٲٱ� }
		 */
		for (int i =1; i<=5; i++) {
			int k = Math.abs(i-3);

			if(k==2){
				for(int j=1; j<=5; j++) {
					if (j==3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}else if(k==1) { //2��° 4���� ��
				for(int j=1; j<=5; j++) {
					if(j==1 || j==5) {
						System.out.print(" ");
					}else
						System.out.print("*");
				}
			}else if( k==0) {   //1�� 5���� ��
				for(int j=1; j<=5; j++) { //��ĭ��¿�
			    System.out.print("*");
				}
			}
		System.out.println();//�ٹٲٱ�
		}
	}
}


