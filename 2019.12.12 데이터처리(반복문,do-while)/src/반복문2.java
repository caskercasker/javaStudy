/*
 * 1) 3���� �л� => ����,����,���� ���� => ���,����,������ ���
 *
 * 		 ����	����	����	����	���	����
 * 		 80	80	80	240	80	'B'
 * 		 70	70	70	210	70	'C'
 * 		 90	90	90	270	90	'A'
 *
 */
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng , math = 0;
		Scanner scan = new Scanner(System.in);
		int ikor=0,ieng=0,imath =0;
		int jkor=0,jeng=0,jmath =0;
		int kkor=0,keng=0,kmath =0;
		int count = 1;
		char grade = 'a';
		int sum = 0;
		do {
			if(count==1) {
				System.out.println("�������� �Է�");
				ikor = scan.nextInt();
				System.out.println("�������� �Է�");
				ieng = scan.nextInt();
				System.out.println("�������� �Է�");
				imath = scan.nextInt();
				System.out.println("");
			}else if(count==2) {
				System.out.println("�������� �Է�");
				jkor = scan.nextInt();
				System.out.println("�������� �Է�");
				jeng = scan.nextInt();
				System.out.println("�������� �Է�");
				jmath = scan.nextInt();
				System.out.println("");
			}else {
				System.out.println("�������� �Է�");
				kkor = scan.nextInt();
				System.out.println("�������� �Է�");
				keng = scan.nextInt();
				System.out.println("�������� �Է�");
				kmath = scan.nextInt();
				System.out.println("");
			}
			count++;
		}while(count<=3);

		System.out.println("����\t"+"����\t"+"����\t"+"����\t"+"���\t"+"����\t");
		count = 1;
		//�ݺ���
		do {
			if(count==1) {
				sum = ikor+ieng+imath;
			}else if(count==2) {
				sum = jkor+jeng+jmath;
			}else if (count==3){
				sum = kkor+keng+kmath;
			}
			if(sum/3>=90 && sum/3<100)
				grade = 'A';
				else if (sum/3<90 && sum/3>=80)
					grade = 'B';
				else if (sum/3<80 && sum/3>=70)
					grade = 'C';
				else if (sum/3<70 && sum/3>=60)
					grade = 'D';
				else if (sum/3<60)
					grade = 'F';

			System.out.println(ikor+"\t"+ieng+"\t"+imath+"\t"+(ikor+ieng+imath)+"\t"+sum/3+"\t"+grade);
			count++;

		}while(count<=3);
		//�������� �Ѹ���
		//System.out.println("����\t"+"����\t"+"����\t"+"����\t"+"���\t"+"����\t");
		//System.out.println(ikor+"\t"+ieng+"\t"+imath+"\t"+(ikor+ieng+imath)+"\t"+sum/3+"\t"+grade);



	}

}
