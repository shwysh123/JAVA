package Ch28;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ServerUI extends JFrame implements ActionListener{
	
	JTextArea area;
	JTextField txt;
	
	ServerBackground background;
	 
	TextField total;
	JButton btn;
	ServerUI(){
		super("Chat Server");
		
		//�г�
		JPanel pan = new JPanel();
		pan.setLayout(null);
		
		//������Ʈ
		area = new JTextArea();
		txt = new JTextField();
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBounds(10,10,550,550);
		//txt.setBounds(10,320,260,30);
		total = new TextField();
		total.setBounds(690,10,80,30);
		
		btn= new JButton("�ο�Ȯ��");
		btn.setBounds(580,10,100,30);
		
		
		//�̺�Ʈ �߰�
		btn.addActionListener(this);
	
		//�гο� �߰�
		pan.add(txt);
		pan.add(scroll);
		pan.add(btn);
		pan.add(total);
		//�����ӿ� �߰�
		add(pan);
		
		
		this.setBounds(100,100,800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		background = new ServerBackground(this);
		
	
	}
	
	



	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư Ŭ��!");
		if(e.getSource()==btn)		
		{
			//�ο��� ���
			
			int total = background.ClientList.size();
			System.out.println("���Ӽ� : " + total);
			String t = String.valueOf(total);
			this.total.setText(t+" ��");
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new ServerUI().background.Setting();

		
	}
	
	
}