package Exam_Test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ch21.PWHandler;

public class Test_1 {
	public static void main(String[] args) {
		
		String loginId = "ad";
		String loginPw = "1234";
		
		JFrame frm = new JFrame("로그인");		//frm 프레임 생성	
		frm.setBounds(800, 800, 400, 200);		//프레임  
		frm.setLayout(new GridLayout(3, 4));
		
		
		

		JLabel idLabel = new JLabel("ID : ", SwingConstants.LEFT);
		JTextField idText = new JTextField(5);
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.LEFT);
		JPasswordField pwText = new JPasswordField(5);
		pwText.setEchoChar('*');
		pwText.addActionListener(new PWHandler(idText, pwText));
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);
		frm.add(idText, BorderLayout.EAST);
		frm.add(pwText, BorderLayout.EAST);
		JTextArea result = new JTextArea(10,10);
		frm.add(result);
		
		
		JButton log = new JButton("login");
		frm.add(log);
		frm.add(log, BorderLayout.CENTER);
		
		MouseListener m1 = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				result.setText(idText.getText());
				System.out.println(result.getText());
				
			}		
		};
		
		log.addMouseListener(m1);
		System.out.println();
		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
