package Ch27;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientRecvThread implements Runnable{

	Socket client;
	DataInputStream Din;
	Cgui gui;
	
	public ClientRecvThread(Socket client,Cgui gui){
		this.client=client;
		this.gui = gui;
	}
	@Override
	public void run(){
		try {
			Din = new DataInputStream(client.getInputStream());
			String recv;
			while(true)
			{
				recv=Din.readUTF(); //Ŭ���̾�Ʈ�� ���� �޽����� ����
				if(recv==null || recv.equals("q")) {
					gui.area.append("������ ������ �����մϴ�\n");
					System.exit(-1);
				}
				gui.area.append("[Server] : " + recv+"\n");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
