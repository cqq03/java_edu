package �迭����;

public class �迭���2 {

	public static void main(String[] args) {
		// ���� �˰� �ִ� ���
		String[] name = {"ȫ�浿", "�ڱ浿", "���浿", "�̱浿"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		
		}
		System.out.println();
		for (String s : name) {
			System.out.print(s + " ");
		}
		//char �����ְ�, ���
		char[] gen = {'��', '��', '��', '��'};
		for (char c : gen) {
			System.out.print(c + " ");
		}
			
		
		//boolean ��ħ�Ծ����ְ�, ���
		boolean[] food = {true, false, true, true};
			for (int i = 0; i < food.length; i++) {
				System.out.println(food[i] + " ");
			}
		
		//double �÷³ְ� ���
		double[] eye = {0.2, 0.5, 1.2, 2.0};
		for (double d : eye) {
			System.out.print(d + " ");
		}
		
		int[] age = {10, 20, 40, 50};
		for (int i : age) {  //�� for ������ ���� i�� ���⼭�� ! �ۿ����� �νĸ���
			System.out.print(i + " ");
		}  //��������, �� �����ȿ��� ��������� ������ ���� �ۿ����� �νĺҰ�
		//������ ��������� ��ġ �����ȿ����� ��� ����!
		//������ ������������°�? Ÿ�� ������;(����)
		System.out.println();
		System.out.println("�̸�" + " " + "����" + " " + "��ħ" + " " + "�÷�" + " "+ "����");
		System.out.println("-----------------------------------------------------------");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " " + gen[i] + " " + food[i] + " " + eye[i] + " " + age[i] + " ");
		}
		
		
		int test = 100;
		System.out.println(test);
		//1. ��Ÿ! �ش� ������ �����ϴ��� Ȯ��
		//2. Ư���� ���� �ȿ����� �� �� �ִ� ���������� �ƴ��� Ȯ��
		//3. ����Ϸ��� �ϴ� ���κ��� �Ʒ����� ������� ���� �ƴ���!
		
		
	}

}
