package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ�����������2 {

	public static void main(String[] args) {
		int count = 1;  //int target = 55 �� �����Ҽ��� ����
		while (true) {
			
		
			
			String answer = JOptionPane.showInputDialog("���� �Է¶�: ");
			int ans2 = Integer.parseInt(answer);
			if (ans2 == 55) {  //data2 == target���� �������� 
				System.out.println("�����Դϴ�.");
				break;
				
			} else if (ans2 > 55) {
				count++;
				System.out.println("���亸�� ū ���Դϴ�.");
			} else {
				count++;
				System.out.println("���亸�� ���� ���Դϴ�.");
			}
		}
		System.out.println(count + "������ ���߼̽��ϴ�.");
	}
	//ū������ ����/ ����x�� ��� if�� �����Դϴ�. else�� ������ �ƴմϴ��ϰ� �� �ؿ� if, else�߰� �ϴ½��� �������� �䱸�� ��
}
