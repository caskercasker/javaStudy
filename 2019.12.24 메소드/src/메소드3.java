// year �Է��� �޾Ƽ� => ���⿩�� Ȯ��
// int 0,1 => boolean
/*
 *
 * 	��Ʈ��ũ //���ڿ�(�ӵ��� ����) ���� ���� ����� ���ؼ� �̿�.
 * 	��������
 *
 *  	Login|id|pwd => �α���
 *
 */
// void

public class �޼ҵ�3 {
	static void isYear(int year) {
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"�⵵�� �����Դϴ�.");
		else
			System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
	}
	static boolean isYear2(int year) {
		if((year%4==0 && year%100!=0)||(year%400==0))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2020;

		//isYear(year);
		boolean bCheck = isYear2(year);
		if(bCheck) {
			System.out.println(bCheck);
			isYear(year);
		}else {
			System.out.println(bCheck);
			isYear(year);
		}
	}

}
