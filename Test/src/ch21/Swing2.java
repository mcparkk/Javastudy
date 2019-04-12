package ch21;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
public static void main(String[] args) {
	JFrame j = new JFrame();
	//요소 배치 설정
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
			JButton b = (JButton)e.getSource();// 버튼
			String text = b.getText();
			System.out.println(text);				// 계산기 등에서 각자 가지고 있는 값을 표출하기위해 
													// 눌러진 버튼의 값을 뽑아오기위해 -효율성 
		}
	};
	
	JButton b1 = new JButton("버튼1");
	b1.addMouseListener(m1);
	
	JButton b2 = new JButton();
	b2.setText("버튼2");
	b2.addMouseListener(m1);
	
	j.add(b1);	j.add(b2);		//버튼추가
	
	//크기지정(w , h)
	j.setSize(200, 100);
	
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//보이기
	j.setVisible(true);
	
}
}
