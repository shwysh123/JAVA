package Ch03;

public class C01TypeChange {
	public static void main(String[] args) {
		//(�ڷ�)����ȯ ����� ��ġ���� �ʴ� �ڷ����� ��ġ��Ű�� �۾�
		// �ڵ�����ȯ(�Ͻ��� ����ȯ) : �����Ϸ��� ���� �ڵ� ����ȯ
		// ��������ȯ(����� ����ȯ) : ���α׷��ӿ� ���ؼ� ���� ����ȯ
		
		// �ڵ�����ȯ =
		// ������ ���� ������ �������� ���ԵǴ� ���
		// byte -> short, char -> int -> long -> float -> double
	
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println("intvalue :" + intvalue);
		
		char charvalue = '��';
		intvalue =charvalue;
		System.out.println("�� �� �����ڵ� :" + intvalue);
		
		intvalue = 50;
		long longvalue = intvalue;
		System.out.println("longvalue :"+ longvalue);
		
		longvalue = 100;
		float floatvalue = longvalue;
		System.out.println("longvalue :" + floatvalue);

		floatvalue = 100.5F;
		double doublevalue = floatvalue;
		System.out.println("doublevalue :" + doublevalue);
		
	}
}
