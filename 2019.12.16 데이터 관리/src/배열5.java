import java.util.Scanner;
public class �迭5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,count = 0;
		Scanner scan = new Scanner(System.in);

		while(true) {
		System.out.println("�⵵�Է� : ");
		year = scan.nextInt();
		System.out.println("�� �Է� : ");
		month = scan.nextInt();

		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			arr[1] = 29;
		}else
			arr[1] = 28;

		System.out.println(month+"���� ������ ����"+arr[month-1]);
		if(count==3) {
			break;
		}
		count++;
		}
	}

}
