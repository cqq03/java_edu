package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���while {

	public static void main(String[] args) {
		//������ ���� �� ���, ������ Ư���� ���� ���
		//switch�� break ����� ����
		int iu = 0; //������ �ʱ�ȭ�� �����־�� �Ѵ�.
		int ta = 0;
		int id = 0;
		while (true) {
		
			String data = JOptionPane.showInputDialog("0)������, 1)�¿�, 2)���̵�, 3)����");
			if (data.equals("3"))  {
				System.out.println("��ǥ �ý����� �����մϴ�.");
				System.out.println("������: " + iu + "ǥ");
				System.out.println("�¿�: " + ta + "ǥ");
				System.out.println("���̵�: " + id + "ǥ");
				break;
			}	
 			switch (data) {
			
			case "0":
				System.out.println("�������� �����Ͻ�.");
				iu++; //����������, iu = iu +1; --�� 1�� ����
				break;
			case "1":
				System.out.println("�¿��� �����Ͻ�.");
				ta++;
				break;
			case "2":
				System.out.println("���̵��� �����Ͻ�.");
				id++;
				break;
				
			default:
				System.out.println("�ش� �������� �����ϴ�.");
				break;
					
 			}
		}
		
	}
}