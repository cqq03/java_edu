
package 조건문;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 나의그래픽3 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame  f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setAlignmentX(Component.LEFT_ALIGNMENT);
		t1.setBounds(178, 112, 292, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(178, 194, 293, 50);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			//자바에서는 더하기 연산
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1.입력한 t1, t2값을 가지고 와야 한다.
				String s1 = t1.getText();
				String s2 = t2.getText();
				//2. 내가 지정한 id/pw와 동일한지 확인
				//3. 결과를 출력
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
				}	else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514:");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(79, 113, 99, 42);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(79, 195, 99, 42);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC778");
		btnNewButton_1.setBounds(188, 326, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
