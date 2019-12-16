import java.util.Scanner;
public class 배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,count = 0;
		Scanner scan = new Scanner(System.in);

		while(true) {
		System.out.println("년도입력 : ");
		year = scan.nextInt();
		System.out.println("월 입력 : ");
		month = scan.nextInt();

		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			arr[1] = 29;
		}else
			arr[1] = 28;

		System.out.println(month+"달의 마지막 날은"+arr[month-1]);
		if(count==3) {
			break;
		}
		count++;
		}
	}

}
