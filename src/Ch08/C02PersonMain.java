package Ch08;

class C02Person {
	//�Ӽ�
	String name;
	int age;
	float height;
	double weight;
	//���
}

public class C02PersonMain {
	public static void main(String[] args) {
		
		C02Person park = new C02Person();
		park.name="�ڿ���";
		park.age=30;
		park.height=183.5f;
		park.weight=83.5;
		System.out.printf("%s %d %.1f %.0f",park.name,park.age,park.height,park.weight);
	}
		
}
