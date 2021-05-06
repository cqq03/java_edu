package 배열복습;

public class 배열사용2 {

	public static void main(String[] args) {
		// 내가 알고 있는 경우
		String[] name = {"홍길동", "박길동", "정길동", "이길동"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		
		}
		System.out.println();
		for (String s : name) {
			System.out.print(s + " ");
		}
		//char 성별넣고, 출력
		char[] gen = {'남', '여', '남', '여'};
		for (char c : gen) {
			System.out.print(c + " ");
		}
			
		
		//boolean 아침먹었나넣고, 출력
		boolean[] food = {true, false, true, true};
			for (int i = 0; i < food.length; i++) {
				System.out.println(food[i] + " ");
			}
		
		//double 시력넣고 출력
		double[] eye = {0.2, 0.5, 1.2, 2.0};
		for (double d : eye) {
			System.out.print(d + " ");
		}
		
		int[] age = {10, 20, 40, 50};
		for (int i : age) {  //이 for 문에서 쓰는 i는 여기서만 ! 밖에서는 인식못함
			System.out.print(i + " ");
		}  //지역변수, 이 지역안에서 만들어지는 변수는 지역 밖에서는 인식불가
		//변수는 만들어지는 위치 지역안에서만 사용 가능!
		//변수는 언제만들어지는가? 타입 변수명;(선언)
		System.out.println();
		System.out.println("이름" + " " + "성별" + " " + "아침" + " " + "시력" + " "+ "나이");
		System.out.println("-----------------------------------------------------------");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " " + gen[i] + " " + food[i] + " " + eye[i] + " " + age[i] + " ");
		}
		
		
		int test = 100;
		System.out.println(test);
		//1. 오타! 해당 변수가 존재하는지 확인
		//2. 특정한 범위 안에서만 쓸 수 있는 지역변수가 아닌지 확인
		//3. 사용하려고 하는 라인보다 아래에서 만들어진 것은 아닌지!
		
		
	}

}
