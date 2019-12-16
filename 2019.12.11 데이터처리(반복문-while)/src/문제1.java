//100 999 7의배수 갯수, 4의 배수가 아닌 갯수 몇개?

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int count = 0;
		int j = 0;

		while(a<=999){
			if(a%7==0)
				count++; //7로 나누어진 값이 0이면 하나씩 증가
			if(a%4!=0) //
				j++;
			a++;
		}
		// 675 + 225
		System.out.println(count);
		System.out.println(j);
	}

}
