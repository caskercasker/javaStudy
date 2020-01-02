/*
 * 객체지향 프로그램
 * ===========
 * 	1) 구성요소
 * 		=====================
 * 		변수 : 기본형, 사용자정의 (배열,클래스) => 클래스 전체에서 사용할수 있는 변수
 * 		=> 클래스 : 데이터형
 * 		=======================================
 * 			생성자 : 필요시에만 사용(초기화)
 * 			# 리턴형(x), 클래스 이름가 동일
 * 			=> 다른 클래스에서 사용이 가능 (public)
 * 		========================================
 * 			메소드 기능 수행 (요청처리)
 * 				=======
 * 				1. 연산자
 * 				2. 제어문
 * 			====> 다른 클래스에서 사용이 가능

 *  2) 접근지정어 (멤버변수, 메소드, 생성자)
 *  			지역변수는 사용이 불가능
 *
 *  ==================================================================================
 *  				자신의 클래스에서만	같은폴더(패지키)안에서		다른폴더안에서 		어디든 상관없이
 *  				사용이 가능 			사용이 가능				사용이 가능(상속)		접근이 가능
 *  =================================================================================
 *	private  			O				X					X				X
 *	=================================================================================
 *  default				O				O					X				X
 *  =================================================================================
 *  protected			O				O					O				X
 *  =================================================================================
 *  public				O				O					O				O
 *  =================================================================================
 *  		기본형식은 멤버변수는 private, 메소드는 public을 사용한다.
 *  		=> 메소드를 통해서 멤버변수에 접근이 가능 만든다. (캡슐화)
 *  3) 객체지향 프로그램 작성
 */

/*
 * 	1)변수(멤버변수)
 * 		접근지정어 데이터형 변수명;
 *  2) 생성자
 *  	접근지정어 클래스명(){}
 *  3) 메소드	: public
 *  	접근지정어 			옵션						 리턴형 메소드명 (매개변수..) {}
 *  	=====			====			==== 기본형,클래스명,배열,void
 *  	private			static,abstract(추상)
 *  	protected
 *  	public
 *  	default
 *
 */

/*	변수 : 메모리에 저장(쓰기)  ==> 쓰기 기능 (sexXxx)
 * 		  메모리에서 데이터 읽기 	==> 읽기 기능 (getXxx)
 *
 * 		ex> private String id;
 * 				getid(), setid()
 *
 *
 *
 */
class Movie{
	private int mno;
	String title;
	protected String actor;
	public double score;
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		m.title="";
		//m.mno=10;
		m.actor="";
		m.score=4.5;
	}

}
