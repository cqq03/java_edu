package 컬렉션연습;

import java.util.HashSet;

public class 배열중복값제거문제 {

	public static void main(String[] args) {
		String[] food = {"감자", "고구마", "양파", "감자", "고구마"};
	
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		HashSet set = new HashSet();
		for (int i = 0; i < food.length; i++) {
			set.add(food[i]);//배열에서 가져온 것을 set에 추가
		}
		System.out.println(set);
		

	}

}
