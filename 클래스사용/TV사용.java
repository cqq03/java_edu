package 클래스사용;

import 클래스만들기.TV;

public class TV사용 {

	public static 	void main(String[] args) {
				//마우스 올려서 import 선택(f2)
				//자동완성
				//컨트롤+쉬프트+o
			TV myTv = new TV();
			//yourTv.om(); //생성되지 않은 변수를 사용해서 에러!
			myTv.changeCh();
			myTv.ch = 7;
			myTv.vol = 10;            //이걸 한줄에 끝내는 것이 생성자
			myTv.onOff = true;   //부모클래스 object
			System.out.println(myTv);
			TV yourTv = new TV();
			myTv.toString();
			yourTv.ch = 8;
			yourTv.vol = 12;
			yourTv.onOff = true;
			System.out.println(yourTv);
	}

}
