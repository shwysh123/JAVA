package Ch13;

//�޼��� �������̵�(�Լ� ������) ���̵�����
//��Ӱ��迡�� ����Ŭ������ �޼��带 ����Ŭ������ ������(���ļ����)�ϴ� ���� ����ϴ� ����
//�޼����� ����κ��� �����ϰԵΰ� �ٵ�({})�� ������ �ٸ��� �����ν� ���� ����Ŭ�����κ���
//�������� �޼����� ������ �پ��ϰ� �Ѽ��ִ�.(������)

class Animal{
	public void Sound() {
		System.out.println("�����ĳ�");
	}
}

class Dog extends Animal{
	public void Sound() { 
		System.out.println("����� �Ǻ󳻰� �� �θ��±���.");
	}
}

class Cat extends Animal{
	public void Sound() {
		System.out.println("�����̰� â�̰�, �� ����� ���̾�.");
	}
}
public class C03OverridingMain {
			public static void main (String[] args) {
				Animal ���� = new Animal();
				Dog ���� = new Dog();
				Cat �ϴ޸� = new Cat();
		
				����.Sound();
				����.Sound();
				�ϴ޸�.Sound();
			}
}
