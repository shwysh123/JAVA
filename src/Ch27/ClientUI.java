package Ch27;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Cgui extends JFrame implements ActionListener,KeyListener
{
	
	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;
	//���� �ڵ� �߰�
	Socket client;
	
	Cgui() throws Exception {
		super("Chat Client");	//������â ����		
		JPanel pannel = new JPanel(); //�г� ����		
		pannel.setLayout(null);	//Layout ���� x	

		area = new JTextArea();	//�ؽ�Ʈ����â
		area.setEditable(false);
		//area.setBounds(10,10,260,240);	//��ũ�� �߰��� ����	
		scroll = new JScrollPane(area); //area�� ��ũ�� �߰��ϱ�
		scroll.setBounds(10,10,260,240);		

		txt1 = new JTextField();			//�ؽ�Ʈ�Է�â 
		txt1.setBounds(10,260,260,30);		//ũ��
		txt1.addKeyListener(this);			//�̺�Ʈ �߰�(Ű����)
	 

		pannel.add(txt1);
		//pannel.add(area);		//��ũ�� �߰��� ����
		pannel.add(scroll);
		
		add(pannel);			//�����ӿ� �г� �߰�
		
		setBounds(100,100,300,350);	//������â ��ġ
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����ư ��밡�ɻ���
		setVisible(true);	//������â �����ֱ�
		
		//���� �ڵ� �߰�
		//1 ������ ���� ��û
		client = new Socket("ServerIP",7777);
		//2 ���� ������ ��ü ����
		ClientRecvThread recv = new ClientRecvThread(client,this);
		Thread th1 = new Thread(recv);	 
		//3 ���� ������ ����
		th1.start();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
	}

	//Ű�� ������(UNICODE����)
	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("KEYTPYED�Լ� : " + e.getKeyChar());
		
	}
	//Ű�� ��������
	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("KEYPRESSED�Լ� : "+e.getKeyChar());
		//System.out.println("KEYPRESSED�Լ� : "+e.getKeyCode());
		if(e.getKeyCode()==10) //����Ű �Է�
		{
			//Send�۾�
			try {
				DataOutputStream Dout=new DataOutputStream(client.getOutputStream());
				Dout.writeUTF(txt1.getText());
				Dout.flush();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			//1 �ʵ��� ���� ->Area
			area.append("[Client] : "+txt1.getText()+"\n");
			//2 �ʵ��� ���� ����
			txt1.setText("");
			
		}
	}
	//Ű�� ������(UNICODE ������)
	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("KEYRELEASED�Լ� : "+e.getKeyChar());
		
	}

	 
}

public class ClientUI {

	public static void main(String[] args) throws Exception{
		new Cgui();
	}

}