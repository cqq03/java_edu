package 형변환;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class 참조형형변환4 {
	
	public static void main(String[] args) {
		//객체설계할 때 2대 원칙
		//하나의 클래스안에는 하나의 역할만을 정의해야 한다. 응집도(cohension) 높게!
		//결합시 특정한 클래스만 지정하여 설계하면 안 된다. 결합도(coupling) 낮게
		맨 m = new 맨();//맨만 쓸 수 있음
	////하나의 이름으로 여러가지 형태 구현하여 사용하는 자바의 이 특징
		//자동형변환으로 가능/ : 오버로딩!(다형성)
		사람 m2 = new 맨();//맨, 우먼 다 쓸 수 있음, 결합도 낮음
		m2 = new 우먼();
		m2 = new 슈퍼맨(); //융통성 있게 바뀜. 나중에 고쳐나가기 용이함.  
							//유자보수, 더 좋은 성능을 가진 클래스로 변경도 용이
		             //작업양도 줄일 수 있다.
		ArrayList list2 = new ArrayList();
		List list = new ArrayList();
		list.add("a");
		
		
	}
}
