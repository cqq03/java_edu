package 컬렉션연습;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 리스트형중복제거 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < 5000; i++) {
			//5000개의 랜덤한 값을 넣어서
			list.add(r.nextInt(10000) + 1); //0~10000의 값
			System.out.println(list.get(i));  
			
		}
		System.out.println(list.get(0));
		//중복제거해서 프린트
		HashSet set = new HashSet();  //중복제거 컬렉션
		for (int i = 0; i < 5000; i++) {//5000으로 수정해주는 것 잊지 말것
			set.add(list.get(i)); //list에서 가져온 것을 셋에 추가
		}
		
		System.out.println(set);
		//개수가 몇 개인지 세어보세요
		System.out.println(set.size());
	}
}
