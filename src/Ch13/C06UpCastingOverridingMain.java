package Ch13;

class C06Super{
	
	void SuperFunc() {System.out.println("SuperFunc ȣ��!!");}
	
}
class C06Sub extends C06Super{
	
	void SubFunc() {System.out.println("SubFunc ȣ��!!");}
	
	void SuperFunc() {System.out.println("SubŬ������ �������� SuperFunc ȣ��!!");}
}

public class C06UpCastingOverridingMain {

		public static void main(String[] args) {
	
			C06Super ob = new C06Sub(); // Upcasting
			ob.SuperFunc(); //�������� ����� ���ٰ���
			//ob.SubFunc(); Ȯ��� ����� ���� �Ұ�
			
			//Upcasting�� ����ϸ�
			//Ȯ��� ����� ���ٰ��� ? x -> Downcasting�� ���� Ȯ��� ����� ����
			//�������̵��� ����� ���ٰ��� ? o
		}
}
