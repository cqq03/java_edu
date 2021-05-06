package 데이터;

public class 확인문제3 {
	public static void main(String[] args) {
		//한글자이면 char를 사용하는 것이 좋다.
	char pw1 = 'p';
	char pw2 = 'q';
	//비교연산자는 기본형만 쓸 수 있음.
	if (pw1 == pw2) {//true
		System.out.println("PASS");
	} else { //false
		System.out.println("재입력");
		
	}
	
	double tod = 50;
	double yes = 52.2;
	double chan = yes - tod;
	if (chan > 2) {
		System.out.println("다이어트 성공!");
	} else { 
		System.out.println("재입력!");
		
	}
	if (chan > 2 && pw1 == pw2) {
		System.out.println("오늘은 성공!");
		
	} else {
		System.out.println("내일 다시 도전!");
	}
	}
}
