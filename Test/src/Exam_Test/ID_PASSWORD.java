package Exam_Test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ID_PASSWORD {
	static String id = "ai";
	static String pw = "1234";

	static int maxCount = 5;
	static int tryCount = 1;

	public static void main(String[] args) {
		JFrame frm = new JFrame("�α��� â");
		frm.setBounds(800, 500, 300, 150);
		frm.setLayout(new GridLayout(1,0 ));
		

		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout(0, 1));
		JLabel idLabel = new JLabel("ID : ", SwingConstants.RIGHT);
		JLabel pwLabel = new JLabel("Password :", SwingConstants.RIGHT);

		labelPanel.add(idLabel);
		labelPanel.add(pwLabel);

		JPanel fieldPanel = new JPanel();
		fieldPanel.setLayout(new GridLayout(0, 1));
		JTextField idField = new JTextField();
		idField.setLayout(new GridLayout(0, 1));
		JTextField pwField = new JTextField();
		pwField.setLayout(new GridLayout(0, 1));
		fieldPanel.add(idField);
		fieldPanel.add(pwField);

		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tryCount == maxCount) {
					System.out.println(maxCount + "ȸ �õ� ���з� �α����� �Ұ��մϴ�.");
					frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				boolean idChk = id.equals(idField.getText());
				boolean pwChk = pw.equals(pwField.getText());

				if (idChk && pwChk) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
					frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} else if (!idChk) {
					System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
					tryCount++;
				} else if (!pwChk) {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					tryCount++;
				}

			};

		};
		JButton btn = new JButton("login");
		btn.addActionListener(al);
		pwField.addActionListener(al);
		idField.addActionListener(al);
		
		
		frm.add(labelPanel);
		frm.add(fieldPanel);
		frm.add(btn);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}