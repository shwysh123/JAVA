package Ch09;

//this
//Ŭ���� ������ ���Ǵ� �����
//�����Ǵ� ��ü�� ��ġ����(�޸��ּ�)�� �������µ� ���

class A{
	A getThis() {
		return this;
	}
}

class C06Simple {
	int x;
	int y;

	C06Simple() {
		System.out.println("C06Simple() ȣ��");
	}

	C06Simple(int x) {
		this.x = x;
		this.y = 0;
		System.out.println("C06Simple(int x) ȣ��");
	}

	C06Simple(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("C06Simple(int x,int y) ȣ��");
	}
}

public class C06This {
	public static void main(String[] agrs) {
		
		A ob = new A();
		System.out.println("ob : "+ob);
		System.out.println("ob.getThis() : "+ob.getThis());
		
//		C06Simple ob1 = new C06Simple();
//		C06Simple ob2 = new C06Simple(100);
//		C06Simple ob3 = new C06Simple(100, 200);
	}
}
