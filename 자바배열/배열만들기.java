package �ڹٹ迭;

public class �迭����� {

	public static void main(String[] args) {
		//�迭: �þ���ٶ�� �ǹ�, array
		
		int[] num = new int[1000];
		
		int[] num2 = new int[5];
		num2[1] = 300;
		System.out.println(num2);
		System.out.println(num2.length);
		//��ü���� �迭����+2'�ּ�, ����
		//num2 : �����͵��� ����ִ� �ּ�
		//x[y] �ڵ����� �ʱ�ȭ�� ��, 0
		
		// �迭�� �����͸� �ְų�, �����ų�, ��ġ���� �˰� �Ͱų� ��� 
		for (int i = 0; i < num2.length; i++) {
			//�ݺ���Ȱ��
			System.out.println(i + ": " + num2[i]);
		}
		//�˾Ƽ� �ε��� 0���� �����ؼ� ������ 1�� �����ϸ鼭 �ϳ��� �������� for-each
		//�迭���� ������� ��������, �ٲ����� ����Ʈ
		for (int x : num2) {
			System.out.println(x);
		}
		System.out.println(num);
	}

}
