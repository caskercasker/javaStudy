package com.sist.io;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\javaDev\\javaStudy\\2020.01.20 자바 최종 정리\\src\\com\\sist\\java\\MainClass.java");
			FileReader fis = new FileReader(file);
			//생성자 => 여러개의 생성자를 가지고 있을 수 있다 (오버로딩)
			int i=0; //값을 읽기 ==> read() ==> ASC를 읽어온다.
			String data="";
			while((i=fis.read())!=-1) {  //-1은 EOF
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
			FileWriter fos = new FileWriter(file2,true); //true면 append
			fos.write(data);
			fos.close();
			System.out.println("파일 쓰기 완료"); //덮어쓰기
			/*
			 *  클래스
			 *  ====
			 *  	1) 구성요소
			 *  		1. 멤버변수 : (개별사용변수(인스턴스), 공통변수(정적변수))
			 *  					=======	  		======
			 *  					private in a; ==> 저장공간을 생성 후에 저장
													  ==========
													  	new
			 *  									private static ==> 클래스 로더
			 *
			 *  					기본형, 클래스, 배열 ==>  데이터형
			 *  						  =========
			 *  							사용자정의 데이터형
			 *
			 *  					=> 메소드안에서 사용하는 변수 : 지역변수
			 *  			=====================================================
			 *  			멤버변수 : 자동 초기화
			 *  			지역변수 : 반드시 초기화를 해서 사용한다.
			 *
			 *  		2. 메소드 :
			 *  			= 선언만 된 메소드 (추상메소드) => 미완성된 클래스
			 *  				=============== 완성을 해서 사용 (추상클래스, 인터페이스)
			 *  				public void display();
			 *  				= 선언+구현 메소드
			 *  					public void display(){
			 *  						//구현부
			 *  					}
			 *  				=> 사용자의 요청값을 받아서 처리 결과를 보내준다.
			 *  				   ----------	    ------
			 *  					 매개변수 			리턴형
			 *  									------
			 *  									1개만 사용
			 *  									= 경우의 수가 많은 경우
			 *  									= 데이터가 많다.(배열, 크래스, 컬렉션) ***************
			 *  				=> 매개변수 : 3개이상이면 => 클래스로 묶어서 전송
			 *  				=> 메소드는 동기화
			 *  					aaa();
			 *  					bbb();
			 *  					ccc();
			 *  				=> 메소드가 주로 하는 역할  : 통신 (클래스와 클래스 => 메시지)
			 *  					==============
			 *  					변경이 가능하고, 재상용이 가능
			 *  					클래스와 클래스를 연결
			 *
			 *  		3. 생성자 : 멤버변수의 초기화 : 멤버변수에 값을 대입
			 *  								==============
			 *  								1) File을 읽어서 값을 대입
			 *  								2) 제어문 사용
			 *  								*** Class의 불록은 구현을 할수 없다.
			 *
			 *
			 */


		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
