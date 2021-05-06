package 자바배열;

public class 배열만들기 {

	public static void main(String[] args) {
		//배열: 늘어놓다라는 의미, array
		
		int[] num = new int[1000];
		
		int[] num2 = new int[5];
		num2[1] = 300;
		System.out.println(num2);
		System.out.println(num2.length);
		//전체변수 배열갯수+2'주소, 길이
		//num2 : 데이터들이 들어있는 주소
		//x[y] 자동으로 초기화된 값, 0
		
		// 배열에 데이터를 넣거나, 꺼내거나, 위치값을 알고 싶거나 등등 
		for (int i = 0; i < num2.length; i++) {
			//반복문활용
			System.out.println(i + ": " + num2[i]);
		}
		//알아서 인덱스 0부터 시작해서 끝까지 1씩 증가하면서 하나씩 꺼내오렴 for-each
		//배열에서 순서대로 꺼낼때만, 다꺼내서 프린트
		for (int x : num2) {
			System.out.println(x);
		}
		System.out.println(num);
	}

}
