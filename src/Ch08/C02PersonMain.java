package Ch08;

class C02Person {
	//속성
	String name;
	int age;
	float height;
	double weight;
	//기능
}

public class C02PersonMain {
	public static void main(String[] args) {
		
		C02Person park = new C02Person();
		park.name="박영민";
		park.age=30;
		park.height=183.5f;
		park.weight=83.5;
		System.out.printf("%s %d %.1f %.0f",park.name,park.age,park.height,park.weight);
	}
		
}
