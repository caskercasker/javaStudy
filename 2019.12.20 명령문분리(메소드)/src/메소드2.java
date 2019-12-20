// 정수 1개 입력 받앗 => 2진법 출려 0000 0000 0000 0000
// 10 => 16 bit  0000	0000	0000	1010
import java.util.Scanner;
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//int decimal = 24;
		//int[] binary = new int[16];

		//int input =0;
		int index =15;
		int input = scan.nextInt();
		int[] binary = new int[16];

		while(true) {
			binary[index] = input%2;
			input = input/2;
			if(input==0)
				break;
			index--;
		}

		for(int i=0; i<16; i++) {

			if(i%4==0 && i!=0)
				System.out.print(" ");
				System.out.print(binary[i]);

		}
		//System.out.println();
	}

}
