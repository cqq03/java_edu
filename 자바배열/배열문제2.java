package �ڹٹ迭;

import java.util.Random;

public class �迭����2 {

	public static void main(String[] args) {
		int num[] = new int[1000];
		Random r = new Random();
  //
		for (int i = 0; i < num.length; i++) { //for each�� ����Ҷ���!, for each�����δ� �Է��� �ȵ�.
			                                   //for each , for �� �Ӱ����ʿ�
			num[i] = r.nextInt(1000);  //i ����Ʈ�� 0~999�� �Է� 
			System.out.print(num[i] + " ");
		}

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;

		for (int x : num) {
			if (x >= 600) {
				count4++;
			} else if (x >= 500) {
				count3++;
			} else if (x >= 400) {
				count2++;
			} else if (x >= 300) {
				count1++;
			}
		}
		System.out.println();
		System.out.println("300�̻��� ����: " + count1 + "��");
		System.out.println("400�̻��� ����: " + count2 + "��");
		System.out.println("500�̻��� ����: " + count3 + "��");
		System.out.println("600�̻��� ����: " + count4 + "��");
	}

}
