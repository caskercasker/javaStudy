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
		s.setName("홍길동");
		s.setDpet("개발부");
		list.add(s);

		s = new Sawon();
		s.setSabun(2);
		s.setName("김동동");
		s.setDpet("영업부");
		list.add(s);

		s = new Sawon();
		s.setSabun(3);
		s.setName("고동만");
		s.setDpet("기획부");
		list.add(s);

		for(Sawon ss:list) {
			System.out.println(ss.getSabun());
			System.out.println(ss.getName());
			System.out.println(ss.getDpet());
		}


	}

}
