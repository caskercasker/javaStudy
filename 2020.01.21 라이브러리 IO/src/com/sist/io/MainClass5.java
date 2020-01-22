package com.sist.io;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\javaDev\\javaStudy\\2020.01.20 �ڹ� ���� ����\\src\\com\\sist\\java\\MainClass.java");
			FileReader fis = new FileReader(file);
			//������ => �������� �����ڸ� ������ ���� �� �ִ� (�����ε�)
			int i=0; //���� �б� ==> read() ==> ASC�� �о�´�.
			String data="";
			while((i=fis.read())!=-1) {  //-1�� EOF
				data+=String.valueOf((char)i);

			}
			System.out.println(data);
			fis.close();

			File file2=new File("c:\\image\\data.txt");
			if(!file2.exists()) {
				file2.createNewFile();
			}
			/*
			 *  textarea -> setText(), apend()
			 *
			 */
			FileWriter fos = new FileWriter(file2,true); //true�� append
			fos.write(data);
			fos.close();
			System.out.println("���� ���� �Ϸ�"); //�����
			/*
			 *  Ŭ����
			 *  ====
			 *  	1) �������
			 *  		1. ������� : (������뺯��(�ν��Ͻ�), ���뺯��(��������))
			 *  					=======	  		======
			 *  					private in a; ==> ��������� ���� �Ŀ� ����
													  ==========
													  	new
			 *  									private static ==> Ŭ���� �δ�
			 *
			 *  					�⺻��, Ŭ����, �迭 ==>  ��������
			 *  						  =========
			 *  							��������� ��������
			 *
			 *  					=> �޼ҵ�ȿ��� ����ϴ� ���� : ��������
			 *  			=====================================================
			 *  			������� : �ڵ� �ʱ�ȭ
			 *  			�������� : �ݵ�� �ʱ�ȭ�� �ؼ� ����Ѵ�.
			 *
			 *  		2. �޼ҵ� :
			 *  			= ���� �� �޼ҵ� (�߻�޼ҵ�) => �̿ϼ��� Ŭ����
			 *  				=============== �ϼ��� �ؼ� ��� (�߻�Ŭ����, �������̽�)
			 *  				public void display();
			 *  				= ����+���� �޼ҵ�
			 *  					public void display(){
			 *  						//������
			 *  					}
			 *  				=> ������� ��û���� �޾Ƽ� ó�� ����� �����ش�.
			 *  				   ----------	    ------
			 *  					 �Ű����� 			������
			 *  									------
			 *  									1���� ���
			 *  									= ����� ���� ���� ���
			 *  									= �����Ͱ� ����.(�迭, ũ����, �÷���) ***************
			 *  				=> �Ű����� : 3���̻��̸� => Ŭ������ ��� ����
			 *  				=> �޼ҵ�� ����ȭ
			 *  					aaa();
			 *  					bbb();
			 *  					ccc();
			 *  				=> �޼ҵ尡 �ַ� �ϴ� ����  : ��� (Ŭ������ Ŭ���� => �޽���)
			 *  					==============
			 *  					������ �����ϰ�, ������ ����
			 *  					Ŭ������ Ŭ������ ����
			 *
			 *  		3. ������ : ��������� �ʱ�ȭ : ��������� ���� ����
			 *  								==============
			 *  								1) File�� �о ���� ����
			 *  								2) ��� ���
			 *  								*** Class�� �ҷ��� ������ �Ҽ� ����.
			 *
			 *
			 */


		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
