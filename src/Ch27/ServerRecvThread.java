package Ch27;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerRecvThread implements Runnable{

	Socket client;
	DataInputStream Din;
	Sgui gui;
	
	public ServerRecvThread(Socket client,Sgui gui){
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
					gui.area.append("Ŭ���Ʈ�� ������ �����մϴ�\n");
					System.exit(-1);
				}
				gui.area.append("[Client] : " + recv+"\n");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}