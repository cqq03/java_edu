package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ��������2���� {

   public static void main(String[] args) {
      Random r = new Random();
      int target = r.nextInt(100);
      //int target = 55;
      int count = 0;
      
      while (true) {
         String data = JOptionPane.showInputDialog("�����Է�");
         int data2 = Integer.parseInt(data);
         count++;
         if (data2 == target) {
            System.out.println("���ϵ帳�ϴ�.");
            System.out.println("�����Դϴ�.");
            System.out.println("�� �õ�Ƚ���� " + count + "ȸ");
            break;
         }else {
            System.out.println("������ �ƴմϴ�.");
            if (data2 > target) {
               System.out.println("���亸�� ũ��.");
            } else {
               System.out.println("���亸�� �۴�.");
            }
         }
      }

   }

}