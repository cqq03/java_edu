package 컬렉션연습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class 복습 {

	public static void main(String[] args) {
		
		//1번
		HashSet set = new HashSet();
		set.add("디자이너");
		set.add("프로그래머");
		set.add("DB관리자");
		System.out.println("팀원 목록은 " + set);
		//2번
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		//3번
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		System.out.println(list);
		list.remove(1);
		System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + 1 + "등 : " + list.get(i));
			}
		//4번
			HashMap map = new HashMap();
			map.put(1, "엄마");
			map.put(2, "아빠");
			map.put(3, "친구");
			map.put(4, "동생");
			System.out.println(map);
			System.out.println(map.get(2));
	
	
	
	
	}
		
		
		
		
		
		
		
	

}
