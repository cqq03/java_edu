package ������;

public class Ȯ�ι���3 {
	public static void main(String[] args) {
		//�ѱ����̸� char�� ����ϴ� ���� ����.
	char pw1 = 'p';
	char pw2 = 'q';
	//�񱳿����ڴ� �⺻���� �� �� ����.
	if (pw1 == pw2) {//true
		System.out.println("PASS");
	} else { //false
		System.out.println("���Է�");
		
	}
	
	double tod = 50;
	double yes = 52.2;
	double chan = yes - tod;
	if (chan > 2) {
		System.out.println("���̾�Ʈ ����!");
	} else { 
		System.out.println("���Է�!");
		
	}
	if (chan > 2 && pw1 == pw2) {
		System.out.println("������ ����!");
		
	} else {
		System.out.println("���� �ٽ� ����!");
	}
	}
}
