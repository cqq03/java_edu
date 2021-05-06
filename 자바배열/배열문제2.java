package 자바배열;

import java.util.Random;

public class 배열문제2 {

	public static void main(String[] args) {
		int num[] = new int[1000];
		Random r = new Random();
  //
		for (int i = 0; i < num.length; i++) { //for each는 출력할때만!, for each만으로는 입력이 안됨.
			                                   //for each , for 닷 ㅣ공부필요
			num[i] = r.nextInt(1000);  //i 리스트에 0~999를 입력 
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
		System.out.println("300이상의 개수: " + count1 + "개");
		System.out.println("400이상의 개수: " + count2 + "개");
		System.out.println("500이상의 개수: " + count3 + "개");
		System.out.println("600이상의 개수: " + count4 + "개");
	}

}
