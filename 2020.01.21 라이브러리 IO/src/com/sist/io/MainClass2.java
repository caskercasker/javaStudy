package com.sist.io;
//폴더
/*
 * 	1) 폴더에 있는 모든 파일 읽기 ==> listFiles => 리턴형 : File[]
 *  2) 폴더 생성 : mkdir() => void
 *  3) 폴더 삭제 : delete() => void
 *
 */
import java.io.File;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File dir = new File("c:\\oracle");
//			if(!dir.exists()){ //oracle 폴더가 존재 하지 않으면...
//				dir.mkdir();
//			}
//			System.out.println("오라클 폴더 생성 완료");
			if(dir.exists()) {
				dir.delete();
			}
			System.out.println("오라클 폴더 삭제 ");
		}catch (Exception ex)	{}
	}

}
