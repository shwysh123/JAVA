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
			InputStream bin = url.openStream(); //JAVA Broswer출력내용
			BufferedInputStream buffIn =new BufferedInputStream(bin);  // 보조 스트림추가
																	//버퍼공간을 둬서 한번에 받기
																			
			Reader r = new InputStreamReader(buffIn);				//보조 스트림추가
																		//byte -> char 사이즈로 받아옴
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
