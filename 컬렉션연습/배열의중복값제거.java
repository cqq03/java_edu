package 컬렉션연습;

import java.util.HashSet;
import java.util.Random;

public class 배열의중복값제거 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[1000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); //0-999
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]); //1000개니 중복확인 힘듦
		}
		HashSet set = new HashSet();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);//배열의 중복값 제거
		}
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
