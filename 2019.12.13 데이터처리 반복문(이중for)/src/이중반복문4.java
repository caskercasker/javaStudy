/*
 *  ������ ���
 *	������ (�ʱ�ȭ)
 */
class A{
	int aa=10;
}

public class ���߹ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=2;

		A a = new A();
		A b = new A();

		System.out.println("b="+b.aa);
		for(int i=1;i<=9;i++) {
			//A a = new A();
			j=2;
			while(j<=9) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
				j++;
			}
			System.out.println();
		}
		System.out.println();
	}

}
