// ? : 
//(���ǹ�?��1:��2) => �� (React = > ���׿�����)
//����(true) => ��1
// ����(false) => ��2


/*
 * <%
 * 		int sex 1
 * 		if(sex==1)
 * 	{
 * 
 *  %> 
 * 			����
 * 
 * <%
 * 		}else
 * {
 * 			
 * %>
 * 
 * 	����
 * 
 * <%
 * 		}
 		
 *  %>
 * 
 * ===================================================================
 * 
 * <%	
 * 	sex==1? "����":"����"
 * %>
 * 
 * 
 */
import java.util.Scanner;
/*
 * 
 * 
 * 			���̸� �Է� ==> 15�� �̻��̸� (��ȭ��������) / ����(��ȭ�����Ұ�)
 * 
 * 
 * 		// �¼� => 1,2,3,4,5,= > 1,2,4 ==> �¼����� �Ұ���  3,5 => �¼� ���� ����
 */



public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�¼���ȣ �Է�");
		int book = scan.nextInt();
		
		String result = (book==3)|(book==5)?"�¼����Ű���":"�¼����źҰ���";
		System.out.println("���"+result);
		
		/*System.out.println("���� �Է�");
		int age = scan.nextInt();
		String result = age>=15?"��ȭ��������":"��ȭ�����Ұ���";
		System.out.println("���"+result);
		
				
		
		System.out.print("����  ����:");
		//����
		int kor= scan.nextInt();
		System.out.println("���� ����:");
		int eng=scan.nextInt();
		System.out.println("���� ����:");
		int math=scan.nextInt();
		
		
		int avg=(kor+eng+math)/3;
		
		//String result = avg>=60?"Pass":"NonPass";
		//System.out.println("���:"+result);
		 
		 */
	}

}
