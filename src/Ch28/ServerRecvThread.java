package Ch28;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ServerRecvThread  implements Runnable{

	Socket client;
	DataInputStream Din;
	DataOutputStream Dout;
	ServerBackground background;
	ServerUI gui;
	String nick;
	public ServerRecvThread(Socket client,ServerBackground background,ServerUI gui){
		this.client=client;
		this.background = background;
		this.gui = gui;
		
		try {
			Din = new DataInputStream(client.getInputStream());
			Dout = new DataOutputStream(client.getOutputStream());
			String nick = Din.readUTF();
			this.nick = nick;
			System.out.println("�г��� : " + nick + "���� ����");
			this.background.addClient(nick,Dout);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			String recv;
			while(true)
			{
				recv=Din.readUTF(); //Ŭ���̾�Ʈ�� ���� �޽����� ����
				if(recv!=null) {
					background.broadCast(nick,recv);
					gui.area.append(recv+"\n");
					gui.area.setCaretPosition(gui.area.getDocument().getLength()); //��ũ�� �ϴ����� ������
				}	
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			background.removeClient(nick);
		}
		
	}

}