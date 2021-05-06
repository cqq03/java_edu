package 제어문.순차문;

import javax.swing.JOptionPane;

public class 순차문정리문제 {
	
	public static void main(String[] args){
		
		String hobby = JOptionPane.showInputDialog("취미를 입력하세요. ");
		String spot = JOptionPane.showInputDialog("여행 목적지를 입력하세요. ");
		String result = "당신은 " + spot + "로 " + hobby + "를 즐기러 간다.";
		JOptionPane.showMessageDialog(null, result);
	
	}

}
