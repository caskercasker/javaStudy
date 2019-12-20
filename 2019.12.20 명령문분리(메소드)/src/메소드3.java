import java.util.Scanner;
public class 메소드3 {
	static int userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력:");
		int input = scan.nextInt();
		return input;
	}

	static int[] toBinary(int input) {
		int[] binary = new int[16];
		int index = 15;
		while(true) {
			binary[index] = input%2;
			input = input/2;
			if(input==0)
				break;
			index--;
		}

		for(int i=0; i<16; i++) {

			if(i%4==0 && i!=0) {
				System.out.println(" ");
				System.out.print(binary[i]);
			}
		}
		return binary;
	}
	static void print(int[] binary) {
		for(int i=0; i<16; i++) {

			if(i%4==0 && i!=0) {
				System.out.println(" ");
				System.out.print(binary[i]);
			}
		}
	}
	static void process() {
		int input = userInput();
		int[] binary = toBinary(input);
		print(binary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력
		//이진법 처리
		//출력
		// 조립

		/*
		 * int[] ppop = {2,3,4,5,6};
		 *
		 * for(int k:ppop) { System.out.print(ppop); }
		 */

		process();
	}

}
