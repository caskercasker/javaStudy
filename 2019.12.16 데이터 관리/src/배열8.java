/*
 * 3명의 학생 ==> 국어, 영어,수학 점수를 입력 받음  => 출력
 * =======================================
 *
 * 80 80 80 240 80.0
 * 90 90 90 270 90.0
 * 70 70 70 210 70.0
 *
 *
 *
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] sum = new int[3];
		double[] avg = new double[3];
		char[] grade = new char[3];

		for(int i=0; i<kor.length;i++) {
			System.out.println((i+1)+"의국어점수입력");
			kor[i] = scan.nextInt();
			sum[i] += kor[i];
			System.out.println((i+1)+"의영어점수입력");
			eng[i] = scan.nextInt();
			sum[i] += eng[i];
			System.out.println((i+1)+"의수학점수입력");
			math[i] = scan.nextInt();
			sum[i] += math[i];

			avg[i] = sum[i]/(double)kor.length;
		}

		/*
		 * for(int i:sum) { System.out.println("의합계는 " +i); } for(double j:avg) {
		 * System.out.printf("평균은%.2f",j); System.out.println(); }
		 */

		//switch=case 정수,문자,문자열,실수(x)는 안됨.

		for(int i=0; i<3; i++) {
			if (avg[i]<=100 && avg[i]>90)
				grade[i] = 'A';
			else if (avg[i]<=90 && avg[i] >80)
				grade[i] = 'B';
			else if (avg[i]<=80 && avg[i] >70)
				grade[i] = 'C';
			else if (avg[i]<=70 && avg[i] >60)
				grade[i] = 'D';
			else
				grade[i] = 'F';

			Arrays.sort(sum);
			System.out.println(kor[i]+" "+eng[i]+" "+math[i]+" "+sum[i]+" "+grade[i]+" "+avg[i]);

		}





	}

}
