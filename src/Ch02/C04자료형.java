package Ch02;

public class C04�ڷ��� {
	public static void main(String[] args) {
		// ���� int-4byte ���� ��ȣ o
			int n1 = 0b10101101; //2����
			int n2 = 173;//10�� ������
			int n3 = 0255;//8����
			int n4 = 0xad;//16����
			System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
			
		// ���� byte-1byte ���� ��ȣ o
			System.out.println("-----------------------------");
			
			byte n5 = (byte) -129;
			byte n6 = -30;
			byte n7 = 30;
			byte n8 = 127;
			byte n9 = (byte) 129;
			System.out.printf("%d\n", n5);
			System.out.println(0b10101101);
			
			char b1 =65535;
			short b2 = 32767;
			char b3 = 60000;
			System.out.println(b3);
		// ���� ���� char 2byte ����
			
			char ch1 = 'a';
			System.out.println(ch1);
			System.out.println((int)ch1);
			
			char ch2 = 98;
			System.out.println(ch2);
			System.out.println((int)ch2);
			
			char ch3 = 'b'+1;
			System.out.println(ch3);
			System.out.println((int)ch3);
			
			char ch4 = 'c'+1;
			System.out.println(ch4);
			System.out.println((int)ch4);
			
			char ch5 = '��';
			char ch6 = 0xac00+1;
			System.out.printf("%c %c\n",ch5,ch6);
			
			System.out.printf("%c\n", '\uAC80');
			
			System.out.printf("TEST : %c\n", '\ud7fb');

			
			byte p1;
			short p2;
			double p3;
			long p4;
			
			String name = "ȫ�浿";
			String job = "��";
			System.out.println(name);
			System.out.println(job);
			
			// boolean : ���� (true/false ����)
			
			boolean flag = (10>5);
			if(flag)
			{
				System.out.println("���ΰ�� ����");
			}
			else
			{
				System.out.println("�����ΰ�� ����");
			}
	}
}
