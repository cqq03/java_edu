package 클래스만들기;

public class 거실 {

	public static void main(String[] args) {
		//int x = 100;
		//타입 변수명 = 값;
		//클래스명은 변수의 타입으로 사용할 수 있다.
		//클래스명  변수명(객체의 이름) = new 클래스명();
		TV tv1 = new TV();
		TV tv2 = new TV();//오브젝트 2개
		
		tv1.color = "빨간색";
		tv1.size = 50;
		
		tv2.color = "검정색";
		tv2.size = 42;
		
		System.out.println(tv1.color);
		System.out.println(tv1.size);
		System.out.println(tv2.color);
		System.out.println(tv2.size);
		tv1.on();
		tv1.off();
		
		tv2.on();
		tv2.ch();
		
		강아지 dog = new 강아지();
		
		강아지 dog2 = new 강아지();
		
		dog.color = "갈색";
		dog.type = "메라";
		
		dog2.color = "흰색";
		dog2.type = "진돗개";
		System.out.println();
		dog.bark();
		dog2.bark();
		dog.애교부린다();
		dog2.애교부린다();
	}

}
