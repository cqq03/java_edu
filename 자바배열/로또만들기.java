package 자바배열;

import java.util.Random;

//import 자바배열응용.다른패키지클래스;

public class 로또만들기 {

	public static void main(String[] args) {
		int[] lotto = new int[100];
		Random r = new Random(42);//(씨앗seed값);
		
		//배열만들기 name = new 배열만들기();
		//다른패키지클래스 name2 = new 자바배열응용.다른패키지클래스();
		// 다른패키지클래스는 그냥 못찾음 그것을 알려주는 것이 ~.~. 자동완성으로 import 등록
		//많은 양의 자동 import : 컨트롤 쉬프트 o 
		//마우스 갖다대기, 자동완성, 나중에 생각안나면 위의 단축키
		for (int i = 0; i < lotto.length; i++) { //6번

			lotto[i] = r.nextInt(45) + 1;  //시드 값의 의미는?<<<<<<<<<<<<
			
		}
		for (int x : lotto) {
			
		
			System.out.print(x + " ");
		}
		System.out.println();
		int count = 0;        //몇 이상의 데이터가 몇개인지 찾기
		for (int x : lotto) {   //여기서 왜 for each?<<<<<<<<<<<
			if (x >= 40) {
				count++;
			}
		}
		System.out.println(count);
	}

}
