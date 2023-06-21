package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWriteMain {

	public static void main(String[] args) {
		new GUI2();
	}

}

class GUI2 extends JFrame implements ActionListener, KeyListener {
	JButton btn1;

	JTable tbl1;
	JTable tbl2;
	JTextArea area1;
	JScrollPane scroll1;
	JScrollPane scroll2;

	GUI2() {
		// Frame
		super("���� �� ��");
		setBounds(100, 100, 900, 900);
		setResizable(false);



		// Panel
		JPanel panel = new JPanel(); // �гλ���
		panel.setLayout(null);


		// Component
		btn1 = new JButton("������");

		tbl1 = new JTable();
		tbl2 = new JTable();
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		scroll1 = new JScrollPane(area1);
		scroll2 = new JScrollPane(area1);
		
//		JTextField srch = new JTextField();

		// Positioning
		tbl1.setBounds(10, 130, 860, 200);		//�α��
		tbl2.setBounds(10, 340, 860, 450);		//���α�
		
		btn1.setBounds(700, 800, 90, 30);		//������

		
		scroll1.setBounds(10, 130, 860, 200);	//�α�� ��ũ��
		scroll2.setBounds(10, 340, 860, 450);	//���α� ��ũ��
		
//		srch.setBounds(15,800,140,30);			//�˻�

		// Eventó��
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������?");
                dispose(); // ���� GUI â �ݱ�
                
//                new GUI(); // GUI1���� ���ư���
			}
		});		//���ۼ�

		tbl1.addKeyListener(this);
		area1.setEditable(false);
		
		btn1.setFont(new Font("����",Font.BOLD,12));

		
// 		Add_Panel_Component
		panel.add(btn1);

		
		panel.add(tbl1);
		panel.add(tbl2);
//		panel.add(area1);
		panel.add(scroll1);
		panel.add(scroll2);
		
//		panel.add(srch);

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