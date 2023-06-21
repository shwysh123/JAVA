package Ch26;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerSendThread implements Runnable{
	
	Scanner sc = new Scanner(System.in);
	DataOutputStream dout;
	
	Socket client;
	
	ServerSendThread(Socket client){
		this.client = client;
	}
	
	public void run() {
		
		try {
		String send;
		dout = new DataOutputStream(client.getOutputStream());
		
		while (true) {
			System.out.println("[Server(q:Á¾·á)] ");
			send=sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q"))
				System.exit(-1);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
