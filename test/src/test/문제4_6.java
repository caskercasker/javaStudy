package test;

public class 문제4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;

		for(i=1; i<=6;i++) {
			for(j=1; j<=6; j++) {
				if(i+j==6)
				System.out.println("첫번쨰 주사위"+i+"두번쨰 주사위"+j);
			}
		}
	}

}
