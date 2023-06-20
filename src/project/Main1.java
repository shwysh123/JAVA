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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main1 {

	public static void main(String[] args) {
		new GUI();
	}

}

class GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	
	JTextField txt1;
	JTextField txt2;
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
		btn3 = new JButton("�� ���� �Խ���");
		btn4 = new JButton("����");
		btn5 = new JButton("�˻�");
		txt1 = new JTextField();
		txt2 = new JTextField();
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		scroll1 = new JScrollPane(area1);
		scroll2 = new JScrollPane(area1);
		
		JTextField srch = new JTextField();

		// Positioning
		txt1.setBounds(10, 130, 860, 200);		//�α��
		txt2.setBounds(10, 340, 860, 450);		//���α�
		
		btn1.setBounds(680, 80, 90, 30);		//���ۼ�
		btn2.setBounds(780, 80, 90, 30);		//���� �� ��
		btn3.setBounds(10, 10, 860, 60);		//����
		btn4.setBounds(770, 800, 90, 30); 		// ������
		btn5.setBounds(160, 800, 60, 30); 		// �˻�
		
		scroll1.setBounds(10, 130, 860, 200);	//�α�� ��ũ��
		scroll2.setBounds(10, 340, 860, 450);	//���α� ��ũ��
		
		srch.setBounds(15,800,140,30);			//�˻�

		// Eventó��
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUI1();	
			}
		});		//���ۼ�
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUI2();
			}
		});
//		btn2.addActionListener(this);		//���� �� ��
		btn3.addActionListener(this);		//����
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 	//����
				JOptionPane.showMessageDialog(null, "���α׷� �����Ͻ�?");
				System.exit(0);
			}
		});		
		txt1.addKeyListener(this);
		area1.setEditable(false);
		
		btn1.setFont(new Font("����",Font.BOLD,12));
		btn2.setFont(new Font("����",Font.BOLD,12));		
		btn3.setFont(new Font("����",Font.BOLD,25));
		btn4.setFont(new Font("����",Font.BOLD,12));
		btn5.setFont(new Font("����",Font.BOLD,12));
		
		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		panel.add(txt1);
		panel.add(txt2);
//			panel.add(area1);
		panel.add(scroll1);
		panel.add(scroll2);
		
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