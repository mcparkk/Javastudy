package ch21;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam21_1 {
	public static void main(String[] args) {
		String[] datas = { "A", "B", "C", "D", "E", "F", "G" };
		JFrame frm = new JFrame();
		frm.setBounds(120, 120, 300, 200);
		/* JFrame�� Layout�� GridLayout ���� ���� */
		frm.setLayout(new GridLayout(3, 3));
		
		
		/* �迭�� �̿��Ͽ� JButton ���� ǥ�� */
		for(String s: datas) {
			frm.add(new JButton(s));
		}
		
		
		
//		frm.add(new JButton("A"));
//		frm.add(new JButton("B"));
//		frm.add(new JButton("C"));
//		frm.add(new JButton("D"));
//		frm.add(new JButton("E"));
//		frm.add(new JButton("F"));
//		frm.add(new JButton("G"));
//		
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}