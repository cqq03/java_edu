package 컬렉션;

import java.util.HashMap;

public class 맵형 {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("연필", "pencil");
		System.out.println(dic);
		System.out.println(dic.size());
		System.out.println(dic.get("사과"));
		dic.put(1, "one");//타입에 상관없이 쓸 수 있음
		System.out.println(dic);
	}

}
