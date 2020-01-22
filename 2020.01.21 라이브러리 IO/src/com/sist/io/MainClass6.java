package com.sist.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//파일 복사
/*
 * 	읽기 : int read(),int read(byte[], off, len)
		 ====		---
		 문자번호 		읽은 바이트 수
 *  쓰기 : write(byte), write(String)
 *  닫기  :close()
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

			int i=0; //읽은 바이트 갯수
			byte[] buffer = new byte[1024];
			while((i=fis.read(buffer,0,1024))!=-1) {
				fos.write(buffer, 0, i);
				// out.write() 파일 전송
			}
			fis.close();
			fos.close();

			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
