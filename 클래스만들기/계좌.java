package 클래스만들기;

public class 계좌 {
	public String name;
	public String Bb;
	public int money;
	
	
	public void deposit(String name, String Bb, int money) {//지역변수는 밖에서 인식 불가기 떄문에 전역변수랑 이름 똑같이 써도 문제 x
		System.out.println("당신이 입금한 이름은 " + name);
		System.out.println("당신이 입금한  통장종류는 " + Bb);
		System.out.println("당신이 입금한  금액은 " + money);
		
	}
	public void deposit(String name, int money) {
		System.out.println("입금한 당신의 이름은 " + name);
		System.out.println("당신이 입금 금액은 " + money);
	}
	public void withdraw(int mon) {
		System.out.println("당신이 출금한 금액은 " + mon);
		
	}
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", Bb=" + Bb + ", money=" + money + "]";
	}

}
