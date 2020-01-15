package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class A {
	public static void main(String args[]) throws InterruptedException {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer element = it.next();
			System.out.println(element);
		}
		//iterator , hasNest, next() 메소드
		//Iterator 인터페이스
		System.out.println("====================");

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		Iterator<Integer> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			Integer key = it2.next();
			String value = map.get(key);
			System.out.println(key+"-"+value);
		}



		Iterator<Map.Entry<Integer,	String>> it3 = map.entrySet().iterator();
		while(it3.hasNext());
	}
}
