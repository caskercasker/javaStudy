/*
 * 
 *        ����     &&   ����  ���� ����
 *        ����     || 	���� �ܺ�
 *      =================================
 *         				&& 		||
 *      =================================
 *      true true		true	false
 *      =================================
 *      true false		false	true	
 *      =================================
 *      false true		false	true
 *      =================================
 *      false false		false	false
 *      =================================
 *      
 *         *** ȿ������ ����
 *         && => ���� => false =>�������� ���꿡�� ����
 *         || => ���� => true => �������� ���꿡�� ����
 *          
 *   
 * 
 * 
 */
public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ĺ��� �����Ŀ� �ҹ��ڳ�, �빮��
		char c='T';
		String result =(c>='A' && c<= 'Z')? "�빮��" : "�ҹ���";
		System.out.println(c+"��(��)"+result);
	}

}
