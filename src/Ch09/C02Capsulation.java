package Ch09;

//ĸ��ȭ
//Ư�� ������ ������ ��� �����ϴµ� �־ �� ������ �Ϻγ� ���ΰ� �ܺη��� ������ ���ʿ��� ���� 
//��������(Private)�� �����Ͽ� �� ������ ���α�ɵ��� ������ �����Ͽ� ��밡���� �Լ��� �����ϴµ� �̸� ĸ��ȭ��� �Ѵ�.

class C02Engine{
	private	void ����() {System.out.println("�ܺηκ��� ���⸦ ����");}
	private	void ����() {System.out.println("���⸦ ����");}
	private	void ����() {System.out.println("����");}
	private	void ���() {System.out.println("���");}
	//ĸ��ȭ
	public void EnginStart() {
		����();
		����();
		����();
		���();
	}
}

class C02Car{
	C02Engine engine = new C02Engine();
	void run() {
		//�ڵ��� Ȱ��ȭ
		//���̵�̷� Ȱ��ȭ
		//��¡ ����
		engine.EnginStart();
	}
}
public class C02Capsulation {
	public static void main(String[] args) {
		C02Car newcar = new C02Car();
		newcar.run();
	}
}
