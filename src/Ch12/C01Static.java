package Ch12;

//�ڹ��� �޸𸮱���

//���ÿ���				: {}������ ����Ǵ� ����,{}����� �Ҹ�
//Ŭ����(�޼���) ����   	: �����޸� ����, static����,static�Լ�,����Լ�,�������Լ�
//������				: new ����� ���� �޸� ���� �Ҵ�, �������� ���������� GC�� ���� ����

class C01Simple {
	static int num1 = 0; //C01Simple��ü���� �����Ǵ� ����
						 //��ü �������� �����ϰ� �޸𸮰����� �Ҵ�
						 //Ŭ���������� ���ٰ���
	
	int num2 = 0;		 

	// toString ������
	@Override
	public String toString() {
		return "C01Simple [num1=" + num1 + ", num2=" + num2 + "]";
	}

}

public class C01Static {
	public static void main(String[] args) {
		C01Simple.num1=1234;
			System.out.println("static num1 : "+C01Simple.num1);
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
		ob1.num1 = 100;
		ob1.num2 = 200;
		ob2.num1 = 300;
		ob2.num2 = 400;

		System.out.println(ob1);
		System.out.println(ob2);
	}
}
