package Ch13;

//���
//����(�θ�,����)Ŭ������ �Ӽ��� ����� ����(�ڽ�,����)Ŭ�������� �״�� �޾� ����� �� �ֵ��� ����� ����
//���� ����Ŭ������ ����Ŭ������ �Ӽ��� ��� �̿��� ����� �߰��� �� �ִ�.
//extends���� ����Ѵ�.

//��� �������
//1 Ȯ�强
//2 ��������
//3 ������
class Point2D {
	int x;
	int y;

	Point2D() {
		System.out.println("Point2D ������ȣ��");
	}

	public String showInfo2D() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
}

class Point3D extends Point2D {
	int z;

	Point3D() {
		super();
		System.out.println("Point3D ������ȣ��");
	}

	public String showInfo3D() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
}

public class C01InheritanceMain {
	public static void main(String[] args) {
		Point3D ob = new Point3D();
		ob.x = 100; // ��ӹ��� ���
		ob.y = 200; // ��ӹ��� ���
		ob.z = 300; // Ȯ��� ���
		System.out.println(ob.showInfo3D());
	}
}
