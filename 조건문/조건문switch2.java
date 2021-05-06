package 조건문;

import javax.swing.JOptionPane;

public class 조건문switch2 {

	public static void main(String[] args) {
		//조건이 많을 때 사용, 조건이 특정한 값인 경우
		//switch는 break 기능이 없음
		
		String choice = JOptionPane.showInputDialog("0: 아이유, 1: 태연, 2: 아이들, 3: 아이돌싫어! "); //아이유인 경우 0번을 선택
		
		switch (choice) {
		
		case "0":
			System.out.println("아이유를 선택하심.");
			break;
		case "1":
			System.out.println("태연을 선택하심.");
			break;
		case "2":
			System.out.println("아이들을 선택하심.");
			break;
			
		default:
			System.out.println("아이돌을 싫어함.");
			break;
		}	
	}
	
}
