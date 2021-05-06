package 조건문;

import java.util.Date;

public class 조건문복습문제1 {

	public static void main(String[] args) {
		
		Date date = new Date(); //보통 알아보기 쉽게 변수 소문자로 표현
		int hours = date.getHours();
		System.out.println(hours);
		if (hours < 11) {
			System.out.println("굿모닝");
		} else if (hours < 16) {
			System.out.println("굿애프터눈");
		} else if (hours < 22) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		int month = date.getMonth() + 1;
		System.out.println(month);
		switch (month) {
		case 2:
			System.out.println("28일 까지 있음");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있음");
		default:
			System.out.println("31일까지 있음");
			break;
		}
	
	
	}		
}
