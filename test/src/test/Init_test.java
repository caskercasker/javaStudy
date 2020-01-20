package test;

class A {
	private int c;
	private int number;
	public int correct;
	public A() {
		c = 1;
		number =23;
		correct = 95;
	}

}
public class Init_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.correct = 54;
		System.out.println(a.correct);
		a = new A();
		System.out.println(a.correct);

	}

}
