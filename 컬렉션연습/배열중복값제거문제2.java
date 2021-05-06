package 컬렉션연습;

import java.util.HashSet;
import java.util.Random;

public class 배열중복값제거문제2 {

	public static void main(String[] args) {
		int[] num = new int[5000];//5000개 배열
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50000) + 1; //0~50000
			
		}
		HashSet set = new HashSet();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]); //배열에서 가져온 것을 셋에 추가
		}
		System.out.println(set);
		System.out.println(set.size());
	}

}
