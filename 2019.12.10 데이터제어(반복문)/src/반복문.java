/*
 *
 *		�ݺ���
 * 		=========== ������
 * 		= for : �ݺ�Ƚ�� ����
 * 		= while : ������ ���� ���
 * 		  �ʱⰪ
 * 		  while(���ǹ�)
 * 			{
 * 				���๮��
 * 				������
 * 			}
 * 		=========== ������
 * 		= do~while : �ѹ� �̻��� �ݵ�� ����
 * 		  �ʱⰪ
 * 		 do
 * 		{
 * 			���๮��
 * 			������
 * 		}while(���ǹ�)
 * 		===========
 *
 *
 */
public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i =1; while(i<=1){ System.out.println("i="+i); i++; }
		 *//*
			 * int i = 1; int sum = 0; int sum3 =0; int sum5 =0; int sum7 =0;
			 *
			 *
			 * while (i<=35) { sum+=i; System.out.println("i="+i+",sum"+sum); if(i%3==0) {
			 * sum3 = sum3 + i; } if (i%5==0) { sum5 = sum5 + i; }if (i%7==0) { sum7 = sum7
			 * + i; } i++;
			 *
			 * } System.out.println("1~100������ ��"+sum); System.out.println("3�� ��"+sum3);
			 * System.out.println("5�� ��"+sum5); System.out.println("7�� ��"+sum7);
			 */
		char c = 'A';
		System.out.println((int)c); //char ���� �ƽ�Ű ������ �񱳰� ���� �ϴ�.

		while(c<='Z') {
			System.out.print(c+" ");
			c++;
		}

		}

	}


