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
			System.out.println("����");
		}
	}
	
		public static void main(String[] args) {
			
			Animal ���� = new Dog();
			Animal ���̾��� = new Cat();
			changeDog(����);
			changeDog(���̾���);
			
		}
}
