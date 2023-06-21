package Ch28;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientRecvThread implements Runnable{

	Socket client;
	DataInputStream Din;
	ClientUI gui;
	ClientRecvThread(Socket client,ClientUI ui){
		this.client=client;
		gui =ui;
	}
	
	@Override
	public void run() {
		
		try {
			Din = new DataInputStream(client.getInputStream());
			String recv;
			while(true)
			{
				recv=Din.readUTF(); //������ ���� �޽����� ����
				if(recv==null || recv.equals("q")) {
					gui.area.append("���α׷��� �����մϴ�");
					System.exit(-1);
				}
				gui.area.append(recv+"\n");
				gui.area.setCaretPosition(gui.area.getDocument().getLength()); //��ũ�� �ϴ����� ������
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}