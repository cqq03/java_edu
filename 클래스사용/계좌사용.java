package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 account = new 계좌();
		account.name = "park";
		account.Bb = "예금";
		account.money = 10000;
		account.deposit(account.name, account.money);
		account.deposit(account.name, account.Bb, account.money);
		account.withdraw(account.money);
		account.toString();
		System.out.println(account);
	}

}
