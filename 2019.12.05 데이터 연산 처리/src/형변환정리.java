/*
 * 
 * 	�ڵ�����ȯ
 *  	=> int + double = double
 *  		===
 *  		double �� ��ȯ
 *  	=> char + int = int
 * 			===
 * 			int�� ��ȯ
 * 
 * 		=> char c='A';
 * 			c>='A' && c<='Z'
 * 				===			===
 * 				65			90		===> char�� ��� ����=> int����
 * 		=> byte+byte = int
 * 		=> short + short = int
 * 		=> char + char = int        int  ���ϴ� ����ϸ� int ���̴�.
 *  
 *  ��������ȯ : cast ������
 *  ========= down
 *  	int ==> char
 * 		==> int a=65 ==> char b=(char)a; 
 * 		==> char c=65;(o) ���ܻ���
 * 		==> int a=10.7(X)
 * 		==> float f=10.7;(x)
 *  	double ==> int
 *   
 * 
 * 
 */
public class ����ȯ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=65;
		System.out.println(c);
		float f=10;
		double d='A';
		System.out.println(f);
		System.out.println(d);
	}

}
