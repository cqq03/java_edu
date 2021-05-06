package 클래스만들기;

public class TV {
	//클래스이름을 대문자로 시작해야함.
	//낙타표기법을 지켜야 좋은 코드
	//성질(속성, property, attribute)
	//=>변수
	//==>멤버변수 , 선택의 의미
	//멤버변수는 선언만 해준다.! 선언은 ram에 저장
	//멤버변수는 자동초기화됨 . 참조형은 null! 기본형은 기본값(0, 0.0, false)
	String color;//멤버 변수는 여기서 값 부여 x 이유는 여기서 부여하면 다 똑같은 값
	int size;//나 이거 2개만 선택해서 변수로 넣었어 
	
	
	//동작(함수, 기능처리, 명령어)
	//cpu에서 처리하는 것
	//==>메서드(method 어떤 기능을 처리하기 위한 방법을 정의)
	//멤버메서드(하나하나 기능정의)
	public void on() {
		//함수이름은 소문자로 시작, 변수이름도!
		
		System.out.println("TV를 켜다.");
		
	}
	public void off() {
		System.out.println("TV를 끄다.");
	}
	public void ch() {
		System.out.println("TV채널을 바꾸다.");
	}
	
}
