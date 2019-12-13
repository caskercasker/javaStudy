/*
 * 	1~100까지의 합
 *  짝수/홀수 합 출력
 *
 *  결과
 *  1~100까지의 합 5050
 *  1~100까지의 짝수의 합 :
 *  1~100까지의 홀수의 합 :
 *
 *
 *
 */
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even = 0;
		int odd =0;
		for(int i=1;i<=100;i++) {

			if(i%2==0) {
				even = even +i;
			}else {
				odd = odd+i;
			}
		}
		System.out.println(even+odd);
		System.out.println(even);
		System.out.println(odd);
	}

}
