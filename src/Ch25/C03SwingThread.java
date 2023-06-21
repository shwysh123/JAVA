package Ch25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C01GUI extends JFrame implements ActionListener,KeyListener
{
	//
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JTextField txt1;
	JTextArea area1;
	JTextArea area2;
	Thread th1;
	Thread th2;
	C01GUI(){
		super(); //����Ŭ���� ������ ȣ��
		
		setTitle("Listner�����ϱ�");
		
		//�г� �߰�
		JPanel pan1 = new JPanel();
		
		 
		
		//������Ʈ ��ü ����
		btn1 = new JButton("����");
		btn2 = new JButton("����");
		
		btn3 = new JButton("����");
		btn4 = new JButton("����");
		txt1 = new JTextField();
		area1 = new JTextArea();
		area2 = new JTextArea();
		JScrollPane scroll1 = new JScrollPane(area1); //��ũ���� ����������
		JScrollPane scroll2 = new JScrollPane(area2);
		
		//������Ʈ ��ġ ���� 
		scroll1.setBounds(50,50,190,280);
		scroll2.setBounds(300,50,190,280);
		//area1.setBounds(50,50,190,280);  // Scroll�߰��� ����
		txt1.setBounds(50,350,190,30);
		btn1.setBounds(50,400,80,30);
		btn2.setBounds(160,400,80,30);
		btn3.setBounds(300,400,80,30);
		btn4.setBounds(410,400,80,30);
		
		//������Ʈ�� �����ʿ� ���
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		txt1.addKeyListener(this);
		
		//��Ÿ����
		area1.setEditable(false);
		
		//�гο� ������Ʈ �߰�
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		pan1.add(btn4);
		pan1.add(txt1);
		//pan1.add(area1);  // Scroll�߰��� ����
		pan1.add(scroll1);
		pan1.add(scroll2);
		
		//���̾ƿ� null
		pan1.setLayout(null);
		
		//�г��� �����ӿ� �߰�
		add(pan1);	
		setBounds(100,100,600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			//������1 ����
			C03Worker1 worker = new C03Worker1(this);
			th1 = new Thread(worker);
			th1.start();
		}
		
		if(e.getSource()==btn2) {
			 //������1 ����
			th1.interrupt();			
		}
		if(e.getSource()==btn3) {
			 //������2 ����
			C03Worker2 worker = new C03Worker2(this);
			th2 = new Thread(worker);
			th2.start();
			 
		}
		if(e.getSource()==btn4) {
			 //������2 ����
			th2.interrupt();
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println(e.getKeyChar());
		//System.out.println(e.getKeyCode());
		if(e.getKeyCode()==10) //����Ű �Է� 
		{
			String tmp = txt1.getText();
			area1.append(tmp+"\n");
			txt1.setText("");
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class C03SwingThread {

	public static void main(String[] args) {
		
		new C01GUI();

	}

}