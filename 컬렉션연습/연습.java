package 컬렉션연습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 연습 {
		//FIFO큐형 First Input First Output: 선입선출
	public static void main(String[] args) {
		//1번
		HashSet team = new HashSet();//중복 허용X
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		System.out.println("팀원 목록은 " + team);
		//2번
		LinkedList milk = new LinkedList(); //Queue 먼저 들어온 것이 나가는 것
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println("현재 남은 우유 이름은 " + milk);
		//3번
		ArrayList ski = new ArrayList(); //순서가 의미 있는 자료 묶음 
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i + 1 + "등이 " + ski.get(i));
			
		}
		System.out.println("--------------");
		ski.remove(1);
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i + 1 + "등이 " + ski.get(i));
			
		}
				//4번
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");  //1번으로 하는 것보다 1로 하는 것이 데이터 용량을 덜 쓰므로 좋다 
		phone.put(4, "동생");    
		System.out.println(phone);
		System.out.println(phone.get(2));
		//5번
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println("전채 시험볼 과목: " + test);
		for (int i = 0; i <= test.size(); i++) {
			test.remove();//여기서 사이즈가 바뀜
			System.out.println(i + 1 + "일차 시험본 후 남은 과목: " + test);
		}
		
	}

}
