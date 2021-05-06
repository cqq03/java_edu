package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
   private static JTextField t1;
   private static JTextField t2;

   public static void main(String[] args) {
	   //stastic변수: 객체생성하지 않아도 언제든 클래스
	   JFrame f = new JFrame();
      f.getContentPane().setBackground(Color.GREEN);
      f.setSize(350, 500);
      f.getContentPane().setLayout(null);
      
      JLabel top = new JLabel("");
      top.setBounds(40, 31, 254, 148);
      f.getContentPane().add(top);
      
      ImageIcon icon = new ImageIcon("top.png");
      top.setIcon(icon);
      
      JLabel lblNewLabel_1 = new JLabel("아이디");
      lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
      lblNewLabel_1.setBounds(40, 207, 104, 45);
      f.getContentPane().add(lblNewLabel_1);
      
      JLabel lblNewLabel_1_1 = new JLabel("패스워드");
      lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
      lblNewLabel_1_1.setBounds(40, 277, 104, 45);
      f.getContentPane().add(lblNewLabel_1_1);
      
      t1 = new JTextField();
      t1.setForeground(Color.BLUE);
      t1.setBackground(Color.YELLOW);
      t1.setFont(new Font("굴림", Font.BOLD, 20));//바로 넣어줌, bold 스태틱변수 
      t1.setBounds(156, 216, 150, 31);//x,y,가로,세로-
      f.getContentPane().add(t1);
      t1.setColumns(10);
      
      t2 = new JTextField();
      t2.setForeground(Color.BLUE);
      t2.setFont(new Font("굴림", Font.BOLD, 20));
      t2.setColumns(10);
      t2.setBackground(Color.YELLOW);
      t2.setBounds(156, 277, 150, 31);
      f.getContentPane().add(t2);
      
      JButton login = new JButton("");
      login.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		//로그인 처리
      		String s1 = t1.getText(); //아이디입력
      		String s2 = t2.getText(); //패스워드입력
      		//root, 1234 동일하면 "로그인 성공:, 동일하지 않으면 "로그인 실패"
      		//
      		if (s1.equals("root") && s2.equals("1234")) {
      			JOptionPane.showMessageDialog(f, "로그인 성공");
				Diary diary = new Diary();
				diary.open();
			} else {
				JOptionPane.showMessageDialog(f, "로그인 실패");
			}
      		
      	}
      });
      login.setBounds(26, 358, 118, 81);
      f.getContentPane().add(login);
      ImageIcon icon2 = new ImageIcon("login.png");
      login.setIcon(icon2);
      JButton reset = new JButton("");
      reset.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		//버튼을 클릭했을 때 처리내용
      		//t1, t2입력한 내용 지워라
      		t1.setText("");
      		t2.setText("");
      	}
      });
      reset.setBounds(176, 358, 118, 81);
      f.getContentPane().add(reset);
      f.setVisible(true);
      ImageIcon icon3 = new ImageIcon("reset.png");
      reset.setIcon(icon3);
   }
}
