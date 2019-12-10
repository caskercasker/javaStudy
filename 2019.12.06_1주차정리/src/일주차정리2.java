/*
 *  �ڹٿ��� �����ϴ� Ư������
 *  1) \n => newLine ==> ���� �ٿ� ��� System.out.println()
 *  2) \t => tab  ==> ���� ����
 *  3) \" => " ==>     ����ǥ ����(�ο��ȣ)
 *  	System.out.println("\"Hello Java\"")
 *
 *  ��� ����
 *  ȫ�浿
 *  ��û��
 *  �ڹ���
 *
 *
 *  ==>  System.out.println("ȫ�浿");
 *  	System.out.println("��û��");
 *  	System.out.println("�ڹ���");
 *
 *  ȫ�浿 ��û�� �ڹ���
 *    System.out.print("ȫ�浿\t");
 *    System.out.print("��û��\t");
 *    System.out.print("�ڹ���\t");
 *
 *    ������ �ִ� ��� ==> JDK 1.5   //������ �ǵ帮�� ���� ��κ��� ��� �Ǽ����� �Ҽ��� �ڸ��� ������� �����ϱⰡ ����� ���� ��� �Ѵ�.
 *    //print Format
 *    1) %d ==> ����
 *    System.out.printf(%5d%5d%5d",100,90,60);
 *     100--90---60
 *    2) %f ==> �Ǽ�
 *    3) %c ==> ����
 *    4) %s ==> ���ڿ�
 *
 *    System.out.printf();
 *    �̸�	����	����	����	����
 *    ȫ�浿 	90	90	90	270
 *    //... ������ �˼��� ���� ��
 */
public class ����������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();

		System.out.printf("%5d%5d%5d",100,90,60);  //+�� ������ ���� -�� ���� ����

		System.out.printf("\n");

		System.out.printf("%-10.2f%-10.2f%-10.2f\n",100.1,90.0,60.0); //f�� �⺻���� Int ���� ������ ������ ��,

		System.out.printf("%2c%2c%2c\n",'A','B','C');

		System.out.printf("%10s%10s%10s\n","Hello","Java","!!");

		//System.out.printf("%d%s%c",0,'A',"hello");
	}

}
