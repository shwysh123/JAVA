package Ch03;

public class C07StringTypeChange {
	public static void main(String[] args) {
		//���ڿ� + ���ڿ�
		System.out.println("���ڿ�1"+"���ڿ�2"); //���ڿ� + ���ڿ�
		System.out.println("���ڿ�1"+','+"���ڿ�2"); //���ڿ� + ���� + ���ڿ�
		System.out.println("���ڿ�1"+2); //���ڿ� + ���� -> ���ڸ� ���ڿ��� �ؼ�
		System.out.println("���ڿ�1"+','+'!');
		
		//���ڿ� -> ������ ��ȯ(����)
		System.out.println("10"+"20");
		int n1 = Integer.parseInt("10"); //�������ڵ�� �����κ��� ���޹��� ���� �� ���ڿ���
		int n2 = Integer.parseInt("20");
		System.out.println(n1+n2);
		//���ڿ� -> ������ ��ȯ(�Ǽ�)
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3+n4);
		
		short n5 =Short.parseShort("5");
		short n6 =Short.parseShort("6");
		System.out.println(n5+n6);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		//������ -> ������ ��ȯ
		int value1 =10;
		double value2 = 3.14;
		System.out.println(value1+value2); //����
		
		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(value2);
		System.out.println(str1 + str2); //���ڿ� ���̱�
	}
}
