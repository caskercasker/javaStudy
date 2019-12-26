//Call by Reference (주소) => 배열,클래스
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



public class 메소드2 {

		int a = 10;
	static void change (메소드2 aa) {
		aa.a = 1000;
	}
	static void swap (int[] arr) {
		System.out.println("변경전 => swap: a="+arr[0]+",b="+arr[1]);
		int temp =arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		System.out.println("변경후 => swap: a="+arr[0]+",b="+arr[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,200};
		메소드2 a = new 메소드2();
		메소드2 b = new 메소드2();
		메소드2 c = new 메소드2();
		메소드2 d = new 메소드2(); //메모리에 넣어놓는.


		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		System.out.println(d);

		System.out.println();
		System.out.println(a);
		change(a);
		System.out.println(a);

		swap(arr); //주소 전송
		System.out.println("main = > a="+arr[0]+",b="+arr[1]);
	}

}
