package ���ǹ�;

import javax.swing.JOptionPane;

public class ���ǹ�switch2 {

	public static void main(String[] args) {
		//������ ���� �� ���, ������ Ư���� ���� ���
		//switch�� break ����� ����
		
		String choice = JOptionPane.showInputDialog("0: ������, 1: �¿�, 2: ���̵�, 3: ���̵��Ⱦ�! "); //�������� ��� 0���� ����
		
		switch (choice) {
		
		case "0":
			System.out.println("�������� �����Ͻ�.");
			break;
		case "1":
			System.out.println("�¿��� �����Ͻ�.");
			break;
		case "2":
			System.out.println("���̵��� �����Ͻ�.");
			break;
			
		default:
			System.out.println("���̵��� �Ⱦ���.");
			break;
		}	
	}
	
}
