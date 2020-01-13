import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		t.stop();

		ArrayList list = new ArrayList();
		list.add("±è¾¾");
		list.add("¹Ú¾¾");
		list.add("ÀÌ¾¾");
		list.add("ÃÖ¾¾");

		System.out.println("ÀúÀåÀÎ¿ø"+list.size());
		for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
				System.out.println(name);
		}
		System.out.println("===============");
		list.remove(1);

		for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
				System.out.println(name);
		}

		System.out.println("===============");


		for(int i=0; i<list.size(); i++) {
			String name=(String)list.get(i);
				System.out.println(name);
		}


	}
}


