package Ch26;

import java.net.Socket;

public class ClientChatMain {

	public static void main(String[] args) throws Exception {
		//1������ �����û
		Socket client = new Socket("ServerIP",9999);
		
		//3 �ۼ��� ������ ����
		ClientSendThread snd = new ClientSendThread(client);
		ClientRecvThread rev = new ClientRecvThread(client);
		Thread th1 = new Thread(snd);
		Thread th2 = new Thread(rev);
		//4 �ۼ��� ������ ����
		th1.start();
		th2.start();
	}
}
