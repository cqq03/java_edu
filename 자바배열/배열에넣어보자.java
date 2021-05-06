package 자바배열;

public class 배열에넣어보자 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t"); //ln빼면 엔터안쳐줌
		}
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 100;
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
	}
	
	

}
