package 게시판;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class 게시판서버 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2024);
		System.out.println("서비스 시작");
		DataOutputStream out;
		
		Socket socket;
		while(true) {
			socket = ss.accept();
			out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("This is Socket Test! 안녕하세요");
			socket.close();
		}

	}

}
