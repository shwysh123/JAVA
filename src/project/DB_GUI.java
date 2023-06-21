package project;

import java.awt.Color;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class MyWriter_GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	
	
	JLabel lbl1;
	JTable tbl1;
	JTable tbl2;
	JTable tbl3;
	JTable tbl4;
	JTable tbl5;

	JTextArea area1;
	
	JScrollPane scroll1;
//	JScrollPane scroll2;

	DefaultTableModel model;
	
	MyWriter_GUI() {
		// Frame
		super("Ŭ���� �Խù�");
		setBounds(100, 100, 900, 900);
		setResizable(false);


		// Panel
		JPanel panel = new JPanel(); // �гλ���
		panel.setLayout(null);


		// Component
		btn1 = new JButton("������");

		lbl1 = new JLabel("�Խù� ��ȸ");
		
		
		area1 = new JTextArea();
		 area1.setBounds(10,90,210,300);
//		scroll1 = new JScrollPane(area1);
//		scroll2 = new JScrollPane(area1);

		
		JTextField srch = new JTextField();

		//---------------------------------------------------------------
				String id = "root";
				String pw = "1234";
				String url = "jdbc:mysql://localhost:3306/�Խ���";
			
				//JDBC��������
				Connection conn = null; 	//DB����� ��������
				PreparedStatement pstmt = null; // SQL���� ���ۿ� ��������
				ResultSet rs = null;		// SQL���� ���(SELECT���) ���ſ� ��������
				
				try { 
					Class.forName("com.mysql.cj.jdbc.Driver");		//����̺� ����
					System.out.println("Driver Loading Success..");
					conn=DriverManager.getConnection(url,id,pw);
					System.out.println("DB Connected..");
					
					String[] column = {"number","�̸�","����","����","�ۼ���¥"};
					Object[][] data = {};
					
					model = new DefaultTableModel(data, column) {
						public boolean isCellEditable(int i , int c) {
						return false;	
						}
					};
					
					pstmt = conn.prepareStatement("select * from tbl_�Խ���");
					rs=pstmt.executeQuery();
					
					if(rs!= null) {
					while(rs.next()) {
						Object[] rowData = {rs.getInt("number"), rs.getString("�̸�"), rs.getString("����"),
								rs.getString("����"),rs.getString("�ۼ���¥")};
						model.addRow(rowData);
						}
//						System.out.print(rs.getInt("number")+" ");
//						System.out.print(rs.getString("�̸�")+" ");
//						System.out.print(rs.getString("����")+" ");
//						System.out.print(rs.getString("����")+" ");
//						System.out.print(rs.getString("�ۼ���¥")+" ");
					}
					tbl1 = new JTable(model);
					tbl2 = new JTable(model);
					tbl3 = new JTable(model);
					tbl4 = new JTable(model);
					tbl5 = new JTable(model);
					
					tbl1.getColumnModel().getColumn(0).setMaxWidth(20);
					tbl2.getColumnModel().getColumn(1).setMaxWidth(30);
					tbl3.getColumnModel().getColumn(2).setMaxWidth(100);
					tbl4.getColumnModel().getColumn(3).setMaxWidth(300);
					tbl5.getColumnModel().getColumn(4).setMaxWidth(50);
					
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();}catch(Exception e) {e.printStackTrace();}
					
					try {
					pstmt.close();} catch(Exception e){e.printStackTrace();}
					try {
						
					conn.close();}catch(Exception e) {e.printStackTrace();}
				}
				//------------------------------------------------------------------

		// Positioning
		lbl1.setBounds(10, 10, 400, 80);		//������
		tbl1.setBounds(10, 100, 100, 30);	//�Խñ۹�ȣ ĭ
		tbl2.setBounds(130, 100, 730, 30);	//�ۼ��� ĭ
		tbl3.setBounds(10, 150, 850, 30);	//���� ĭ
		tbl4.setBounds(10, 200, 850, 530);	//���� ĭ
		tbl5.setBounds(10, 750, 850, 30);	//�ð� ĭ	
		Color col = new Color(71,100,109); //RGB
		Color col1 = new Color(80,15,109); //RGB
		Color col2 = new Color(90,150,109); //RGB
		Color col3 = new Color(100,80,109); //RGB
		Color col4 = new Color(110,199,10); //RGB
		tbl1.setBackground(col);
		tbl2.setBackground(col1);
		tbl3.setBackground(col2);
		tbl4.setBackground(col3);
		tbl5.setBackground(col4);
//		scroll1.setBounds(10, 100, 860, 680);		//�ۼ� �� 
		
		btn1.setBounds(770, 800, 90, 30);		//������
		

		// Eventó��
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������?");
                dispose(); // ���� GUI â �ݱ�
                
//                new GUI(); // GUI1���� ���ư���
			}
		});		//���ۼ�

		area1.setEditable(false);

		btn1.setFont(new Font("����",Font.BOLD,17));
		lbl1.setFont(new Font("����",Font.BOLD,30));
		tbl1.setFont(new Font("����",Font.BOLD,15));
		tbl2.setFont(new Font("����",Font.BOLD,15));
		tbl3.setFont(new Font("����",Font.BOLD,17));
		tbl4.setFont(new Font("����",Font.BOLD,20));
		tbl5.setFont(new Font("����",Font.BOLD,10));
		
		// Add_Panel_Component
		panel.add(btn1);

		
		panel.add(lbl1);
		
		panel.add(tbl1);
		panel.add(tbl2);
		panel.add(tbl3);
		panel.add(tbl4);
		panel.add(tbl5);
//			panel.add(area1);
//		panel.add(scroll1);
//		panel.add(scroll2);
		
		panel.add(srch);

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

public class DB_GUI extends MyWriter_GUI {
	
	public static void main(String[] args) {
		new DB_GUI();

		


	}
}
	
