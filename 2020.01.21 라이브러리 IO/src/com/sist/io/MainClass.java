package com.sist.io;
/*
 * 	java.io (웹 => File) : 다운로드/업로드(라이브러리)
 *  =======
 *  입출력
 *  	= 메모리 ==>
 *		  Input	 : BufferedReader(new InputStreamReader(System.in))
 *					=> 키보드 입력값을 받는 경우
 *		  Output : System.out.println()
 *  	= 파일
 *  	  Input :  BufferedReader(new InputStreamReader(new FileInputStream("경로명"))
 *  	  Output : FileOutputStream, FileWriter
 *  	= 네트워크
 *  	  Input : BufferedReader(new InputStreamReader(s.getOutputStream())
 *  												  ===
 *  													s= Socket
 *  	  Output : s.getOutputStream()
 *  	==========================================================================
 *  		IO = (Stream -> 데이터 이동 통로) = 단방향 통신
 *  		====
 *  		Input : 1byte => InputStream, 2byte => Reader  (한글)
 *  		Output :1byte => OutputStream, 2byte => Writer
 *
 *  		====> .txt, .xml, .json (javascript 주로 사용 데이터 파일)
 *  					=========== web에서 주로 사용 (데이터 추출 -> 파싱)
 *  					.json => React, Vue  => Ajax, RestController
 *
 *  		File 클래스
 *  		=========
 *  		= 파일 ===============> new File ("c:\\javaDev\\a.jpg")
 *  		= 디렉토리(폴더)	====> new File ("c:\\javaDev")  ..상위폴더, .현재폴더
 */
//Application => 탐색기
import java.io.File;
/*
 * 	io, sql => 컴파일 예외처리 => 반드시 예외처리 사용
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File dir = new File("c:\\javaDev");
			File[] files = dir.listFiles();
			for(File f:files) {
				if(f.isDirectory()) { //폴더
					System.out.println("["+f.getName()+"]"); //대괄호가 있으면 폴더
				}else {
					System.out.println(f.getName()); // 파일
				}

			}
		}catch (Exception ex) {}
	}

}
