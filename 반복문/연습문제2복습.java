package �ݺ���;

import javax.swing.JOptionPane;

public class ��������2���� {

	public static void main(String[] args) {
		int target = 55;
		int count = 0;
		while (true) {
			
			String ans = JOptionPane.showInputDialog("������?: ");
			int ans2 = Integer.parseInt(ans);
			
			if (ans2 == target) {
				System.out.println("O");
				System.out.println("������ ���߼̽��ϴ�.");
				count++;
				System.out.println("�õ� Ƚ����: " + count + "��");
			break;	
		
			} else {
				System.out.println("X");
				System.out.println("������ ������ ���ϼ̽��ϴ�.");
				if (ans2 > 55) {
					System.out.println("���亸�� Ŀ��.");
					count++;
					
				} else {
					System.out.println("���亸�� �۾ƿ�.");
					count++;
					
				}
			} 
			
		
		
		}
		
	}

}
