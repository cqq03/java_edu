package 클래스만들기;

public class MemberDAO {
	//전역변수, 자동초기화
	//참조형 변수는 무조건 null로 초기화, null은 주소가 없다라는 표현=아직 객체 생성x
	//url: 멤버변수, 전역변수(범위<->지역변수), 참조형변수(들어가는 데이터 유형에 따라<->기본형변수)
	String url = "jdbc:mysql://localhost://3306/shop";
	String user = "root";
	String password = "1234";
	
	public void create(String id, String pw, String name) {
						//id, pw, name: 지역 변수
		System.out.println("당신이 입력한 id는 " + id);
		System.out.println("당신이 입력한 pw는 " + pw);
		System.out.println("당신이 입력한 name은 " + name);
	}
	public void create(String id, String pw, String name, String tel) {
		System.out.println("두번쨰 create");
	}
		
	
	public void delete(String id) {
		//System.out.println(name);//변수에 에러가 뜨면 만들어 졌는지, 이 지역에서 사용할 수 있는지. 
		//                    name은 지역변수라서 다른 메서드에서 접근 불가
		System.out.println("당신이 입력한 id는 " + id);
	}
	@Override
	public String toString() {
		return "MemberDAO [url=" + url + ", user=" + user + ", password=" + password + "]";
	}
	
	
	
}
