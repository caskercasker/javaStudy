/*
 * 1) 3명의 학생 => 국어,영어,수학 점수 => 평균,총점,학점을 출력
 *
 * 		 국어	영어	수학	총점	평균	학점
 * 		 80	80	80	240	80	'B'
 * 		 70	70	70	210	70	'C'
 * 		 90	90	90	270	90	'A'
 *
 */
import java.util.Scanner;
public class 반복문2 {

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
				System.out.println("국어점수 입력");
				ikor = scan.nextInt();
				System.out.println("영어점수 입력");
				ieng = scan.nextInt();
				System.out.println("국어점수 입력");
				imath = scan.nextInt();
				System.out.println("");
			}else if(count==2) {
				System.out.println("국어점수 입력");
				jkor = scan.nextInt();
				System.out.println("영어점수 입력");
				jeng = scan.nextInt();
				System.out.println("국어점수 입력");
				jmath = scan.nextInt();
				System.out.println("");
			}else {
				System.out.println("국어점수 입력");
				kkor = scan.nextInt();
				System.out.println("영어점수 입력");
				keng = scan.nextInt();
				System.out.println("국어점수 입력");
				kmath = scan.nextInt();
				System.out.println("");
			}
			count++;
		}while(count<=3);

		System.out.println("국어\t"+"영어\t"+"수학\t"+"총점\t"+"평균\t"+"학점\t");
		count = 1;
		//반복문
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
		//마지막에 뿌리기
		//System.out.println("국어\t"+"영어\t"+"수학\t"+"총점\t"+"평균\t"+"학점\t");
		//System.out.println(ikor+"\t"+ieng+"\t"+imath+"\t"+(ikor+ieng+imath)+"\t"+sum/3+"\t"+grade);



	}

}
