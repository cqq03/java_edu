package 자바배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매버튼들 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 450);
		FlowLayout flow = new FlowLayout();//물흐르듯이 순서대로 배치를 해주는 부품 필요
		f.setLayout(flow); 
		int[] seat = new int[200]; //{1,0,0,...}
		//이쪽부분부터 반복
		for (int i = 0; i < 200; i++) { //200번 반복해!
			JButton b = new JButton();
			b.setText(i + ""); //좌석 대신, 스트링자리니 ""추가," "x
		// +연산자에서 하나라도 str이면 다str
			
			
			f.add(b);  //프레임에 버튼추가해
			b.setBackground(Color.yellow);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("버튼을 눌렀군요.!");
					b.setBackground(Color.red);//누르면 바꿔라
					System.out.println("좌석번호는 " + b.getText());
					int index = Integer.parseInt(b.getText());
					//배열의 각 index의 값 0인 경우: 예매가 안된 상황이라고 가정
					//배열의 각 index의 값 1인 경우: 예마가 된 상황이라고 가정
					seat[index] = 1; //seat[100] = 1; 예매가 되었다.
					b.setEnabled(false); //클릭기능을 막음.
				
				
				}
			});//이 기능으로 버튼 누르면 반응하는 셋팅
			
			

		}
		for (int i = 0; i < seat.length; i++); {
			JButton b2 = new JButton();
			b2.setText("결제하기");
		// +연산자에서 하나라도 str이면 다str
			
			
			f.add(b2);
			b2.setBackground(Color.green);
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//seat배열에 있는 값 하나씩 가져와서 각 값이 1인 경우
					//예매된 자리입니다 프린트.
					//카운트!
					//결제금액
					int count = 0;
					for (int i = 0; i < seat.length; i++) {
						if (seat[i] == 1) {
							System.out.println(i + ">>예매자리입니다.");
							count++;
							System.out.println("결제금액은 " + count * 10000 + "원");
						}
					
					}
				
				
				
				}
			});//이 기능으로 버튼 누르면 반응하는 셋팅
			
			//재복습

		}		
		
		
		
		f.setVisible(true);
		
		
		
	}

}
