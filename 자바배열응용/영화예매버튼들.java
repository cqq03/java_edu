package �ڹٹ迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ȭ���Ź�ư�� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 450);
		FlowLayout flow = new FlowLayout();//���帣���� ������� ��ġ�� ���ִ� ��ǰ �ʿ�
		f.setLayout(flow); 
		int[] seat = new int[200]; //{1,0,0,...}
		//���ʺκк��� �ݺ�
		for (int i = 0; i < 200; i++) { //200�� �ݺ���!
			JButton b = new JButton();
			b.setText(i + ""); //�¼� ���, ��Ʈ���ڸ��� ""�߰�," "x
		// +�����ڿ��� �ϳ��� str�̸� ��str
			
			
			f.add(b);  //�����ӿ� ��ư�߰���
			b.setBackground(Color.yellow);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("��ư�� ��������.!");
					b.setBackground(Color.red);//������ �ٲ��
					System.out.println("�¼���ȣ�� " + b.getText());
					int index = Integer.parseInt(b.getText());
					//�迭�� �� index�� �� 0�� ���: ���Ű� �ȵ� ��Ȳ�̶�� ����
					//�迭�� �� index�� �� 1�� ���: ������ �� ��Ȳ�̶�� ����
					seat[index] = 1; //seat[100] = 1; ���Ű� �Ǿ���.
					b.setEnabled(false); //Ŭ������� ����.
				
				
				}
			});//�� ������� ��ư ������ �����ϴ� ����
			
			

		}
		for (int i = 0; i < seat.length; i++); {
			JButton b2 = new JButton();
			b2.setText("�����ϱ�");
		// +�����ڿ��� �ϳ��� str�̸� ��str
			
			
			f.add(b2);
			b2.setBackground(Color.green);
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//seat�迭�� �ִ� �� �ϳ��� �����ͼ� �� ���� 1�� ���
					//���ŵ� �ڸ��Դϴ� ����Ʈ.
					//ī��Ʈ!
					//�����ݾ�
					int count = 0;
					for (int i = 0; i < seat.length; i++) {
						if (seat[i] == 1) {
							System.out.println(i + ">>�����ڸ��Դϴ�.");
							count++;
							System.out.println("�����ݾ��� " + count * 10000 + "��");
						}
					
					}
				
				
				
				}
			});//�� ������� ��ư ������ �����ϴ� ����
			
			//�纹��

		}		
		
		
		
		f.setVisible(true);
		
		
		
	}

}
