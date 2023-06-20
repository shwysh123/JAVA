package Ch24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws Exception {
		
		//��ȭ�ɱ�
//		Socket client = new Socket("ServerIP", "ServerPort");
		Socket client = new Socket("192.168.2.10", 5000);
		System.out.println("[INFO] Server�� ����Ϸ�..");
		
		DataInputStream din = new DataInputStream(client.getInputStream());
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String recv=null;
		String send=null;
		while(true) 
		{   //�۽ź�
			System.out.println("[Client(q:����)] ");
			send=sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q"))
				break;
			//���ź�
			recv=din.readUTF();
			if(recv.equals("q")||recv==null)
				break;
			System.out.println("[Server] "+recv);
		}
		
	}

}
