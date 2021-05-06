package 반복문;

import java.util.Random;

public class 모르는아무숫자 {

	public static void main(String[] args) {
		// 랜덤부
		Random r = new Random();
		int num = r.nextInt(100)-1;              //~21억~21억   //r.next 자동완성에 범위나옴
		System.out.println(num);
		
	}

}
