package Ch26;

import java.io.DataInputStream;
import java.net.Socket;

import Ch28.ServerBackground;
import Ch28.ServerUI;

public class ServerRecvThread implements Runnable {

	Socket client;
	DataInputStream din;

	ServerRecvThread(Socket client) {
		this.client = client;
	}

	public ServerRecvThread(Socket client2, ServerBackground serverBackground, ServerUI gui) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		
		try {
		din = new DataInputStream(client.getInputStream());
		String recv = null;
		while (true) {

			recv = din.readUTF();
			if (recv.equals("q") || recv == null)
				System.exit(-1); //Á¾·á
			System.out.println("[Client] " + recv);
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}
