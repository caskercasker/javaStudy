//오버로딩
/*
 * 한개의 클래스에서
 * 같은 이름의 메소드
 * 매개변수가 다르다( 갯수, 데이터형이 틀리다)
 * 리턴형은 관계없다.
 * byte < char < int < long < float< double
 * 		 short
 * String, boolean => 변환이 없다.
 */
class Calc{
	public void display(int a) {
		System.out.println("a="+a);
	}
	public void display(int a, int b, int c) {
		System.out.println("display(int a, int b, in c) call");
	}
	public void display(double a, int b, double c) {
		System.out.println("display(double a, int b, double c) call");
	}

	public void display(float a, char b, int c) {
		System.out.println("display(float a, char b, in c) call");
	}
	public void display(double a, double b, double c) {
		System.out.println("display(double a, double b, double c) call");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		c.display('A');

	}

}
