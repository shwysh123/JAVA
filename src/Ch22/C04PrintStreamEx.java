package Ch22;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class C04PrintStreamEx {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream out = new FileOutputStream("c:\\iotest\\test.txt");
		PrintStream pout = new PrintStream(out);
		
		pout.println("[����Ʈ ���� ��Ʈ����� Ȯ��!]");
		pout.println("[����Ʈ ���� ��Ʈ����� Ȯ��!]");
		
		pout.flush();
		pout.close();
	}
}
