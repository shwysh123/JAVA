package Ch14;

class Par1{
	void func() {} //�ϼ��� �޼���
}

class Son1 extends Par1{
	void func() {System.out.println("Son1���� ���������� �������� func() ȣ��!");}
}
abstract class Par2{
	abstract void func();
}
class Son2 extends Par2{

	@Override
	void func() {System.out.println("Son2���� ������ �������� func() ȣ��!");}
	
}
public class C01AbstractMain {
		public static void main(String[] args) {
		Par1 ob1 = new Par1(); //����Ŭ���� ��ü ���� o
		Son1 ob2 = new Son1(); //����Ŭ���� ��ü ���� o
		Par1 ob3 = ob2;		   //Upcasting
		ob3.func(); //���� ���������� �������� ������ü �޼��� ���� o
		
//		Par2 ob4 = new Par2();  �߻�Ŭ���� ��ü ���� x
		Son2 ob5 = new Son2(); //�߻�Ŭ���� ��ü ����(�߻�޼��带 ������ �ؾ߰���)
		Par2 ob6 = ob5;        //Upcasting
		ob6.func();
		}
}
