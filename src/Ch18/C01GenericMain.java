package Ch18;

class ���{
	
}

class �� extends ��� {
	String meterial;

	��(String m) {
		this.meterial = m;
	}

	public String toString() {
		return meterial;
	}
}

class ���� extends ��� {
	String meterial;

	����(String m) {
		this.meterial = m;
	}

	public String toString() {
		return meterial;
	}
}

class ���� {
	String meterial;
	
	����(String m){
		this.meterial = m;
	}
	public String toString() {
		return meterial;
	}
}

class ��ä extends ��� {
	String meterial;

	��ä(String m) {
		this.meterial = m;
	}

	public String toString() {
		return meterial;
	}
}

class ȣ��<T extends ���> {		// * extends ��� : ���׸�Ÿ�Կ� �����ڷ����� ����� ����Ŭ������ �޴´�.
	private T meterial;			//����,��ä,�ϰ�ü ����

	ȣ��(T meterial) {
		this.meterial = meterial;
	}
	void showinfo() {
		System.out.println(meterial.toString()+"���� ���� ȣ��....");
	}
}

public class C01GenericMain {
	public static void main(String[] args) {

		ȣ��<��> ob1 = new ȣ��<��> (new ��("����"));
		ob1.showinfo();
		ȣ��<����> ob2 = new ȣ��<����> (new ����("ȣ����"));
		ob2.showinfo();
		ȣ��<��ä> ob3 = new ȣ��<��ä> (new ��ä("��¥���� ġ��"));
		ob3.showinfo();
//		ȣ��<����> ob4 = new ȣ��<����> (new ����("����"));  //���ʴ� ��ӵ����� �ʾ� �Ұ���.
//		ob4.showinfo();
	}
}
