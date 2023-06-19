package Ch21;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C04OutputStream {
	
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("c:\\iotest\\test.png");
		out.write("가".getBytes(StandardCharsets.UTF_8)); //문자열을 Bytes 타입으로 변화전달
		out.write('나');
		out.write('다');
		out.flush();
		out.close();
	}
}
