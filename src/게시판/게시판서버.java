package �Խ���;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class �Խ��Ǽ��� {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2024);
		System.out.println("���� ����");
		DataOutputStream out;
		
		Socket socket;
		while(true) {
			socket = ss.accept();
			out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("This is Socket Test! �ȳ��ϼ���");
			socket.close();
		}

	}

}
