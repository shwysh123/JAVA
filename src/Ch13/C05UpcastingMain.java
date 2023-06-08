package Ch13;

class A {
	int n1;
}

class B extends A {
	@Override
	public String toString() {
		return "B [n1=" + n1 + ", n2=" + n2 + "]";
	}

	int n2;
}

class C extends A {
	@Override
	public String toString() {
		return "C [n1=" + n1 + ", n3=" + n3 + "]";
	}

	int n3;
}

class D extends B {
	int n4;

	@Override
	public String toString() {
		return "D [n2=" + n2 + ", n1=" + n1 + ", n4=" + n4 + "]";
	}
}

class E extends C {
	@Override
	public String toString() {
		return "E [n3=" + n3 + ", n1=" + n1 + ", n5=" + n5 + "]";
	}

	int n5;
}

public class C05UpcastingMain {
// A obj=ob1;
	public static void UpDownTestFunc(A obj) {
		// B or C or D or E or..
		if (obj instanceof D) {
			D down = (D) obj;
			down.n1 = 10;
			down.n2 = 20;
			down.n4 = 30;
			System.out.println(down.toString());
		} else if (obj instanceof E) {
			E down = (E) obj;
			down.n1 = 10;
			down.n3 = 20;
			down.n5 = 50;
			System.out.println(down.toString());
		} else if (obj instanceof B) {
			B down = (B) obj;
			down.n1 = 40;
			down.n2 = 30;
			System.out.println(down.toString());
		} else if (obj instanceof C) {
			C down = (C) obj;
			down.n1 = 20;
			down.n3 = 30;
			System.out.println(down.toString());
		}
	}

	public static void main(String[] args) {
		B ob1 = new B();
		C ob2 = new C();
		D ob3 = new D();
		E ob4 = new E();
		UpDownTestFunc(ob1);
		UpDownTestFunc(ob2);
		UpDownTestFunc(ob3);
		UpDownTestFunc(ob4);
	}
}
