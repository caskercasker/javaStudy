
public class test {
	static int sval = 123;
	int ival =321;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sval);// 123

		test ex1 = new test();
		test ex2 = new test();

		ex1.ival = 456;
		System.out.println(ex1.ival); //456
		System.out.println(ex2.ival); //123
	}

}
//public class test{
//		static int sval = 123;
//		int ival =321;
//
//}