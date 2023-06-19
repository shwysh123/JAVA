package Ch21;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C07UrlStream {

		public static void main(String[] args) throws Exception {
			
			
			URL url = new URL("https://www.leagueoflegends.com/ko-kr/news/game-updates/patch-13-12-notes/");
			InputStream bin = url.openStream(); //JAVA Broswer��³���
			BufferedInputStream buffIn =new BufferedInputStream(bin);  // ���� ��Ʈ���߰�
																	//���۰����� �ּ� �ѹ��� �ޱ�
																			
			Reader r = new InputStreamReader(buffIn);				//���� ��Ʈ���߰�
																		//byte -> char ������� �޾ƿ�
		OutputStream out = new FileOutputStream("c:\\iotest\\index.html");
		Writer wout = new OutputStreamWriter(out);
			
			
		while(true) {
			int data = r.read();
			if(data == -1)
				break;
			System.out.print((char)data);
			wout.write(data);
		}
		
		
		}																
		
}
