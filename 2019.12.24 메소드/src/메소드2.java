//Call by Reference (�ּ�) => �迭,Ŭ����
/*
 *	class A{
 *		int a=10;
 *	}
 *
 *	swap(A aa){
 *		aa.a = 1000;
 *	}
 *
 *	A aa new A();
 *	swap(aa)
 *
 *	aa.a
 *
 *
 */



public class �޼ҵ�2 {

		int a = 10;
	static void change (�޼ҵ�2 aa) {
		aa.a = 1000;
	}
	static void swap (int[] arr) {
		System.out.println("������ => swap: a="+arr[0]+",b="+arr[1]);
		int temp =arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		System.out.println("������ => swap: a="+arr[0]+",b="+arr[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,200};
		�޼ҵ�2 a = new �޼ҵ�2();
		�޼ҵ�2 b = new �޼ҵ�2();
		�޼ҵ�2 c = new �޼ҵ�2();
		�޼ҵ�2 d = new �޼ҵ�2(); //�޸𸮿� �־����.


		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		System.out.println(d);

		System.out.println();
		System.out.println(a);
		change(a);
		System.out.println(a);

		swap(arr); //�ּ� ����
		System.out.println("main = > a="+arr[0]+",b="+arr[1]);
	}

}
