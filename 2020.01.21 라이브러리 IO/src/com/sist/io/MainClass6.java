package com.sist.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//���� ����
/*
 * 	�б� : int read(),int read(byte[], off, len)
		 ====		---
		 ���ڹ�ȣ 		���� ����Ʈ ��
 *  ���� : write(byte), write(String)
 *  �ݱ�  :close()
 *
 */
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis =
					new FileInputStream("c:\\image\\m1.png");
			FileOutputStream fos =
					new FileOutputStream("c:\\oracle\\m1.png");

			int i=0; //���� ����Ʈ ����
			byte[] buffer = new byte[1024];
			while((i=fis.read(buffer,0,1024))!=-1) {
				fos.write(buffer, 0, i);
				// out.write() ���� ����
			}
			fis.close();
			fos.close();

			System.out.println("���� ���� �Ϸ�");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
