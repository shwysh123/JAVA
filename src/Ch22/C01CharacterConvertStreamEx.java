package Ch22;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//������Ʈ��
//�⺻��Ʈ���� �뵵������ �ΰ����� ����� �߰��ϴ� ��Ʈ��

//InputStreamReader : ����Ʈ��Ʈ�� -> ���ڽ�Ʈ��(Reader)
//OutputStreamWriter : ����Ʈ��Ʈ�� -> ���ڽ�Ʈ��(Writer)
public class C01CharacterConvertStreamEx {

	public static void main(String[] args) throws Exception {
		
//		String str = "���� ��ȯ ��Ʈ�� ���";
//		FileOutputStream out = new FileOutputStream("c:\\iotest\\test.txt");
//		BufferedOutputStream bout = new BufferedOutputStream(out);
//		OutputStreamWriter wout = new OutputStreamWriter(bout);
//		wout.write(str);
//		wout.flush();
//		wout.close();

		FileInputStream in = new FileInputStream("c:\\iotest\\test.txt");
		BufferedInputStream bin = new BufferedInputStream(in);
		InputStreamReader rin = new InputStreamReader(bin);
		
		char[] buffer = new char[100];
		while(true) {
			int cnt = rin.read(buffer);
			if(cnt ==-1)
				break;
			System.out.println(buffer);
		}
	}
	
}
