import java.util.Scanner;

//국어  영어 수학 점수를 받아서
// 총점,평균,학점을 출력하는 메소드를 만든다.
/*
 * 1. 입력
 * 2. 총점
 * 3. 평균
 * 4. 학점
 * 5. 출력

 */
public class 메소드10 {
	static int[] input() {
		int[] score =new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수 입력");
		score[0]= scan.nextInt();
		System.out.println("영어점수 입력");
		score[1]= scan.nextInt();
		System.out.println("수학점수 입력");
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

		System.out.printf("총점%d  평균%.2f  학점%c",sum,avg,grade);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
