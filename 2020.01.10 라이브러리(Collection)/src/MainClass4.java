import java.util.ArrayList;
class Sawon{
	private int sabun;
	private String name;
	private String dpet;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDpet() {
		return dpet;
	}
	public void setDpet(String dpet) {
		this.dpet = dpet;
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list= new ArrayList<>();
		Sawon s = new Sawon();
		s.setSabun(1);
		s.setName("ȫ�浿");
		s.setDpet("���ߺ�");
		list.add(s);

		s = new Sawon();
		s.setSabun(2);
		s.setName("�赿��");
		s.setDpet("������");
		list.add(s);

		s = new Sawon();
		s.setSabun(3);
		s.setName("����");
		s.setDpet("��ȹ��");
		list.add(s);

		for(Sawon ss:list) {
			System.out.println(ss.getSabun());
			System.out.println(ss.getName());
			System.out.println(ss.getDpet());
		}


	}

}
