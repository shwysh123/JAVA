package Ch01;

public class C02SystemOut {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		// ����Ű
		// ���� : ��Ʈ�� + ��Ʈ + �Ʒ�
		// �ּ� : ��Ʈ�� + /
		// System : OS
		// System.out : OS�� �����ϴ� ǥ�� ��� ��Ʈ��
		// System.out.print();
		// ESCAPE ���� :
		// \n : ����, �ٹٲ� \b : �齺���̽� \t : �Ǳ���(�⺻ 8ĭ) ��ŭ Ŀ���̵�
		System.out.print(30);
		System.out.print("30");
		System.out.print("E");
		System.out.print("I'm Gooo\ting");

//		System.out.printf();
		// format : ����,����
		// %d = 10���� ���� ���Ĺ��� double
		// %f = 10���� �Ǽ� ���Ĺ��� float
		// %c = �ѹ��� ���Ĺ��� char
		// %s = ���ڿ� ���Ĺ��� String
		System.out.printf("%d %d %d \n", 10, 20, 30);
		System.out.printf("%f %f %f \n", 10.2, 20.3, 30.1);
		System.out.printf("%c %c %c \n", 'a', 'b', 'c');
		System.out.printf("%d %s %d \n", 1, "����", 100);
	}

}
