// 추상 클래스의 일종 => 모든 메소드가 구현되어 있지 않다.
// 상속
interface Ani{
	void walking();
	void eating();
}
class Human implements Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("두발로 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("수저로 먹는다");
	}

}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
