package Ch21;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class C05FileinputStream {
	
	public static void main (String [] args) throws Exception {
		
		InputStream in = new FileInputStream("c:\\iotest\\test1.txt");
		// 1byte������ �ޱ�
//		while(true) {
//			int data = in.read();
//			if(data == -1)
//				break;
//			System.out.println((char)data);
//		}
	
	//���ڿ�(UTF8)�ޱ�
		byte[] buffer = new byte[4096];
		while(true)
		{
			int bytedata = in.read(buffer);  //buffer �迭�� ũ�⸸ŭ input���� �޾ƿ��� byte������ ����
			if(bytedata==-1)				//�о���� byte�� ������ ��ȯ -> bytedata������ ����
				break;
			System.out.println("BYTEDATA : "+ bytedata);
			System.out.println("BYTEDATA : "+ Arrays.toString(buffer));
		}
	
	
	}
}