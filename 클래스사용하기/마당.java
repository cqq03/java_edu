package 클래스사용하기;

import 클래스만들기.강아지;

public class 마당 {
	public static void main(String[] args) {

		//선언한것에 대한 정보가 없으니 추가로 메모리공간을 확보+1
		//dog, dog2에는 주소가 들어가 있음
		강아지 dog = new 강아지();
		//dog, color, type이 만들어짐.
		//dog안에 color, type을 가르키고 있는 주소가 저장됨.
		강아지 dog2 = new 강아지();
		//dog2, color, type이 만들어짐.
		
		dog.color = "갈색";
		
		dog.type = "메라";
	
	}
}
