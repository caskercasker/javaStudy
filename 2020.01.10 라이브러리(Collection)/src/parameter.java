import java.util.ArrayList;

//제네릭스 사용법
public class parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); //매개변수 ~ 리턴형의 데이터이 변환
		list.add(100);

		for(int i=0; i<list.size(); i++) {
			int num = list.get(i);
			System.out.println(num);
		}
	}

}
