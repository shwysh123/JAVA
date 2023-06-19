package Ch17;

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
public class C04ClassCastExceptionMain {

	public static void changeDog(Animal animal) {
		try {
			Dog down = (Dog)animal;
		}
		catch(ClassCastException e) {
			System.out.println("예외");
		}
	}
	
		public static void main(String[] args) {
			
			Animal 워윅 = new Dog();
			Animal 유미없는 = new Cat();
			changeDog(워윅);
			changeDog(유미없는);
			
		}
}
