/*
 * 변수 초기화
 * =======
 * 	선언과 동시에 초기화
 *  int a=10;
 *  a=100 (X ERROR)
 *  ======================
 *   {
 *   	a=100;
 *   }
 * 	====================== 초기화 블록(멤버 변수의 초기화)
 *  static
 *  {
 *  	코딩
 *  }
 *  ====================== static 초기화 블록 (멤버변수(static) 초기화)++-
 *
 * 	 클래스명()
 * 	{
 * 		a=200;
 * 	}
 *
 *
 * 메모리 관리. 싱글텀 패턴
 */


//class MyData{
//	static int[] arr = new int[6];
//	//arr[0]=10;
//	static {
//		for(int i=0; i<6; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//	}// 초기화 블록은 클래스 생성 처음에 한번만 실행.
//}

class MyData{
	static int[] arr = new int[6];
	//arr[0]=10;
	public MyData() {
		for(int i=0; i<6; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
	}// 초기화 블록은 클래스 생성 처음에 한번만 실행.
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyData m1 = new MyData();
//		for (int i=0; i<6; i++) {
//			System.out.print(m1.arr[i]+" ");
//		}
//		System.out.println();
//		MyData m2 = new MyData();
//		for (int i=0; i<6; i++) {
//			System.out.print(m2.arr[i]+" ");
//		}

//		for(int i=0; i<6; i++) {
//			System.out.print(MyData.arr[i]+" ");
//		}

		MyData  m1 = new MyData();
		for(int i=0; i<6; i++) {
			System.out.print(m1.arr[i]+" ");
		}
		System.out.println("");

		MyData  m2 = new MyData();
		for(int i=0; i<6; i++) {
			System.out.print(m2.arr[i]+" ");
		}
		System.out.println("");

		MyData  m3 = new MyData();
		for(int i=0; i<6; i++) {
			System.out.print(m3.arr[i]+" ");
		}
		System.out.println("");

		for(int i=0; i<6; i++) {
			System.out.print(m1.arr[i]+" ");
		}
		System.out.println("");



	}

}
