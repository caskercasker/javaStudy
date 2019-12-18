package test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b;
		//4.1
		int x = 14;
		b = (x >10 && x<20);
		System.out.println(b);

		char ch = 'A';
		b = (ch!=' ' && ch!='\t');
		System.out.println(b);

		ch = 'x';
		b = (ch=='x' || ch=='X');
		System.out.println(b);

		ch = '0';
		b= (ch>='0' && ch<='9');
		System.out.println(b);

		ch = 'C';
		b = (ch>='A' && ch <='Z') || (ch>='a' && ch <= 'z');
		System.out.println(b);

		int year = 2020;
		b = (year%400==0)||(year%4==0 && year%100!=0);
		System.out.println(b);

		boolean powerOn = false;
		System.out.println(!powerOn);

		String str = "yes";
		System.out.println(str.equals("yes"));
	}

}
