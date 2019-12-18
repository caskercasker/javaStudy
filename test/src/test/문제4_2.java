package test;

public class ¹®Á¦4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=1; i<=5; i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			sum+=i;
			//System.out.println(i);
			//System.out.println(i);
		}
		System.out.println(sum);
	}

}
