import java.util.Scanner;
public class ���ǹ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2019;
		int month = 12;
		int day = 9;

		int buf = 0;
		//�����̸� 366��

		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵ �Է�");
		year = scan.nextInt();
		System.out.println("�� �Է�");
		month = scan.nextInt();
		System.out.println("�� �Է�");
		day = scan.nextInt();




		buf = (year-1)*365 + (year-1)/4 - ((year-1)/100) + (year-1)/400;
		System.out.println("check"+buf);
		//year/4 //���� ��¥ +1
		//year/100 -1
		//year/400// +1

		//�����̸�
		if((year%4==0 && year%100!=0)||year%400==0)
			buf = buf +1;


			if (month ==1 )
				buf =buf + day;
			if (month ==2)
				buf = buf + 31 + day;
			if (month == 3)
				buf = buf + 31 + 28 + day;
			if (month ==  4)
				buf = buf + 31 + 28 + 31 +day;
			if (month == 5)
				buf = buf + 31 + 28 + 31 + 30 + day;
			if (month == 6)
				buf = buf + 31 + 28 + 31 + 30 + 31 + day;
			if (month ==7 )
				buf = buf + 31 + 28 + 31 + 30 + 31 + 30 + day;
			if (month == 8)
				buf = buf + 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			if (month == 9)
				buf = buf + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			if (month == 10)
				buf = buf + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			if (month == 11)
				buf = buf + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			if (month == 12)
				buf = buf + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;

		System.out.println("check"+buf);

		buf = buf%7;
		System.out.println("����"+buf);







	}

}
