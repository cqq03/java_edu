package �ݺ���;

import javax.swing.JOptionPane;

public class ������������ {
	
	public static void main(String[] args) {
		
		
		
		int co50 = 0;
		int co60 = 0;
		int co70 = 0;
		int co80 = 0;
		int co90 = 0;
		int num = 0;
		int sum = 0;
		while (true) {
			String data = JOptionPane.showInputDialog("������ �Է��ϼ���(���� 0): ");
			int data2 = Integer.parseInt(data);
			sum = sum + data2;
			if (data.equals("0")) {
				System.out.println("�ý����� �����մϴ�.");
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
			System.out.println("60�� �̸� : " + co50 + "��");
			System.out.println("60�� �̻� : " + co60 + "��");
			System.out.println("70�� �̻� : " + co70 + "��");
			System.out.println("80�� �̻� : " + co80 + "��");
			System.out.println("90�� �̻� : " + co90 + "��");
			System.out.println("-------------------------");
			num = co50 + co60 + co70 + co80 + co90;
			System.out.println("�� " + num + "���� ����� " + sum / (double)num + "��");
			
			
		}
		
	
	
	
	}
}
