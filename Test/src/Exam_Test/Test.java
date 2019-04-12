package Exam_Test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Test {
	static int MAX_TRY_CNT=5;
	static int tryCnt=0;
	static String id="ai";
	static String pw="1234";
	public static void main(String[] args) {
		JFrame frm = new JFrame("로그인 창");
		frm.setBounds(800, 300, 300, 100);
		frm.setLayout(new GridLayout(1, 0));

		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout(0,1));
		JLabel idLabel = new JLabel("ID : ",SwingConstants.RIGHT);
		JLabel pwLabel = new JLabel("Password : ",SwingConstants.RIGHT);
		labelPanel.add(idLabel);
		labelPanel.add(pwLabel);
		
		JPanel fieldPanel = new JPanel();
		fieldPanel.setLayout(new GridLayout(0,1));
		JTextField idField = new JTextField(10);
		JPasswordField pwField = new JPasswordField(10);
		pwField.setEchoChar('*');
		fieldPanel.add(idField);
		fieldPanel.add(pwField);
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tryCnt==MAX_TRY_CNT) {
					System.out.println(MAX_TRY_CNT+"회 시도 실패로 로그인 불가합니다.");
					frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					System.exit(0);
				}
				boolean idChk=id.equals(idField.getText());
				boolean pwChk=pw.equals(new String(pwField.getPassword()));
				if(idChk&&pwChk) {
					System.out.println("로그인 성공");
					frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					System.exit(0);
				}else if(!idChk) {
					System.out.println("존재하지 않는 아이디입니다.");
				}else if(idChk&&!pwChk) {
					++tryCnt;
					System.out.println(tryCnt+"회 로그인 실패!");
				}
			}
		};
		
		JButton btn = new JButton();
		btn.setText("login");
		btn.addActionListener(al);
		pwField.addActionListener(al);
		
		frm.add(labelPanel);
		frm.add(fieldPanel);
		frm.add(btn);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

