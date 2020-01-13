//add,remove,set 	index번호에 유의하라
import java.util.ArrayList;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		//이름 목록
		list.add("KYS"); //0
		list.add("LSJ"); //1
		/*
		 * ======
		 * add()//2
		 */
		list.add("Can");//3
		list.add("KKK");//4
		list.add("YUQ");//5

		//저장 갯수 확인
		System.out.println("저장된 인원수"+list.size())	; //size(크기를 확인)
		//출력
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}

		//데이터 형이 통일되면 제어하기 편하다.

		System.out.println("=====================");
		//출력
		list.add(2,"강감찬"); //2번자리에 끼어들게 하고 추가

		//출력
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("==================");
		list.remove(3);
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		//수정
		list.set(3, "고구마");
		//출력

		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}

		list.add(100);
		for(int i=0;i<list.size();i++) {
			//String name=(String)list.get(i);
			String name = String.valueOf(list.get(i));
			System.out.println(name);
		}
	}

}
