package Ch22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JTextField txt1;

	JTextField txt2;
	JTextArea area1;
	JScrollPane scroll1;

	// DB INSERT FRAME_WINDOW
	JFrame Frm_Insert;
	JFrame Frm_Update;
	JFrame Frm_Delete;
	JFrame Frm_Select;

	String id = "root";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3306/tmpdb";

	// JDBC��������
	Connection conn = null; // DB����� ��������
	PreparedStatement pstmt = null; // SQL���� ���ۿ� ��������
	ResultSet rs = null; // SQL���� ���(SELECT���) ���ſ� ��������

	GUI() {
		// Frame
		super("������â�Դϴ�");
		setBounds(100, 100, 550, 400);

		// Panel
		JPanel panel = new JPanel(); // �гλ���
		panel.setLayout(null);

		// Component
		btn1 = new JButton("IO_�����ϱ�");
		btn2 = new JButton("IO_�ҷ�����");
		btn3 = new JButton("DB_INSERT");
		btn4 = new JButton("DB_UPDATE");
		btn5 = new JButton("DB_DELETE");
		btn6 = new JButton("DB_SELECT");
		txt1 = new JTextField();
		txt2 = new JTextField();
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		scroll1 = new JScrollPane(area1);

		// Positioning
		txt1.setBounds(10, 270, 350, 30);
		btn1.setBounds(370, 10, 120, 30);
		btn2.setBounds(370, 50, 120, 30);
		btn3.setBounds(370, 90, 120, 30); // DB_INSERT
		btn4.setBounds(370, 130, 120, 30); // DB_UPDATE
		btn5.setBounds(370, 170, 120, 30); // DB_UPDATE
		btn6.setBounds(370, 210, 120, 30); // DB_UPDATE
		scroll1.setBounds(10, 10, 350, 250);

		// Eventó��
		btn1.addActionListener(this);
		btn2.addActionListener(this);

		btn3.addActionListener(this); // DB
		btn4.addActionListener(this); // DB
		btn5.addActionListener(this); // DB
		btn6.addActionListener(this); // DB
		txt1.addKeyListener(this);
		area1.setEditable(false);

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(txt1);
		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);

		// Frame
		add(panel); // �����ӿ� panel�߰�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // ����̺� ����
			System.out.println("Driver Loading Success..");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// System.out.println("�̺�Ʈ �߻�");
		if (e.getSource() == btn1) {
			System.out.println("�����ϱ� Ŭ��");

			String context = area1.getText();
			String dirPath = "c:\\iotest\\";
			String filename = UUID.randomUUID().toString();

			try {
				Writer out = new FileWriter(dirPath + filename + ".txt");
				out.write(new Date().toString() + "\n");
				out.write(context);
				out.flush();
				out.close();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (e.getSource() == btn2) {
			System.out.println("�ҷ����� Ŭ��");
			JFileChooser fileChooser = new JFileChooser();

			File defaultdirpath = new File("c:\\iotest\\"); // �⺻��� File��ü
			fileChooser.setCurrentDirectory(defaultdirpath);// �⺻��� ����

			int returnValue = fileChooser.showOpenDialog(null);
			String filename = null;
			if (returnValue == JFileChooser.APPROVE_OPTION) // ���ϼ����Ѱ��
			{
				filename = fileChooser.getSelectedFile().toString();
			}
			System.out.println(filename);

			try {
				Reader in = new FileReader(filename);
				area1.setText("");
				StringBuffer buffer = new StringBuffer();
				while (true) {
					int data = in.read();
					if (data == -1)
						break;
					buffer.append((char) data);
				}
				in.close();
				area1.append(buffer.toString());

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getSource() == btn3) {
			// DB_INSERT
			System.out.println("DB_INSERT");
			if (Frm_Insert == null) {

				// ������â����
				Frm_Insert = new JFrame("DB_INSERT");
				Frm_Insert.setBounds(650, 100, 300, 400);

				// Panel�߰�
				JPanel panel = new JPanel();

				// textarea �߰�
				JTextArea area = new JTextArea();
				JScrollPane Scroll = new JScrollPane(area);
				Scroll.setBounds(10, 10, 200, 200);
				// btn�߰�
				JButton btn = new JButton("INSERT");

				btn.setBounds(10, 220, 100, 30);
				// btn_EVENT
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("INSERT_BTN");

						// pstmt��ü sql���� ����
						try {
							pstmt = conn.prepareStatement("insert into tbl_memo values(null,?,now())");
							pstmt.setString(1, area.getText());
							int result = pstmt.executeUpdate();
							if (result > 0) {
								// ������â�ݱ�
								JOptionPane.showMessageDialog(null, "INSERT����", "DBCONN",
										JOptionPane.INFORMATION_MESSAGE);
								Frm_Insert.setVisible(false);

							} else {
								JOptionPane.showMessageDialog(null, "INSERT����", "DBCONN", JOptionPane.ERROR_MESSAGE);
								Frm_Insert.setVisible(false);
								// ����â�� ����
							}
							// pstmt.executeUpdate() DB����
							// �ڿ�����
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} finally {
							try {
								pstmt.close();
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}

					}

				});

				panel.add(Scroll);
				panel.add(btn);
				panel.setLayout(null);

				// Frame�� panel�߰�
				Frm_Insert.getContentPane().add(panel);

				// X ��ư ������ setVisible(false)�� ������
				Frm_Insert.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Frm_Insert.setVisible(true);

				Frm_Insert.getContentPane().setLayout(null);
			} else {
				Frm_Insert.setVisible(true);
			}

			// JTextArea�� ������ �޸� �����ͼ� tbl_memo �����Ѵ�

		} else if (e.getSource() == btn4) {
			// DB_UPDATE
			System.out.println("DB_UPDATE");

			if (Frm_Update == null) {

				Frm_Update = new JFrame("DB_UPDATE");
				Frm_Update.setBounds(650, 100, 300, 400);
				
				//-----------------------------------------------------------------
				
				JPanel panel = new JPanel();
				
				JTextField txt = new JTextField("No");
				JTextArea area = new JTextArea();
				JScrollPane scroll = new JScrollPane(area);
				JButton btn = new JButton("UPADTE");
				
				txt.setBounds(10,10,80,30);
				scroll.setBounds(10,50,250,200);
				btn.setBounds(10,270,100,30);
				
				panel.add(txt);
				panel.add(scroll);
				panel.add(btn);
				
				panel.setLayout(null);
				
				Frm_Update.getContentPane().add(panel);		
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("UPDATE_BTN");

						// pstmt��ü sql���� ����
						try {
							pstmt = conn.prepareStatement("update tbl_memo set contents=?,regdate=now() where no=?");
							pstmt.setString(1, area.getText());
							pstmt.setInt(2, Integer.parseInt(txt.getText()));
							int result = pstmt.executeUpdate();
							if (result > 0) {
								// ������â�ݱ�
								JOptionPane.showMessageDialog(null, "UPDATE����", "DBCONN",
										JOptionPane.INFORMATION_MESSAGE);
								Frm_Update.setVisible(false);

							} else {
								JOptionPane.showMessageDialog(null, "UPDATE����", "DBCONN", JOptionPane.ERROR_MESSAGE);
								Frm_Update.setVisible(false);
								// ����â�� ����
							}
							// pstmt.executeUpdate() DB����
							// �ڿ�����
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} finally {
							try {
								pstmt.close();
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}

					}

				});
								
				//-----------------------------------------------------------------
				
				// X ��ư ������ setVisible(false)�� ������
				Frm_Update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Frm_Update.setVisible(true);
			} else {
				Frm_Update.setVisible(true);
			}

			// �޸� ��ȸ�Ͽ� �����´� / Select(memo_id) �� ���
			// ��ȸ�� �޸� �����Ͽ� update �Ѵ�

		} else if (e.getSource() == btn5) {
			// DB_DELETE
			System.out.println("DB_DELETE");

			if (Frm_Delete == null) {

				Frm_Delete = new JFrame("DB_DELETE");
				Frm_Delete.setBounds(650, 100, 300, 400);
				// X ��ư ������ setVisible(false)�� ������
				Frm_Delete.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Frm_Delete.setVisible(true);
			} else {
				Frm_Delete.setVisible(true);
			}

		} else if (e.getSource() == btn6) {
			// DB_SELECT
			System.out.println("DB_SELECT");

//			if (Frm_Select == null) {

				Frm_Select = new JFrame("DB_SELECT");
				Frm_Select.setBounds(650, 100, 400, 400);

				String[] column = { "No", "Contents", "RegDate" };
				Object[][] data = { { "1", "�������� �����", "2023-06-20" }, { "2", "ȥ�ڰ��� �����ϴϱ�", "2023-05-29" },
						{ "3", "���̰���", "2023-06-19" } };// �гλ���
				JPanel panel = new JPanel();

				// Component ����
				JTable table = new JTable();
				JScrollPane scroll = new JScrollPane(table);
				scroll.setBounds(10, 10, 360, 350);

				// Table���������

				DefaultTableModel model = new DefaultTableModel(data, column);
				try {
					pstmt = conn.prepareStatement("select * from tbl_memo");
					rs = pstmt.executeQuery();
					if (rs != null) {
						while (rs.next()) {
							Object[] rowData = { rs.getInt("no"), rs.getString("contents"), rs.getString("regdate") };
							model.addRow(rowData);
							System.out.print(rs.getInt("no") + " ");
							System.out.print(rs.getString("contents") + " ");
							System.out.print(rs.getString("regdate") + "\n");
						}
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				} finally {
					try {
						rs.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					try {
						pstmt.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}

				JTable table1 = new JTable(model);
				JScrollPane scroll1 = new JScrollPane(table1);
				scroll1.setBounds(10, 10, 360, 340);

//				table1.getColumnModel().getColumn(0).setPreferredWidth(1);
//				table1.getColumnModel().getColumn(1).setPreferredWidth(150);
//				table1.getColumnModel().getColumn(2).setPreferredWidth(20);
				// Component�� panel�� �߰�&Layout
				panel.add(scroll1);
				panel.setLayout(null);
				// Frame�� Panel�߰�
				Frm_Select.getContentPane().add(panel);
				// X ��ư ������ setVisible(false)�� ������
				Frm_Select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Frm_Select.setVisible(true);
			} else {
				Frm_Select.setVisible(true);
			}

		}

//??????	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Ű�� ��������/������(UNICODE ����)
//		System.out.println("keyTyped() : "+e.getKeyChar());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Ű�� ��������
//		System.out.println("keyPressed() : "+e.getKeyChar());
//		System.out.println("keyPressed() : "+e.getKeyCode());
		if (e.getSource() == txt1) {
			if (e.getKeyCode() == 10) {
				System.out.println("txt1's Enter");
				String str = txt1.getText();
				area1.append(str + "\n");
				txt1.setText("");
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Ű�� ������(UNICODE ������)
//		System.out.println("keyReleased() : " + e.getKeyChar());
//		System.out.println("keyReleased() : " + e.getKeyCode());

	}

}

public class C06SwingUI_IO_DB {

	public static void main(String[] args) {
		new GUI();
	}
}