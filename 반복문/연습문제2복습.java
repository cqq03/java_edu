package 반복문;

import javax.swing.JOptionPane;

public class 연습문제2복습 {

	public static void main(String[] args) {
		int target = 55;
		int count = 0;
		while (true) {
			
			String ans = JOptionPane.showInputDialog("정답은?: ");
			int ans2 = Integer.parseInt(ans);
			
			if (ans2 == target) {
				System.out.println("O");
				System.out.println("정답을 맞추셨습니다.");
				count++;
				System.out.println("시도 횟수는: " + count + "번");
			break;	
		
			} else {
				System.out.println("X");
				System.out.println("정답을 맞추지 못하셨습니다.");
				if (ans2 > 55) {
					System.out.println("정답보다 커요.");
					count++;
					
				} else {
					System.out.println("정답보다 작아요.");
					count++;
					
				}
			} 
			
		
		
		}
		
	}

}
