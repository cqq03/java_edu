package ������;

public class �⺻������Ȯ�ι��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int physi = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		int sum = physi + math + eng + kor;
		//�ڹٴ� �ϳ��� double�̸� ������ �׻� ����
		//double sum2 = sum;
		//�ڹٴ� int�� int����� ����� �׻� int
		//double avg = sum2 / 4;
		double avg = (double)sum / 4;
		               // ������ Ÿ���� ���� ���ϴ� Ÿ������ �������ִ� ���� ĳ����!
		        //ram���� ���� Ÿ���� �״�� �ְ�, cpu�� �����ٰ� ������ �ٲ�: ����ĳ����!
		           //����ĳ���� (�����ϰ����ϴ� Ÿ�Ը�)���� ex) (double)sum
		System.out.println("������: " + sum + "��, " +  "�����: " + avg + "��" );
	} 

}
