package ���ǹ�;

import java.util.Date;

public class ���ǹ���������1 {

	public static void main(String[] args) {
		
		Date date = new Date(); //���� �˾ƺ��� ���� ���� �ҹ��ڷ� ǥ��
		int hours = date.getHours();
		System.out.println(hours);
		if (hours < 11) {
			System.out.println("�¸��");
		} else if (hours < 16) {
			System.out.println("�¾����ʹ�");
		} else if (hours < 22) {
			System.out.println("���̺��");
		} else {
			System.out.println("�³���");
		}
		int month = date.getMonth() + 1;
		System.out.println(month);
		switch (month) {
		case 2:
			System.out.println("28�� ���� ����");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30�ϱ��� ����");
		default:
			System.out.println("31�ϱ��� ����");
			break;
		}
	
	
	}		
}
