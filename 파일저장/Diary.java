package 파일저장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void open() {
		JFrame f = new JFrame();
		f.setTitle("일기 쓰기");
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(90, 112, 133, 30);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(90, 163, 133, 30);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(90, 227, 133, 30);
		f.getContentPane().add(lblNewLabel_2);
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 16));
		t1.setForeground(Color.BLUE);
		t1.setBounds(235, 115, 140, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 16));
		t2.setForeground(Color.BLUE);
		t2.setBounds(235, 163, 140, 30);
		f.getContentPane().add(t2);
		t2.setColumns(10);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 16));
		t3.setForeground(Color.BLUE);
		t3.setBounds(235, 227, 171, 90);
		f.getContentPane().add(t3);
		t3.setColumns(10);

		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				try {
					
					FileWriter file = new FileWriter("c:\\data\\" + s1 + ".txt");

					
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");

					file.close();
					JOptionPane.showMessageDialog(f, "파일에 저장함");
				} catch (IOException er) {
					System.out.println("파일로 저장 중 에러 발생");
					System.out.println("에러 정보는 " + er.getMessage());

				}
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.setBounds(145, 349, 245, 43);
		f.getContentPane().add(btnNewButton);

		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(276, 233, 75, 62);
		f.getContentPane().add(textArea);
		f.setVisible(true);
	}
}
