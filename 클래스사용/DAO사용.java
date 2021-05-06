package 클래스사용;

import 클래스만들기.MemberDAO;

public class DAO사용 {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		dao.create("apple", "apple", "apple");
		dao.delete("apple");
		dao.create("dsa", "ASD", "ADS", "13120");  //자바는 같은 이름이어도 
												//메서드의 타입, 순서, 개수에 따라 다르게 사용가능
												//오버로딩(다형성, 폴리모피즘7
		//오버로딩은? 하나의 이름으로 여러가지 형태를 사용할 수 있는 기능, 메서드 오버로딩, 자바에서는 o, 파이썬은 x
		//입력값이 다르다면 메서드 이름을 동일하게 사용할 수 있다.
		//오버라이딩은? 상속 받은 메서드 중에서 기능을 재정의해서 사용 
	}

}
