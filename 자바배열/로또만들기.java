package �ڹٹ迭;

import java.util.Random;

//import �ڹٹ迭����.�ٸ���Ű��Ŭ����;

public class �ζǸ���� {

	public static void main(String[] args) {
		int[] lotto = new int[100];
		Random r = new Random(42);//(����seed��);
		
		//�迭����� name = new �迭�����();
		//�ٸ���Ű��Ŭ���� name2 = new �ڹٹ迭����.�ٸ���Ű��Ŭ����();
		// �ٸ���Ű��Ŭ������ �׳� ��ã�� �װ��� �˷��ִ� ���� ~.~. �ڵ��ϼ����� import ���
		//���� ���� �ڵ� import : ��Ʈ�� ����Ʈ o 
		//���콺 ���ٴ��, �ڵ��ϼ�, ���߿� �����ȳ��� ���� ����Ű
		for (int i = 0; i < lotto.length; i++) { //6��

			lotto[i] = r.nextInt(45) + 1;  //�õ� ���� �ǹ̴�?<<<<<<<<<<<<
			
		}
		for (int x : lotto) {
			
		
			System.out.print(x + " ");
		}
		System.out.println();
		int count = 0;        //�� �̻��� �����Ͱ� ����� ã��
		for (int x : lotto) {   //���⼭ �� for each?<<<<<<<<<<<
			if (x >= 40) {
				count++;
			}
		}
		System.out.println(count);
	}

}
