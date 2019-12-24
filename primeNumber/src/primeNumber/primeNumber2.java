package primeNumber;
import java.util.Scanner;

public class primeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count =1;
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;

			for (int j=2; j*j<i; j++) {
				if(i%j ==0) {
					//소수가 아니다.
					isPrime = false;
					count++;

					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}

		System.out.println("반"+count);


	}

	}


