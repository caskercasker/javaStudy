/*
 *  �޼ҵ�
 *  ===
 *  	�ڹ�(��ü����  => Ŭ����) : Ŭ���� �������(����,�޼ҵ�)
 *  									=====
 *  									������ + ���
 *
 *  ����)
 *  	������(ó�� �����) �޼ҵ��(�Ű�����....) ==> �����
 *  	=========
 *  		�⺻��			���: �ҹ���(��Ÿ����) �ܾ� 2���� �پ��� �� �ι�° ���ڴ� �빮2��..
 *  										getText() ==> nextInt()
 *  										class Name{} = Name name
 *  		=======
 *  		�迭��
 *  		Ŭ������
 *  		======= ������� ��������
 *
 *  {
 *  		==> ������
 *  			����ó��
 *  			�����
 *
 *  			return ����� == void(������ ����) => JVM �� �ڵ����� return�߰�
 *
 *  	}
 *
 *  	** return ���� => 1�� ������ ����
 *			�������� ��� ====> ��� �����ش�.
 *		** ��� �޼ҵ�� return�� ������ ����...........
 *
 *		-----------------------------------
 *		** ����ڰ� ��û�� ��?
 *			ó�� ���

 *  	** ȣ��(����ñ�)
 *  	----------------------------------
 *  	return  ���� ����
 *  	java lang ����  ����...
 *
 */
import java.util.Scanner;
public class �޼ҵ�1 {
	//+
	static int add(int a,int b) {
		return a+b;
	}
	//-
	static int sub(int a, int b) {
		return a-b;
	}
	//*
	static int mul(int a, int b) {
		return a*b;
	}

	// /
	static double div(int a, int b) {
		return a/(double)b;
	}
	//����
	static void process(){
		Scanner scan = new Scanner(System.in);
		System.out.println("ù���� ���� �Է� : ");
		int a = scan.nextInt();
		System.out.println("�ι��� ���� �Է� : ");
		int b = scan.nextInt();
		System.out.println("������(+,-,*,/)�Է� : ");
		String op = scan.next();

		//int res = 0;

		switch(op) {
		case "+" : {
			int res = add(a,b);
			System.out.printf("%d%s%d=%d\n",a,op,b,res);
			}break;
		case "-" :{
			int res = sub(a,b);
			System.out.printf("%d%s%d=%d\n",a,op,b,res);
			}break;
		case "*" :{
			int res = mul(a,b);
			System.out.printf("%d%s%d=%d\n",a,op,b,res);
			}break;
		case "/" :{
			double res = div(a,b);
			System.out.printf("%d%s%d=%.2f\n",a,op,b,res);
			}break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			process();
			System.out.print("y|n �Է�:");
			String ex = scan.next();
			switch(ex)
			{
			case "y":
				System.exit(0);
				break;
			case"n":
				break;
			}

		}
	}

}
