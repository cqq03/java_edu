package 반복문;

import javax.swing.JOptionPane;

public class 반복문연습문제 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		//변수값은  while위에 
		while (true) {
		
			String data = JOptionPane.showInputDialog("점수를 입력하세요. (종료 0)");
			
			int data2 = Integer.parseInt(data);
			sum = sum +data2;
			if (data.equals("0")) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("-------------------------");
				break;
			} else if (data2 >= 90) {
			
				num5++;
			} else if (data2 >= 80) {
				
				num4++;
			} else if (data2 >= 70) {
				
				num3++;
			} else if (data2 >= 60) {
				
				num2++;
			} else {
				
				num1++;;
			}
		;
			System.out.println("60점 미만 : " + num1 +"명");
			System.out.println("60점 이상 : " + num2 +"명");
			System.out.println("70점 이상 : " + num3 +"명");
			System.out.println("80점 이상 : " + num4 +"명");
			System.out.println("90점 이상 : " + num5 +"명");
			System.out.println("--------------------------");
			num = num1 + num2 + num3 + num4 + num5;
			System.out.println("총 " + num + "명의 평균은 " + sum / (double)num + "점");
				
			

		}

			
			
		
		
	
	}
		
		
		
}

