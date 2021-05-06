package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환2 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//자동형변환 Object로 변환!
		//자동형변환의 단점: 부가적으로 추가된 기능등을 쓸 수 없다.
		
		//12. //하나의 이름으로 여러가지 형태 구현 >>//하나의 이름으로 여러가지 형태 구현 >>
		list.add(new 맨());//0번 인덱스
		list.add("홍0길동"); //1번인덱스
		list.add(new Random());
		list.add((new 슈퍼맨()));
		System.out.println(list);
		//list.get(0).charAt(0);
		//String에서 추가된 메서드들은 바로 쓸 수 없다
		//list.get(1).run(); >>오브젝트로 바구었으니 오브젝트기능만 쓸 수 있다.
		//String의 추가 기능을 사용하고 싶으면 다시 String으로 형변환해주면 된다.
		String name = (String) list.get(1);//꺼낼때 강제형변환 
		System.out.println(name.charAt(0));
		맨 m = (맨) list.get(0);
		m.run();
	}
}
