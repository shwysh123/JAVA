package Ch03;

public class C04TypeChange {
	public static void main(String[] args) {
		
		//int�� �ڵ� ����ȯ
		byte x = 10;
		byte y = 20;
		byte result = (byte)(x+y); //������ ���� x,y�� ���� int�� �ڷ�� ��Ƽ� ó�����ǰ�
									// ���� byte������ ����� ���������� ū�ڷ���Ÿ�� �������� �����߻�
		int result1 = x + y;
		System.out.println(result);
		
		
		//ūŸ������ �ڵ� ����ȯ
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		int result3 = (int)(var1+var2+var3);
		// �严�� �������� long���� �ڵ�����ȯ
		// but, ���� ������ ���������̱� ������ �����߻�
//		long result2 = var1+var2+var3;
		System.out.println(result3);
		
		
		//�Ǽ������
		//ūŸ������ �ڵ� ����ȯ
		
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		double result4 = intvar + flvar + dbvar; 	// intvar,flvar�� ���� double������ �ڵ�����ȯ
		
		System.out.println(result4);
	}
}
