package com.sist.io;
//����
/*
 * 	1) ������ �ִ� ��� ���� �б� ==> listFiles => ������ : File[]
 *  2) ���� ���� : mkdir() => void
 *  3) ���� ���� : delete() => void
 *
 */
import java.io.File;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File dir = new File("c:\\oracle");
//			if(!dir.exists()){ //oracle ������ ���� ���� ������...
//				dir.mkdir();
//			}
//			System.out.println("����Ŭ ���� ���� �Ϸ�");
			if(dir.exists()) {
				dir.delete();
			}
			System.out.println("����Ŭ ���� ���� ");
		}catch (Exception ex)	{}
	}

}
