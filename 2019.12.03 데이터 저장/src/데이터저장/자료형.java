package ����������;
/*
 *  ���α׷�(���) : java,c/c++,kotlin
 * 
 * => ������ ���� ======== ������ ���� ======== ȭ�� ���
 * 										dos,window :Application
 * 										������ : web application
 * 										����Ʈ�� : �����
 * 
 * 
 *    =======
 *    1) ���� : �Ѱ��� ������ �����ϴ� ����
 *    2) �迭 : ���� ������ �����͸� ������ �����ϴ� ���� 
 *    3) Ŭ���� : �ٸ� ������ �����͸� ������ �����ϴ� ����
 *    =========  �޸𸮿� ����
 *    4) ����
 *    5) RDBMS (����Ŭ)
 *  
 *	  1. ����
 *		1) ��������� ũ�� 
 *			= �ڷ���(��������)
 *            ��������
 *             byte => (1byte) => -128~127
 *             ==> 100, 50, 90, 120, 38
 *             ============================
 *             �������� => ������ ����
 *             �޸� ũ�� ������ = ��;
 *             ======
 *             byte b = 10
 *             int kor = 90  ==> �����ؼ� �̿��� ����
 *             
 *             ������ ũ�� ����
 *             *********** int/ long ����
 *             				===0=====
 *             				10,20 .. 10L. 20L (20l)
 *             				long a = 10L
 *             				long b = 10 => int => long
 *             				
 *             
 *             
 *            �Ǽ�����
 *            	float ( 4byte) �Ҽ��� 6�ڸ�
 *              double (8byte) => default => �Ҽ��� 15
 *              float vs double
 *              float f=10.5 => error
 *              ==4byte  == 8byte
 *              float f=10.5F  => 10.5F, 10.5f
 *              double = 10.5,  10.5d, 10.5D
 *              ===> �Ǽ����� ������ ��ȯ => �Ҽ��� ���ϴ� ����
 *                   (int)10.55 ==> 10
 *                   
 *            ��������
 *             char (2byte) => 0~65535 (������ ��� ���� ����)
 *             		==> 'A', '��'
 *             		ȫ�浿 => char[], String => ""
 *            True/False/
 *              boolean => boolean b = true 
 *              		   boolean b = false
 *            *** ������
 *             String => ���ڿ�(���� �������� ������ ���)
 *             String name = "ȫ�浿"
 *		2) �޸𸮿� �̸� �ο�
 *			= ����(�ĺ���)
 *			= ���ڼ��� ������ ����((3~7)
 *			1. ���ĺ�, �ѱ۷� ����(�� ���ĺ��� ��ҹ��� ����)
 *				�������� => engScore , eng_score
 *			2. ���ڻ�� ����
 *				(�� �տ� ����� �Ұ���)
 *				kor2, en2 ..... a1b
 *			3. Ư������( _, $) ���� ���� ��� _ _ �ܾ �������ϰ��
 *				file_name, file_size, first_name, second_name
 *				********* �ӽ�����
 *							_Hello.java
 *          4. �����(�ڹٿ��� ����ϴ� �ܾ�)
 *             int int_value
 *
 *
 */		
import java.util.*; //Scanner => 


public class �ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 'A' ;
		kor += 1;
		System.out.print(kor);
		//try {}

	}

}
