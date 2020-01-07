/*
 * 		오버라이딩
 * 		======= 추상 클래스, 인터페이스
 * 		상속이 존재
 * 		메소드 명이 동일
 * 		매개변수 동일
 * 		리턴형도 동일
 * 		접근 지정어의 확장
 * 		============
 * 			private < default < protected < public
 *
 * 		==> Interfcae I{
 * 				int a;			=> 오류 ====> 	public static final int a = 10
 * 											===============================
 * 				void display();		=====>		public abstract void display();
 * 			}
 *
 * 			public A Implements I{
 * 				void display(){		==> 오류
 * 				}
 * 			}
 *
 * 	상속이 안되는 클래스 : 종단 클래스
 *  public final class
 *  상속의 예외 : static , 생성자
 *
 */
class Super{
	public void display() {
		System.out.println("Super:display() Call");
	}
}
class Sub extends Super{
	@Override
	public void display() {
		System.out.println("Sub.display() Call");
	}
}
class Sub2 {
	Super su = new Super() {
		@Override
		public void display() {
			System.out.println("sub.display() Call");
		}
	};//세미콜론의 위치
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.display();
		Sub2 s2 = new Sub2();
		s2.su.display();
	}

}
