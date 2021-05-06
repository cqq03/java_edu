package 네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP클라이언트3 {
	
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 9001);
			System.out.println(i + "번: 클라이언트가 9000포트 서버에 연결을 요청함.");
			//BufferedReader 클래스는 문자들을 줄단위로 가지고 와서 처리할 수 있는 클래스
			
			InputStream input =  socket.getInputStream();// 1byte단위로 받음, 아직 문자인지 인식이 안 된 상ㅌ
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader buffer = new BufferedReader(reader);//2byte단위로 처리
			  //2byte단위로 처리된 문자들을 줄단위로 읽어올 수 있는 클래스
			
			BufferedReader buffer2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//실제로 많이 쓰이는 코드
			//buffer: 임시 기억 장소
		}
	}

}
