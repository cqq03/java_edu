package 반복문;

import javax.swing.JOptionPane;

public class 순차문복습 {
	public static void main(String[] args) {
		
		String food = JOptionPane.showInputDialog("먹고 싶은 음식은? ");
		
		String spot = JOptionPane.showInputDialog("어디서 먹고 싶어? ");
		
		
		
		String result = "당신이 먹고 싶은 음식은 " + food + "이고, 먹고 싶은 장소는 " + spot + "이다."; 
	
		
		JOptionPane.showMessageDialog(null, result);
	}
}
