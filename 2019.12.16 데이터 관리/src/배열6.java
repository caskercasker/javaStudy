// 5명의 이름을 입력 받아서 저장하고 => 출력하는 프로그램을 작성
import java.util.Scanner;
public class 배열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[5];

		Scanner scan = new Scanner(System.in);

		for (int i=1; i<=name.length; i++) {
			System.out.println(i+"번쨰 이름 입력");
			name[i-1] = scan.next();
		}

		for (String names: name) {
			System.out.println(names);
		}
		/*
		 * for (int j = 0; j<5; j++) { System.out.print(name[j]+"\t"); }
		 */		//출력
		//for-each => 배열, 집합체(Collection)
		/*
		 * int[] data = {1,2,3,4,5};
		 * for(int i=0, i<data.length; i++)
		 * {
		 * 	System.out.println(data[i])
		 *
		 *
		 * for(int i:data)
		 * {
		 * 		System.out.println(data[i])
		 * } //데이터 값을 받아온다. 값이 없으면 종료.. NULL 값을 받으면 종료
		 *	//데이터형 일치가 중요하다. 큰 데이터를 받는건 상관이 없슴.
		 *
		 */




	}

}
