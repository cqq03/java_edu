package 반복문;

import javax.swing.JOptionPane;

public class 연습문제복습 {
	
	public static void main(String[] args) {
		
		
		
		int co50 = 0;
		int co60 = 0;
		int co70 = 0;
		int co80 = 0;
		int co90 = 0;
		int num = 0;
		int sum = 0;
		while (true) {
			String data = JOptionPane.showInputDialog("점수를 입력하세요(종료 0): ");
			int data2 = Integer.parseInt(data);
			sum = sum + data2;
			if (data.equals("0")) {
				System.out.println("시스템을 종료합니다.");
				break;
			} 	
			if (data2 >= 90) {
				co90++;	
			} else if (data2 >= 80) {
				co80++;
			} else if (data2 >= 70) {
				co70++;
			} else if (data2 >= 60) {
				co60++;
			} else {
				co50++;
			}
			
			System.out.println("-------------------------");
			System.out.println("60점 미만 : " + co50 + "명");
			System.out.println("60점 이상 : " + co60 + "명");
			System.out.println("70점 이상 : " + co70 + "명");
			System.out.println("80점 이상 : " + co80 + "명");
			System.out.println("90점 이상 : " + co90 + "명");
			System.out.println("-------------------------");
			num = co50 + co60 + co70 + co80 + co90;
			System.out.println("총 " + num + "명의 평균은 " + sum / (double)num + "점");
			
			
		}
		
	
	
	
	}
}
