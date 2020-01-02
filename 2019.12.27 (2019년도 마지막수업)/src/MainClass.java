/*
 * 	자바 (클래스가 여러개) ==> 한 파일. 별도로 파일  만들어서 사용
 *  한개의 파일에서 사용
 *  =============
 *  class A
 *  class C
 *  class D
 *  public class B
 *  ============= B.java 파일...(public 클래스는 한개만 존재)
 *
 *  class A
 *  class B
 *  ========
 *  public 이 반드시 존재해야함.
 *
 */
// 조립기 main 이 있는 곳이 조립 하는 곳.




/*class Human {
 * 	String name;
 *  String sex;
 *  int age;
 *  }
 *
 *  Human hon = new Human();
 *  "new" 동적 메모리할당 (실행할 때 메모리가 만들어진다.)
 *
 */
class News {
	String title;
	String content;
	String author;
	String regdate;

	//선언만 하는 영역
	//static String site;	//저장된 값은 하나만 존재.. 메모리 공간이 매번 할당 되지 않음.  공통변수.
	// 지역변수를 활용하고자 하면, 메소드를 통해서 값을 받아와서 활용.

} //News 데이터형

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장  = 통으로 저장
		// 메모리를 만들기
		News n1 = new News();
		n1.title = "\"8일째 1위\"..'백두산', 450만명 돌파..'천문' 개봉 첫날 14만 흥행 2위";
		n1.content = "[OSEN=하수정 기자] 영화 '백두산'이 성탄절에 이어 문화의 날에도 흥행 정상을 지켰고, '천문: 하늘에 묻는다'가 첫날 2위에 오르며   박스오피스 판도가 또 바뀌었다. 27일 영화진흥위";
		n1.author = "OSEN";
		n1.regdate = "19.12.27";

		//n1=new New(); 주소값이 바뀌어 기존에 있던 값은 가비지 콜렉션의 대상.
		News n2 = new News();
		n2.title = "진선규·성유빈 영화 '카운트' 캐스팅";
		n2.content = "배우 진선규와 성유빈이 영화 ‘카운트’에서 호흡을 맞춘다고 배급사 CJ엔터테인먼트가 27일 전했다. 금메달리스트 출신 골칫덩이 체육선생(진선규)과 주먹 하나는 타고난 반항아(성유빈";
		n2.author = "아시아경제";
		n2.regdate = "19.12.27";

		//출력
		/*
		 * int a=10;
		 */
		System.out.println(n1.title);
		System.out.println(n2.title);
	}

}
