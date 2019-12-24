import java.util.Scanner;

// 정수 입력 => 출력
/*
 * 입력
 * 출력
 * =====
 * 조립
 */
public class 메소드11 {
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 : ");
		int a = scan.nextInt();

		return a;
	}

	static void print(int a) {

		System.out.println(a);
	}

	static void process() {
		print(input());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
