package �ݺ���;

import javax.swing.JOptionPane;

public class ���������� {
	public static void main(String[] args) {
		
		String food = JOptionPane.showInputDialog("�԰� ���� ������? ");
		
		String spot = JOptionPane.showInputDialog("��� �԰� �;�? ");
		
		
		
		String result = "����� �԰� ���� ������ " + food + "�̰�, �԰� ���� ��Ҵ� " + spot + "�̴�."; 
	
		
		JOptionPane.showMessageDialog(null, result);
	}
}
