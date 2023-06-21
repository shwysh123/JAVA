package Ch28;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientUI extends JFrame implements KeyListener{
	
	JTextArea area;
	JTextField txt;
	ServerSocket server;
	Socket client;
	String nick;
	JButton btn1;
	
	ClientUI(String nick){
		super("Chat Client");
		
		//�г�
		JPanel pan = new JPanel();
		pan.setLayout(null);
		
		//������Ʈ
		area = new JTextArea();
		txt = new JTextField();
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBounds(10,10,260,300);
		txt.setBounds(10,320,260,30);
		
		btn1 = new JButton("��ȭ���� ����");
		
		//�̺�Ʈ ������ ���
		txt.addKeyListener(this);
			
		//�гο� �߰�
		pan.add(txt);
		pan.add(scroll);
		//�����ӿ� �߰�
		add(pan);
		
		this.setBounds(100,100,600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//���Ͽ����۾�
		try {
			
			//ChatServerIP�� �Է� 
			client = new Socket("192.168.2.254",5555);
			
			//3 ���� ������ ��ü ��	��
			ClientRecvThread recv = new ClientRecvThread(client,this);	//client : ���ϼ��ſ�
																		//this(GUI��ü) : ������ ���ڿ��� Area�� append
			Thread th1 = new Thread(recv);	 
			//4 ������ ����
			th1.start();
			
			//5 �г��� ������ ����
			this.nick = nick;
			new DataOutputStream(client.getOutputStream()).writeUTF(nick);
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("�г��� �Է� : ");
			String nick = sc.nextLine();
			new ClientUI(nick);	
			
			
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txt) {
			if(e.getKeyCode()==10)
			{			
				//�Է��� ������ Ŭ���̾�Ʈ�� ���޵Ǿ���Ѵ�
				try {
					DataOutputStream Dout=new DataOutputStream(client.getOutputStream());
					Dout.writeUTF("["+nick+"] : "+txt.getText());
					Dout.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				//Send�����忡 �Է��� ������ ����
				area.append("["+nick+"] : "+txt.getText()+"\n");
				txt.setText("");

			}
		}	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}