package Ch02;

public class C02���� {
	public static void main(String[] args) {
		//����
		//�������� ����Ͽ� Ǳ�ϴ�.
		// 10���� -> 2����
		// 111 -> 01101111
		// -111 -> 10010001
		// 96 -> 01100000
		// -96 -> 10100000
		// 31 -> 00011111
		// -31 -> 11100001
		
		//2���� -> 10����
		//10101111 -> -81
		//00110101 -> 53 
		//11001100 -> -52
		//10101010 -> -86
		
		byte data = (byte)0b10101111;
		short data2 = 0b10101111;
		System.out.println(data);
		System.out.println(data2);
		
	}
}
