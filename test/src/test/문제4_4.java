package test;

public class 문제4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter =1;
		int sum = 0;
		while(sum<=100) {
			if(counter%2==0) {
				sum = sum + (-1)*counter;
			}
			sum += counter;

			counter++;
		}
		System.out.println("숫자는 "+counter);
	}

}
