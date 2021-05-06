package 컬렉션연습;

import java.util.ArrayList;
import java.util.HashMap;

public class 연습문제2 {
	public static void main(String[] args) {
		//1번 
		ArrayList list = new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등: " + list.get(i));
			
		}
		//2번
		HashMap map = new HashMap();
		map.put(100, "김데이");
		map.put(200, "김사전");
		map.put(300, "김구조");
		map.put(400, "김자료");
		System.out.println(map);
		map.remove(200);
		map.put(300, "김충성");
		System.out.println(map);
	}

}
