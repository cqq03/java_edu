package 반복문;

import javax.swing.JOptionPane;

public class 반복문연습문제2 {

	public static void main(String[] args) {
		int count = 1;  //int target = 55 라 설정할수도 있음
		while (true) {
			
		
			
			String answer = JOptionPane.showInputDialog("정답 입력란: ");
			int ans2 = Integer.parseInt(answer);
			if (ans2 == 55) {  //data2 == target으로 설정가능 
				System.out.println("정답입니다.");
				break;
				
			} else if (ans2 > 55) {
				count++;
				System.out.println("정답보다 큰 값입니다.");
			} else {
				count++;
				System.out.println("정답보다 작은 값입니다.");
			}
		}
		System.out.println(count + "번만에 맞추셨습니다.");
	}
	//큰구조를 정답/ 정답x로 잡고 if에 정답입니다. else에 정답이 아닙니다하고 그 밑에 if, else추가 하는식이 문제에서 요구한 것
}
