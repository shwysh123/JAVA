package Ch24;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class C01Client {

	public static void main(String[] args) throws Exception {
		
		//��ȭ�ɱ�
//		Socket client = new Socket("ServerIP", "ServerPort");
		Socket client = new Socket("192.168.2.10", 5000);
		System.out.println("[INFO] Server�� ����Ϸ�..");
		
		InputStream in =client.getInputStream();
		DataInputStream din = new DataInputStream(in);
		
		String message = din.readUTF();
		System.out.println("[INFO] "+message);
		
	
		din.close();
		client.close();
		
		System.out.println("[INFO] ����Ǿ����ϴ�.");	
	}

}
