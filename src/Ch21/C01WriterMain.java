package Ch21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {
	
	public static void main(String [] args) {
		try {
//			Writer out = new FileWriter("c:\\iotest\\test1.txt"); //덮어쓰기
			Writer out = new FileWriter("c:\\iotest\\test1.txt",true); //추가하기

			out.write("class Animal(){run.run;}\n");
					out.write("CCCC\n");
							out.write("DDDD\n");
									out.write("EEEEEE\n");
											out.flush();
											out.close();
	} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
