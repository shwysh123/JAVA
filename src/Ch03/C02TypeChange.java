package Ch03;

public class C02TypeChange {
	public static void main(String[] args) {
		//��������ȯ
		//�������������� ū���� �������� �ϴ°��
		//�⺻������ �Ұ����ϱ� ������ ������ �ڷ����� �ٲپ� �����Ѵ�
		//������ �ս��� ������ �ִ�
		
		int intvalue = 44032;
		char charvalue = (char)intvalue;
		System.out.println(charvalue);
		
		long longvalue = 500;
		intvalue = (int)longvalue;
		System.out.println(intvalue);
		
		//������ �ս�!
		double doublevalue = 3.14;
		intvalue = (int)doublevalue;
		System.out.println(intvalue);
	}
}
