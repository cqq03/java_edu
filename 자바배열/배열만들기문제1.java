package �ڹٹ迭;

public class �迭����⹮��1 {

	public static void main(String[] args) {
		int[] ty = new int[5];		
//		ty[0] = 10;
//		ty[1] = 20; //��Ʈ�Ѿ�Ʈ �Ʒ��� ���� ���簡��
//		ty[2] = 30;
//		ty[3] = 40;
//		ty[4] = 50;
		for (int i = 0; i < ty.length; i++) {//1��°����, ������ŭ, ���� �ϳ� ����
			ty[i] = (i + 1) * 10;
		}
		System.out.println(ty[0] + ty[2]);
		
		String[] list = new String[3];
		list[0] = "�ڹ�";
		list[1] = "������";
		list[2] = "JSP";
		System.out.println(list[0] + "���ٴ� " + list[1]);
	}

}
   //int num = new int[3] , int �� �ְڴٴ� ���/ ���� Ÿ�Ը� ���� �� �ִ�/ ������ ũ�⸦ ������.(ũ�� ���� �Ұ���)