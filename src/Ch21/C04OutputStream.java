package Ch21;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C04OutputStream {
	
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("c:\\iotest\\test.png");
		out.write("��".getBytes(StandardCharsets.UTF_8)); //���ڿ��� Bytes Ÿ������ ��ȭ����
		out.write('��');
		out.write('��');
		out.flush();
		out.close();
	}
}
