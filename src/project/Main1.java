package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main1 {

	public static void main(String[] args) {
		new GUI();
	}

}

class GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JButton btn2;
//	JButton btn3;
	JButton btn4;
	JButton btn5;

	JTable tbl1;
	JTable tbl2;
	JLabel txt3;

	JTextArea area1;
	JScrollPane scroll1;
	JScrollPane scroll2;

	GUI() {
		// Frame
		super("�� ���� �Խ���");
		setBounds(100, 100, 900, 900);

		// Panel
		JPanel panel = new JPanel(); // �гλ���

		panel.setLayout(null);

		// Component
		btn1 = new JButton("�� �ۼ�");
		btn2 = new JButton("���� ����");
		btn4 = new JButton("����");
		btn5 = new JButton("�˻�");
		tbl1 = new JTable();
		tbl2 = new JTable();
		txt3 = new JLabel("�� ���� �Խ���");
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		scroll1 = new JScrollPane(area1);
		scroll2 = new JScrollPane(area1);

		JTextField srch = new JTextField();

		// Positioning
		tbl1.setBounds(10, 130, 860, 200); // �α��
		tbl2.setBounds(10, 340, 860, 450); // ���α�
		txt3.setBounds(280, 10, 300, 60); // ����

		btn1.setBounds(680, 80, 90, 30); // ���ۼ�
		btn2.setBounds(780, 80, 90, 30); // ���� �� ��
//		btn3.setBounds(10, 10, 860, 60);		//����
		btn4.setBounds(770, 800, 90, 30); // ������
		btn5.setBounds(160, 800, 60, 30); // �˻�

		scroll1.setBounds(10, 130, 860, 200); // �α�� ��ũ��
		scroll2.setBounds(10, 340, 860, 450); // ���α� ��ũ��

		srch.setBounds(15, 800, 140, 30); // �˻�

		// Eventó��
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new GUI1();
			}
		}); // ���ۼ�

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new GUI2();
			}
		});
//		btn2.addActionListener(this);		//���� �� ��
//		btn3.addActionListener(this);		//����
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // ����
				JOptionPane.showMessageDialog(null, "���α׷� �����Ͻ�?");
				System.exit(0);
			}
		});
		
		
		
		tbl1.addKeyListener(this);
		area1.setEditable(false);

		btn1.setFont(new Font("����", Font.BOLD, 12));
		btn2.setFont(new Font("����", Font.BOLD, 12));
//		btn3.setFont(new Font("����",Font.BOLD,25));
		btn4.setFont(new Font("����", Font.BOLD, 12));
		btn5.setFont(new Font("����", Font.BOLD, 12));

		txt3.setFont(new Font("����", Font.BOLD, 30)); // ����

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
//		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);

//		panel.add(tbl1);
//		panel.add(tbl2);
		panel.add(txt3);	//�� ���� �Խ��� ����

//			panel.add(area1);
//		panel.add(scroll1);	//�Խù� ��϶� �� ����Ŭ�� �ȵǰ� �� �� ����
//		panel.add(scroll2);

		panel.add(srch);

		// Frame
		add(panel); // �����ӿ� panel�߰�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// DB�����ؼ� ����â�� ����
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/�Խ���";

		// JDBC��������
		Connection conn = null; // DB����� ��������
		PreparedStatement pstmt = null; // SQL���� ���ۿ� ��������
		ResultSet rs = null; // SQL���� ���(SELECT���) ���ſ� ��������

		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); // ����̺� ����
			System.out.println("Driver Loading Success!");
			conn = DriverManager.getConnection(url, id, pw); // �����ϸ� Connection��ü�� ��ȯ
			System.out.println("DB Connected!");

			String[] column = { "No", "�۾���", "������", "�ۼ���¥" };
			Object[][] data = {};
			
			DefaultTableModel model = new DefaultTableModel(data,column) {
				
				public boolean isCellEditable(int i, int c) {
					return false;
				} 
				
			};

			// ������
			pstmt = conn.prepareStatement("select * from tbl_�Խ���");

			rs = pstmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {
					Object[] rowData = { rs.getInt("number"), rs.getString("�۾���"), rs.getString("������"),
							rs.getString("�ۼ���¥") };
					model.addRow(rowData);
//					System.out.print(rs.getString("number") + " ");
//					System.out.print(rs.getString("�۾���") + " ");
//					System.out.print(rs.getString("������") + " ");
//					System.out.print(rs.getString("�ۼ���¥") + "\n");
				}
			}

			JTable table = new JTable(model);
			JScrollPane scroll = new JScrollPane(table);
			scroll.setBounds(10, 130, 860, 650);

			table.getColumnModel().getColumn(0).setMaxWidth(50);
			table.getColumnModel().getColumn(1).setMaxWidth(200);
			table.getColumnModel().getColumn(2).setMaxWidth(1000);
			table.getColumnModel().getColumn(3).setMaxWidth(400);

			panel.add(scroll);
			panel.setLayout(null);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {}

}