package Ch09;

class ���Recipe {
	// ����
	private void step1() {	}

	private void step2() {	}

	private void step3() {	}

	private void step4() {	}

	private void step5() {	}

	void cooking() {
		step1();
		step2();
		step3();
		step4();
		step5();
	}
}

class Cook {
	public ���Recipe Recipe_���=new ���Recipe();
}

public class C03Capsulation {
	public static void main(String[] args) {
		Cook Beak = new Cook();
		Beak.Recipe_���.cooking();
	}
}
