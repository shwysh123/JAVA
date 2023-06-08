package Ch09;

// ����������
//public : ��� Ŭ�������� ���ٰ���
//defalult : ���� ��Ű���� ���� Ŭ���������� ���ٰ���
//protected : ���� ��Ű�� or ��Ӱ����� ����Ŭ���������� ���ٰ���
//private : ���� Ŭ���������� ���ٰ���

class C01Person {
	// �Ӽ�
	String name; // �̸�
	private String id; // �ֹε�Ϲ�ȣ
	private int age; // ����
	private float weight; // ������
	private double height;// Ű
	private int salary; // ����

	// ������
	public C01Person(String name, String id, int age, float weight, double height, int salary) {

		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// ���
	// Getter and Setter
	
	
}

public class C01InfoHide {
	public static void main(String[] args) {
		C01Person Park = new C01Person("�����ż�", "1111-1111", 4000, 77.7f, 177.5, 8000);
		Park.name = "����";
		Park.setSalary(10000);
		System.out.println(Park.getId());

	}
}
