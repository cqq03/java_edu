package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ����������� {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		//��������  while���� 
		while (true) {
		
			String data = JOptionPane.showInputDialog("������ �Է��ϼ���. (���� 0)");
			
			int data2 = Integer.parseInt(data);
			sum = sum +data2;
			if (data.equals("0")) {
				System.out.println("�ý����� �����մϴ�.");
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
			System.out.println("60�� �̸� : " + num1 +"��");
			System.out.println("60�� �̻� : " + num2 +"��");
			System.out.println("70�� �̻� : " + num3 +"��");
			System.out.println("80�� �̻� : " + num4 +"��");
			System.out.println("90�� �̻� : " + num5 +"��");
			System.out.println("--------------------------");
			num = num1 + num2 + num3 + num4 + num5;
			System.out.println("�� " + num + "���� ����� " + sum / (double)num + "��");
				
			

		}

			
			
		
		
	
	}
		
		
		
}

