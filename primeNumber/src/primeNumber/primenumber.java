package primeNumber;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =2 ;// ���� ��� 2���� ����

		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		int num = 0;

		int count = 0;
		num = scan.nextInt();

		while(i <= num) {
			isPrime = true;

			for(int j = 2; j<i; j++) {
				if(i%j ==0) {
					isPrime = false;
					count++;
					break;
				}
				continue;
			}
			if(isPrime == true) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("�ݺ�Ƚ��:"+count);

	}

}
