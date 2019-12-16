// 5개의 정수를 입력 받아서  => 5개 정수를 출력  ==> 합,평균
import java.util.Scanner;
public class 배열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		for(int i=0; i<a.length;i++) {
			System.out.println((i+1)+"번째 정수 입력 ");
			a[i] = scan.nextInt();
			sum += a[i];
		}

		for(int j:a) { //출력할때만 사용 형변환에 작은 데이터 형으로는 입력 불가능

			System.out.println("입력된 정수는 "+j);
		}
		avg = sum/a.length;
		System.out.println("합계는 " + sum + " 평균은 " + avg);
	}
}
