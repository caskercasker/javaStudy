/*
 * ���� �ʱ�ȭ
 * =======
 * 	����� ���ÿ� �ʱ�ȭ
 *  int a=10;
 *  a=100 (X ERROR)
 *  ======================
 *   {
 *   	a=100;
 *   }
 * 	====================== �ʱ�ȭ ���(��� ������ �ʱ�ȭ)
 *  static
 *  {
 *  	�ڵ�
 *  }
 *  ====================== static �ʱ�ȭ ��� (�������(static) �ʱ�ȭ)++-
 *
 * 	 Ŭ������()
 * 	{
 * 		a=200;
 * 	}
 *
 *
 * �޸� ����. �̱��� ����
 */


//class MyData{
//	static int[] arr = new int[6];
//	//arr[0]=10;
//	static {
//		for(int i=0; i<6; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//	}// �ʱ�ȭ ����� Ŭ���� ���� ó���� �ѹ��� ����.
//}

class MyData{
	static int[] arr = new int[6];
	//arr[0]=10;
	public MyData() {
		for(int i=0; i<6; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
	}// �ʱ�ȭ ����� Ŭ���� ���� ó���� �ѹ��� ����.
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
