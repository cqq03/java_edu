package 컬렉션연습;

import java.util.HashSet;
import java.util.Random;

public class 로또번호만들기6자리로 {

	public static void main(String[] args) {
		Random r = new Random(42);
		/*
		 * //6개 만들어 저장할 공간을 만들자. int[] lotto = new int[6]; //배열은 처음부터 고정, arraylist는
		 * 유동적으로 for (int i = 0; i < lotto.length; i++) { int num = r.nextInt(45) +
		 * 1;//1~45 //전체 배열에 해당 숫자가 있는지 체크해야 함. for (int j = 0; j < lotto.length; j++) {
		 * if (num == lotto[i]) {
		 * 
		 * } } } for (int i = 0; i < lotto.length; i++) { System.out.print(lotto[i] +
		 * " "); }
		 */
		
		//너무 복잡함! 헤걀책: 중복체크해서 넣어주는 클래스 사용: HashSet
		HashSet lotto = new HashSet();
		/*for (int i = 0; i < 6; i++) {*/ //이 경우는 중복값이 아예 제거됨
		while(lotto.size() < 6) {
		
			int num = r.nextInt(45) + 1;
			System.out.println("랜덤값: " + num);
			lotto.add(num);
		}
		System.out.println(lotto);//
	}

}
