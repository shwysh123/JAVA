package Ch26;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatMain {

	public static void main(String[] args) throws Exception {
		//1 ���� ���� ����
		ServerSocket server =  new ServerSocket(9999);
		System.out.println(" ���񽺽���!");
		//2 Ŭ���̾�Ʈ ���� �ޱ�
		Socket client = server.accept();
		System.out.println(client.getInetAddress()+"���ӿϷ�!");
		//3 �ۼ��� ������ ����
		ServerSendThread snd = new ServerSendThread(client);
		ServerRecvThread rev = new ServerRecvThread(client);
		Thread th1 = new Thread(snd);
		Thread th2 = new Thread(rev);
		//4 �ۼ��� ������ ����
		th1.start();
		th2.start();
	}
}
