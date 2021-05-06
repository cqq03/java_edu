package 자바배열;

public class 배열만들기문제1 {

	public static void main(String[] args) {
		int[] ty = new int[5];		
//		ty[0] = 10;
//		ty[1] = 20; //컨트롤알트 아래로 쉽게 복사가능
//		ty[2] = 30;
//		ty[3] = 40;
//		ty[4] = 50;
		for (int i = 0; i < ty.length; i++) {//1번째부터, 갯수만큼, 갯수 하나 점프
			ty[i] = (i + 1) * 10;
		}
		System.out.println(ty[0] + ty[2]);
		
		String[] list = new String[3];
		list[0] = "자바";
		list[1] = "스프링";
		list[2] = "JSP";
		System.out.println(list[0] + "보다는 " + list[1]);
	}

}
   //int num = new int[3] , int 만 넣겠다는 얘기/ 같은 타입만 넣을 수 있다/ 고정된 크기를 가진다.(크기 변경 불가능)