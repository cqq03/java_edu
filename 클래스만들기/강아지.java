package 클래스만들기;

public class 강아지 {
	//멤버변수 => 성질
	public String color;
	//pubic으로 선언하지 않으면 다른 패키지에서는 not visible
	public String type;
	//멤버메서드 =>동작
	public void 애교부린다() {//public을 지우면 다른 패키지에선 이것을 쓸 수 없다.
		System.out.println("강아지가 애교를 부린다.");
	}
	public void bark() {
		System.out.println("멍멍!");
	}
}
