// if 수행문장의 범위
/*
 * 	if(조건문)
 * 		실행문장 1	=====> if의 소속문장
 * 		실행문장 2 =====> if와 관련이 없는 문장 => true/false와 관련 없이 무조건 수행 문장
 * 		=> 자바에서 모든 제어문은 {}이 없는 경우 한문장만 수행
 *
 *		if(조건문)
 *	{
 *		실행문장 1 ===> 가독성
 * }
 * 		싱행문장 2
 *
 * ==> 가독성, 최적화, (리펙토링), 마이그레이션 (Spring ==> SpringBoot) Ajax <-> React
 * 	abc() ==> add()
 *  def() ==> minus()
 *
 */
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		//여러개의 실행문장을 동시에 제어 할떄 사용하는 조건문
		if(num%2!=0) {
			int b = 100;

			System.out.println("b는"+b+"입니다");
			System.out.println(num+"는(은) 짝수입니다");
			System.out.println("프로그램종료");
			b++;
		}
		//System.out.println(b); //==> {}안에서만 사용하는 변수 지역변수
	}

}
