package primeNumber;
import java.util.Scanner;

public class primeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("정수입력 ");
		num = scan.nextInt();
		//num = 10000000;
		int[] arr = new int[num];

		//System.out.println(arr[2]);
		for(int i=2; i<num; i++) {
			arr[i] = i;
		}

		for(int i =2; i<num; i++) {
			for(int j=2; j<num; j++) {
				if(arr[j]!=i && arr[j]%i ==0) {
					arr[j] = 0;
				}
			}
		}

		for (int i = 2; i< num; i++) {
			if(arr[i] != 0)
				System.out.println(arr[i]);
		}


	}

	}


