package Ch03;

public class C06TyteChange {
	public static void main(String[] args) {
		//short vs char
		//char �� shrot�� ���� size(2byte)�� ������
		//short�� ��,������ ���� / char�� ����� ����
		//short char���� ������ȯ�� ������ ���� �����ϴ���
		//ǥ���ϱ� ������ �ٸ��� ������ ���� �ٸ����� ���ü��� �ִ�.
		char n1 = 60000;
		short n2 = (short)n1;
		System.out.println(n2);
		
		int n3 = (char)n2;
		System.out.println(n3);
	}
}
