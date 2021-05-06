package 컬렉션;

import java.util.ArrayList;

public class 리스트형 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//순서가 의미있는 데이터들의 모음
		list.add("먹기");
		list.add("마시기");
		list.add("운동");  //순서가 의미 있음 먹기>마시기>운동
		System.out.println(list.get(0));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ": " + list.get(i));
		}
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println(list);//arraylist만들면서 toString을 오버라이딩 해둠 , 안했다면 주소가 뜸
	}

}
