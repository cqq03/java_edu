package 조건문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽5 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	
	public static void main(String[] args) {
		JFrame  f = new JFrame();
		f.setSize(700, 700);
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("\uBA39\uACE0 \uC2F6\uC740 \uC74C\uC2DD");
		l1.setFont(new Font("굴림", Font.PLAIN, 30));
		l1.setBounds(56, 30, 209, 95);
		f.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBackground(Color.YELLOW);
		t1.setBounds(310, 40, 274, 71);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		

		JButton b1 = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = t1.getText();
				if (s1.equals("짬뽕") ) {
					JOptionPane.showMessageDialog(f, "중국집으로 가세요.");
				} else if (s1.equals("우동")) {
					JOptionPane.showMessageDialog(f, "일식집으로 가세요.");
					
				} else if (s1.equals("라면")) {
					JOptionPane.showMessageDialog(f, "분식집으로 가세요.");
					
				} else {
					JOptionPane.showMessageDialog(f, "집으로 가세요.");
				}
			
				}
			
				
				
				
			
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 30));
		b1.setBounds(56, 135, 528, 51);
		f.getContentPane().add(b1);
		

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setBackground(Color.PINK);
		t2.setColumns(10);
		t2.setBounds(310, 208, 274, 71);
		f.getContentPane().add(t2);	
		JButton b2 = new JButton("\uB098\uC758 \uB0B4\uB144\uB098\uC774\uB294?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int n2 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, n2 + 1 + "살");
			}
		});
		
		
		b2.setFont(new Font("굴림", Font.PLAIN, 30));
		b2.setBounds(56, 289, 528, 38);
		f.getContentPane().add(b2);
			
		JLabel l2 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		l2.setBounds(56, 196, 244, 95);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		l3.setFont(new Font("굴림", Font.PLAIN, 25));
		l3.setBounds(68, 354, 176, 63);
		f.getContentPane().add(l3);
		
			
		
		
		
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 25));
		t3.setColumns(10);
		t3.setBounds(310, 354, 274, 49);
		f.getContentPane().add(t3);
		
		JLabel l4 = new JLabel("\uC218\uD559\uC810\uC218");
		l4.setFont(new Font("굴림", Font.PLAIN, 25));
		l4.setBounds(68, 418, 176, 63);
		f.getContentPane().add(l4);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 25));
		t4.setColumns(10);
		t4.setBounds(310, 439, 274, 49);
		f.getContentPane().add(t4);
		
		
		JButton b3 = new JButton("\uB450\uACFC\uBAA9 \uC810\uC218\uC758 \uD3C9\uADE0\uC740?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a1 = t3.getText();
			String a2 = t4.getText();
			int n1 = Integer.parseInt(a1);
			int n2 = Integer.parseInt(a2);
			double n3 = n1 + n2;
			JOptionPane.showMessageDialog(f, n3 / 2 + "점");
			}
		});
		   
		b3.setFont(new Font("굴림", Font.PLAIN, 30));
		b3.setBounds(56, 498, 528, 40);
		f.getContentPane().add(b3);
		
		
		
		
		f.setVisible(true);
	}
}
