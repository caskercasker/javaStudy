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
public class ������� {
	int a=100; //���ÿ�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa();
		aaa();
		aaa();

		TV t;
		t = new TV(); //�ν��Ͻ��� �����Ѵ�...
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " +t.channel);





	}
	public static void aaa() {
		int a=10;
		System.out.println("a="+a);
		++a;
	}
}



