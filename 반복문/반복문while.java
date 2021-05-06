package 반복문;

import javax.swing.JOptionPane;

public class 반복문while {

	public static void main(String[] args) {
		//조건이 많을 때 사용, 조건이 특정한 값인 경우
		//switch는 break 기능이 없음
		int iu = 0; //변수는 초기화를 시켜주어야 한다.
		int ta = 0;
		int id = 0;
		while (true) {
		
			String data = JOptionPane.showInputDialog("0)아이유, 1)태연, 2)아이들, 3)종료");
			if (data.equals("3"))  {
				System.out.println("투표 시스템을 종료합니다.");
				System.out.println("아이유: " + iu + "표");
				System.out.println("태연: " + ta + "표");
				System.out.println("아이들: " + id + "표");
				break;
			}	
 			switch (data) {
			
			case "0":
				System.out.println("아이유를 선택하심.");
				iu++; //증감연산자, iu = iu +1; --는 1씩 감소
				break;
			case "1":
				System.out.println("태연을 선택하심.");
				ta++;
				break;
			case "2":
				System.out.println("아이들을 선택하심.");
				id++;
				break;
				
			default:
				System.out.println("해당 연예인이 없습니다.");
				break;
					
 			}
		}
		
	}
}