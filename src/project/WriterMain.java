package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WriterMain {

	public static void main(String[] args) {
		new GUI1();

	}

}

class GUI1 extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JTextField txt1;
	JTextField txt2;
	JTextField txt3;
	JTextArea area1;
	JScrollPane scroll1;
//	�������� ����� ����
	String id = "root";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3306/�Խ���";

//	JDBC��������
	Connection conn = null; // DB����� ��������
	PreparedStatement pstmt = null; // SQL���� ���ۿ� ��������
	ResultSet rs = null; // SQL���� ���(SELECT���)���ſ� ��������

	GUI1() {
		// Frame
		super("�۾���");
		setBounds(100, 100, 1000, 900);
		setResizable(false);


		// Panel
		JPanel panel = new JPanel(); // �гλ���
		panel.setLayout(null);

		// Component
		btn1 = new JButton("����");
		btn2 = new JButton("����");
		btn3 = new JButton("������");
		txt1 = new JTextField("�г��� : ");
		txt2 = new JTextField("���� : ");
		txt3 = new JTextField("���� : ");
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		scroll1 = new JScrollPane(area1);

		// Positioning
		txt1.setBounds(15, 15, 300, 40); // ��
//		txt1.setBounds(730, 70, 235, 40); // ��
		txt2.setBounds(15, 70, 700, 40);
		txt3.setBounds(15, 125, 945, 570);

		btn1.setBounds(770, 10, 90, 30); // ����
		btn2.setBounds(870, 10, 90, 30); // ����
		btn3.setBounds(870, 700, 90, 30); // ������

		scroll1.setBounds(15, 125, 945, 570);

		// Eventó��
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		txt1.addKeyListener(this);
		txt2.addKeyListener(this);
		txt3.addKeyListener(this);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����Ͻ�?");
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // ����̹� ����
					System.out.println("Driver Loading Success..");
					conn = DriverManager.getConnection(url, id, pw);
					System.out.println("DB Connected..");
					pstmt = conn.prepareStatement("insert into tbl_�Խ��� values(null,?,?,?,now())");
					pstmt.setString(1, txt1.getText());
					pstmt.setString(2, txt2.getText());
					pstmt.setString(3, txt3.getText());
					int result = pstmt.executeUpdate();
					if(result>0) {
						System.out.println("INSERT����");
					}
					else {
						System.out.println("INSERT����");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				} finally {
					try {
						pstmt.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				dispose();

			}
		});
		

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // btn2 Ŭ�� �� ����
				JOptionPane.showMessageDialog(null, "�����Ͻ�?");
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // ����̹� ����
					System.out.println("Driver Loading Success..");
					conn = DriverManager.getConnection(url, id, pw);
					System.out.println("DB Connected..");
					pstmt = conn.prepareStatement("update tbl_�Խ��� set �۾���=?, ������ = ?,�ۼ���¥=now() where �۳���=?");
					pstmt.setString(1, txt1.getText());
					pstmt.setString(2, txt2.getText());
					pstmt.setString(3, txt3.getText());
					int result = pstmt.executeUpdate();
				
					if(result>0) {
						JOptionPane.showMessageDialog(null, "UPDATE����", "DBCONN",
								JOptionPane.INFORMATION_MESSAGE);
						setVisible(false); // ������â�ݱ�

					}
					else {
						JOptionPane.showMessageDialog(null, "INSERT����", "DBCONN", JOptionPane.ERROR_MESSAGE);
						setVisible(false); // ������â�ݱ�
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				} finally {
					try {
						pstmt.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				dispose();

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // btn3 Ŭ�� �� ���ư���
				JOptionPane.showMessageDialog(null, "������?");
				dispose(); // ���� GUI â �ݱ�

//                new GUI(); // GUI1���� ���ư���

			}
		});

		btn1.setFont(new Font("����", Font.BOLD, 12));
		btn2.setFont(new Font("����", Font.BOLD, 12));
		btn3.setFont(new Font("����", Font.BOLD, 12));

// 		Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(txt1);
		panel.add(txt2);
		panel.add(txt3);
//				panel.add(area1);
		panel.add(scroll1);

		// Frame
		add(panel); // �����ӿ� panel�߰�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}