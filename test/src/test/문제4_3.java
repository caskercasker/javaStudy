package test;

public class ¹®Á¦4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a = 0;

		for(int i=1; i<=10; i++) {
			a=0;
			for(int j=1; j<=i; j++) {
				a += j;
				//System.out.println(a);
			}
			sum += a;
		}
		System.out.println(sum);
	}

}
