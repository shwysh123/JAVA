package Ch22;

import java.io.DataInputStream;
import java.io.FileInputStream;

//DataInputStream : byte�����͸� �����ö� �⺻�ڷ��� ������ �޾ƿü� �ִ�.
//DataOutputStream : byte�����͸� ���Ϸ� �����Ҷ� �⺻�ڷ��������� ���� ����.
public class C03DataInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
//		FileOutputStream out = new FileOutputStream("c:\\iotest\\test.txt");
//		DataOutputStream dout = new DataOutputStream(out);
//		dout.writeUTF("ȫ�浿");
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		dout.flush();
//		dout.close();
		
		FileInputStream in = new FileInputStream("c:\\iotest\\test.txt");
		DataInputStream din = new DataInputStream(in);
		
		String name = din.readUTF();
		double dval = din.readDouble();
		int ival = din.readInt();
	
		System.out.printf("%s %f %d\n",name,dval,ival);
	}
}
