package 형변환;

public class 참조형형변환 {

	public static void main(String[] args) {
		사람 p = new 사람();
		슈퍼맨 s = new 슈퍼맨();
		맨 m = new 맨();
		우먼 w = new 우먼();
		
		
		//참조형은 상속관계에 있을 때만 된다.
		//부모자식간의 관계만 형변환이 가능해서 대입할 수 있다.
		p = s;//큰 <--작은 (자동 형변환)
		p = w;//큰<--작은(자동 형변환,. up casting)
		// m = w; 형제관의 관계는 형변환하여 대입할 수 없다.
		m = s;//자동 형변환
		m = (맨)p; //작 <--큰, 강제형변환

	}

}
