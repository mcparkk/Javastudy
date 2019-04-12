package ch21;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Exam21_2fail {
	public static void main(String[] args) {
		
		JFrame frm = new JFrame("모양만 계산기");
		frm.setBounds(100, 100, 220, 300); // 윈도우 크기 지정
		frm.setLayout(new BorderLayout()); // 정렬방식
		

		JLabel label = new JLabel();
		label.setText("TEST");
		/* 오른쪽 정렬 */
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		frm.add(label, BorderLayout.NORTH);

		/* JPanel1 추가 */
		JPanel p1 =new JPanel();
		p1.setLayout(new GridLayout(3, 3));
		MouseListener m1 = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				JButton btn = (JButton)arg0.getComponent();
				String btn = (JButton)arg0.getComponent();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		} {
		
		
		for (int i = 9; i >= 1; i--) {
			p1.add(new JButton(i +""));
		}
		frm.add(p1, BorderLayout.CENTER);
		
		
		/* JPanel2 추가 */
		JPanel p2 =new JPanel();
		p2.setLayout(new GridLayout(1, 4));
		p2.add(new JButton("+"));
		p2.add(new JButton("-"));
		p2.add(new JButton("x"));
		p2.add(new JButton("/"));
		frm.add(p1, BorderLayout.SOUTH);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}