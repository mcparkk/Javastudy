package ch21;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
public static void main(String[] args) {
	JFrame j = new JFrame();
	//��� ��ġ ����
	j.setLayout(new FlowLayout());
	
	MouseListener m1 = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e){}
		
		@Override
		public void mousePressed(MouseEvent e){}
		
		@Override
		public void mouseExited(MouseEvent e){}
		
		@Override
		public void mouseEntered(MouseEvent e){}
		
		@Override
		public void mouseClicked(MouseEvent e)
		{
			JButton b = (JButton)e.getSource();// ��ư
			String text = b.getText();
			System.out.println(text);				// ���� ��� ���� ������ �ִ� ���� ǥ���ϱ����� 
													// ������ ��ư�� ���� �̾ƿ������� -ȿ���� 
		}
	};
	
	JButton b1 = new JButton("��ư1");
	b1.addMouseListener(m1);
	
	JButton b2 = new JButton();
	b2.setText("��ư2");
	b2.addMouseListener(m1);
	
	j.add(b1);	j.add(b2);		//��ư�߰�
	
	//ũ������(w , h)
	j.setSize(200, 100);
	
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//���̱�
	j.setVisible(true);
	
}
}
