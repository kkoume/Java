package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentTest {

	private JFrame frame;
	private JTextField txtuid;
	private JTextField txtname;
	private JTextField txthp;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum4;
	private JTextField txtNum3;
	private JTextField txtNum6;
	private JTextField txtNum5;
	private JTextField txtNum8;
	private JTextField txtNum7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest window = new ComponentTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("텍스트필드 실습");
		lblNewLabel.setBounds(12, 10, 106, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbuid = new JLabel("아이디");
		lbuid.setBounds(12, 35, 57, 15);
		frame.getContentPane().add(lbuid);
		
		txtuid = new JTextField();
		txtuid.setBounds(74, 32, 116, 21);
		frame.getContentPane().add(txtuid);
		txtuid.setColumns(10);
		
		JButton btnuid = new JButton("확인");
		btnuid.setBounds(202, 31, 70, 23);
		frame.getContentPane().add(btnuid);
		
		JLabel lbresultuid = new JLabel("결과 :");
		lbresultuid.setBounds(292, 35, 130, 15);
		frame.getContentPane().add(lbresultuid);
		
		JLabel lbname = new JLabel("이름");
		lbname.setBounds(12, 64, 57, 15);
		frame.getContentPane().add(lbname);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(74, 61, 116, 21);
		frame.getContentPane().add(txtname);
		
		JButton btnname = new JButton("확인");
		btnname.setBounds(202, 60, 70, 23);
		frame.getContentPane().add(btnname);
		
		JLabel lbresultname = new JLabel("결과 :");
		lbresultname.setBounds(292, 64, 130, 15);
		frame.getContentPane().add(lbresultname);
		
		JLabel lbhp = new JLabel("휴대폰");
		lbhp.setBounds(12, 93, 57, 15);
		frame.getContentPane().add(lbhp);
		
		txthp = new JTextField();
		txthp.setColumns(10);
		txthp.setBounds(74, 90, 116, 21);
		frame.getContentPane().add(txthp);
		
		JButton btnhp = new JButton("확인");
		btnhp.setBounds(202, 89, 70, 23);
		frame.getContentPane().add(btnhp);
		
		JLabel lbresulthp = new JLabel("결과 :");
		lbresulthp.setBounds(292, 93, 130, 15);
		frame.getContentPane().add(lbresulthp);
		
		JLabel lbhp_1 = new JLabel("덧셈");
		lbhp_1.setBounds(12, 122, 57, 15);
		frame.getContentPane().add(lbhp_1);
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		txtNum1.setBounds(74, 119, 47, 21);
		frame.getContentPane().add(txtNum1);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.setBounds(202, 118, 70, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbResultPlus = new JLabel("결과 :");
		lbResultPlus.setBounds(292, 122, 130, 15);
		frame.getContentPane().add(lbResultPlus);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(143, 119, 47, 21);
		frame.getContentPane().add(txtNum2);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setBounds(127, 122, 10, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lbResultMinus = new JLabel("결과 :");
		lbResultMinus.setBounds(292, 151, 130, 15);
		frame.getContentPane().add(lbResultMinus);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.setBounds(202, 147, 70, 23);
		frame.getContentPane().add(btnMinus);
		
		txtNum4 = new JTextField();
		txtNum4.setColumns(10);
		txtNum4.setBounds(143, 148, 47, 21);
		frame.getContentPane().add(txtNum4);
		
		JLabel lblNewLabel_1_1 = new JLabel("-");
		lblNewLabel_1_1.setBounds(127, 151, 10, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtNum3 = new JTextField();
		txtNum3.setColumns(10);
		txtNum3.setBounds(74, 148, 47, 21);
		frame.getContentPane().add(txtNum3);
		
		JLabel lbhp_1_1 = new JLabel("뺄셈");
		lbhp_1_1.setBounds(12, 151, 57, 15);
		frame.getContentPane().add(lbhp_1_1);
		
		JLabel lbResultMulti = new JLabel("결과 :");
		lbResultMulti.setBounds(292, 180, 130, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.setBounds(202, 176, 70, 23);
		frame.getContentPane().add(btnMulti);
		
		txtNum6 = new JTextField();
		txtNum6.setColumns(10);
		txtNum6.setBounds(143, 177, 47, 21);
		frame.getContentPane().add(txtNum6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("*");
		lblNewLabel_1_1_1.setBounds(127, 180, 10, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		txtNum5 = new JTextField();
		txtNum5.setColumns(10);
		txtNum5.setBounds(74, 177, 47, 21);
		frame.getContentPane().add(txtNum5);
		
		JLabel lbhp_1_1_1 = new JLabel("곱셈");
		lbhp_1_1_1.setBounds(12, 180, 57, 15);
		frame.getContentPane().add(lbhp_1_1_1);
		
		JLabel lbResultDiv = new JLabel("결과 :");
		lbResultDiv.setBounds(292, 209, 130, 15);
		frame.getContentPane().add(lbResultDiv);
		
		JButton btnDiv = new JButton("확인");
		btnDiv.setBounds(202, 205, 70, 23);
		frame.getContentPane().add(btnDiv);
		
		txtNum8 = new JTextField();
		txtNum8.setColumns(10);
		txtNum8.setBounds(143, 206, 47, 21);
		frame.getContentPane().add(txtNum8);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("/");
		lblNewLabel_1_1_1_1.setBounds(127, 209, 10, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		txtNum7 = new JTextField();
		txtNum7.setColumns(10);
		txtNum7.setBounds(74, 206, 47, 21);
		frame.getContentPane().add(txtNum7);
		
		JLabel lbhp_1_1_1_1 = new JLabel("나눗셈");
		lbhp_1_1_1_1.setBounds(12, 209, 57, 15);
		frame.getContentPane().add(lbhp_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("체크박스 실습");
		lblNewLabel_2.setBounds(12, 255, 106, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(3, 276, 66, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(71, 276, 66, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(143, 276, 66, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(213, 276, 66, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(283, 276, 66, 23);
		frame.getContentPane().add(chk5);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.setBounds(357, 276, 70, 23);
		frame.getContentPane().add(btnCheck);
		
		JLabel lbCheckResult = new JLabel("결과 :");
		lbCheckResult.setBounds(7, 305, 415, 15);
		frame.getContentPane().add(lbCheckResult);
		
		
		// 이벤트 리스너
		btnuid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 텍스트필드에 입력된 문자열 가져오기
				String uid = txtuid.getText();
				
				// 결과 라벨에 가져온 문자열 입력하기
				lbresultuid.setText("결과 : " + uid);
				
			}
		});
		
		
		btnname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtname.getText();
				
				lbresultname.setText("결과 : " + name);
				
			}
		});
		
		
		btnhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txthp.getText();
				
				lbresulthp.setText("결과 : " + hp);
				
			}
		});
		
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int result = num1 + num2;
				lbResultPlus.setText("결과 : " + result);
			}
		});
		
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num3 = Integer.parseInt(txtNum3.getText());
				int num4 = Integer.parseInt(txtNum4.getText());
				
				int result = num3 - num4;
				lbResultMinus.setText("결과 : " + result);
				
			}
		});
		
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num5 = Integer.parseInt(txtNum5.getText());
				int num6 = Integer.parseInt(txtNum6.getText());
				
				int result = num5 * num6;
				lbResultMulti.setText("결과 : " + result);
				
			}
		});
		
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num7 = Integer.parseInt(txtNum7.getText());
				int num8 = Integer.parseInt(txtNum8.getText());
				
				int result = num7 / num8;
				lbResultDiv.setText("결과 : " + result);
				
			}
		});
		
		
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbCheckResult.setText("결과 : " + cities);
				
			}
		});
		
	}
}
