package Ch24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws Exception {
		
		//전화걸기
//		Socket client = new Socket("ServerIP", "ServerPort");
		Socket client = new Socket("192.168.2.10", 5000);
		System.out.println("[INFO] Server와 연결완료..");
		
		DataInputStream din = new DataInputStream(client.getInputStream());
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String recv=null;
		String send=null;
		while(true) 
		{   //송신부
			System.out.println("[Client(q:종료)] ");
			send=sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q"))
				break;
			//수신부
			recv=din.readUTF();
			if(recv.equals("q")||recv==null)
				break;
			System.out.println("[Server] "+recv);
		}
		
	}

}
