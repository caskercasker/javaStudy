import java.util.Scanner;
public class �迭2 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];  //�ʱ�ȭ���� �ϴ� ��� 0 1 2
		scan = new Scanner(System.in);
		int max = 0;
		for(int i=0; i< arr.length; i++) {
			System.out.println((i+1)+"��° ���� �Է�");
			arr[i] = scan.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("���� ū ��\t"+max);


	}

}
