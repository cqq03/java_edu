package ���ǹ�;

import java.util.Date;



public class ���ǹ�if {

	public static void main(String[] args) {
		// newŰ���带 �̿��ؼ� DateƲ�� ���� ��ǰ�� ��.
		//if~else if�� break ����� ����.
		Date date = new Date(); //��¥�� �ð��� ���� ������ �˷��ִ� class
		date.getHours(); //12. // ��Ŭ������ ���ο� �� ����
	    int hour = date.getHours();
		System.out.println("���� �ð��� " + hour + "��");
		if (hour <= 11) {
			System.out.println("�¸��");
		}else if (hour <= 16) {
			System.out.println("�¾����ʹ�");			
		}else if (hour <= 22) {
			System.out.println("���̺��");

		}else {
			System.out.println("�³���");
		}
	
	}
}
