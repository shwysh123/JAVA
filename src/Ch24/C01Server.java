package Ch24;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {

public static void main(String[] args) throws Exception {
		//192.168.2.9
		ServerSocket server = new ServerSocket(5000);
		
		System.out.println("[INFO] Server Socket Listening..");

		while(true) {
		Socket client = server.accept();
		client.getOutputStream();
		System.out.println("[INFO] "+client.getInetAddress()+" ���ӵǾ����ϴ�.");
		
		OutputStream out = client.getOutputStream();
		DataOutputStream dout = new DataOutputStream(out);
		dout.writeUTF(client.getInetAddress()+" �� ���� Ȯ�εǾ����ϴ�. by Server");
		dout.flush();
		dout.close();
		}
		
}

}


