package Ch08;

public class C01Main {
	public static void main(String[] args) {
		
		C01Person park = new C01Person();
		park.name="¹Ú¿µ¹Î";
		park.age=30;
		park.height=183.5f;
		park.weight=83.5;
		System.out.printf("%s %d %.1f %.0f",park.name,park.age,park.height,park.weight);
	}
}
