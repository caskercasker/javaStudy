import java.util.Scanner;

//����  ���� ���� ������ �޾Ƽ�
// ����,���,������ ����ϴ� �޼ҵ带 �����.
/*
 * 1. �Է�
 * 2. ����
 * 3. ���
 * 4. ����
 * 5. ���

 */
public class �޼ҵ�10 {
	static int[] input() {
		int[] score =new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� �Է�");
		score[0]= scan.nextInt();
		System.out.println("�������� �Է�");
		score[1]= scan.nextInt();
		System.out.println("�������� �Է�");
		score[2]= scan.nextInt();

		return score;
	}
	static int sum (int[] score) {
		int report = 0;
		int sum = 0;
		for(int i=0; i<=2; i++) {
			sum += score[i];
		}

		return sum;
	}

	static char grade(double avg) {
		char grade ='a';
		if(avg/3>=90 && avg/3<100)
			grade = 'A';
			else if (avg/3<90 && avg/3>=80)
				grade = 'B';
			else if (avg/3<80 && avg/3>=70)
				grade = 'C';
			else if (avg/3<70 && avg/3>=60)
				grade = 'D';
			else if (avg/3<60)
				grade = 'F';
		return grade;
	}

	static double avg (int sum) {
		double avg = 0;
		avg = sum/3.0;

		return avg;
	}
	static void process() {
		int[] score = input();
		print(score,sum(score),avg(sum(score)),grade(avg(sum(score))));
		//sum
	}
	static void print(int[] score,int sum, double avg, char grade) {
		for(int i=0; i<2 ; i++) {
			System.out.printf(score[i]+"\t");
		}

		System.out.printf("����%d  ���%.2f  ����%c",sum,avg,grade);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
