package Ch10;

class ����� {
	�����() {
	}
	���÷��� display;
	����� section1;
	�õ��� section2;
	������Ʈ�ѷ� controller;
}

class ���÷��� {
	void showinfo() {
		System.out.println("����� ���� ���� : ");
		System.out.println("�õ��� ���� ���� : ");
		System.out.println("�µ� ���� : ");
	}
}

class �õ��� {
	int cnt;

	void setInsert(String Object) {
		cnt++;
	}
}

class ����� {
	int cnt;

	void setInsert(String Object) {
		cnt++;
	}
}

class ������Ʈ�ѷ� {
	int ������ȿ��; // �ð��� ������¾�
	private int ����ǿµ�; // �ְ�µ� �����µ�
	private int �õ��ǿµ�;

	public int get����ǿµ�() {
		return ����ǿµ�;
	}

	public void set����ǿµ�(int ����ǿµ�) {
		this.����ǿµ� = ����ǿµ�;
	}

	public int get�õ��ǿµ�() {
		return �õ��ǿµ�;
	}

	public void set�õ��ǿµ�(int �õ��ǿµ�) {
		this.�õ��ǿµ� = �õ��ǿµ�;
	}

	public int get������ȿ��() {
		return ������ȿ��;
	}

	public void set������ȿ��(int ������ȿ��) {
		this.������ȿ�� = ������ȿ��;
	}

}

public class C03FunctionRef {

	public static void main(String[] args) {
			����� ref = new �����();
			
	}
}
