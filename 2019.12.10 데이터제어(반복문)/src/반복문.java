/*
 *
 *		반복문
 * 		=========== 선조건
 * 		= for : 반복횟수 지정
 * 		= while : 지정이 없는 경우
 * 		  초기값
 * 		  while(조건문)
 * 			{
 * 				실행문장
 * 				증가식
 * 			}
 * 		=========== 후조건
 * 		= do~while : 한번 이상은 반드시 수행
 * 		  초기값
 * 		 do
 * 		{
 * 			실행문장
 * 			증가식
 * 		}while(조건문)
 * 		===========
 *
 *
 */
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i =1; while(i<=1){ System.out.println("i="+i); i++; }
		 *//*
			 * int i = 1; int sum = 0; int sum3 =0; int sum5 =0; int sum7 =0;
			 *
			 *
			 * while (i<=35) { sum+=i; System.out.println("i="+i+",sum"+sum); if(i%3==0) {
			 * sum3 = sum3 + i; } if (i%5==0) { sum5 = sum5 + i; }if (i%7==0) { sum7 = sum7
			 * + i; } i++;
			 *
			 * } System.out.println("1~100까지의 합"+sum); System.out.println("3의 합"+sum3);
			 * System.out.println("5의 합"+sum5); System.out.println("7의 합"+sum7);
			 */
		char c = 'A';
		System.out.println((int)c); //char 값은 아스키 값으로 비교가 가능 하다.

		while(c<='Z') {
			System.out.print(c+" ");
			c++;
		}

		}

	}


