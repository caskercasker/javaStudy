/*
 * for(int i=1; i<=10; i++)
 * 	{
 * 		System.ous.println(i);
 * 	}
 * 	int i=1;
 *
 * 	do
 * 	{
 * 		System.out.println(i);
 * 		i++;
 *  }while(i<=10);
 *
 *
 *
 *
 */
class TV{
	String color;
	boolean power;
	int channel;

	void power() {power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
public class 제어문정리 {
	int a=100; //스택에저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa();
		aaa();
		aaa();

		TV t;
		t = new TV(); //인스턴스를 생성한다...
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " +t.channel);





	}
	public static void aaa() {
		int a=10;
		System.out.println("a="+a);
		++a;
	}
}



