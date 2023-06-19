package Ch18;

class Person{
	String name;
	String age;
	char gender;
	public Person(String name, String age,char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	}

class Man extends Person{
	public Man (String name, String age, char gender) {
		super(name,age,gender);
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
class Woman extends Person{
	public Woman (String name, String age, char gender){
		super(name,age,gender);
	}

	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
class Couple<X,Y>{
	private X member1;
	private Y member2;
	Couple(X member1, Y member2){
		this.member1 = member1;
		this.member2 = member2;
	}
	void Showinfo() {
		System.out.println("M1 : "+ member1);
		System.out.println("M2 : "+ member2);
	}
}
class Animal{
	String kind;
}
class Dog extends Animal{
	Dog(String kind){
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Dog [kind=" + kind + "]";
	}
}
class Cat extends Animal{
	Cat(String kind){
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Cat [kind=" + kind + "]";
	}
}
public class C02GenericMain {
		public static void main(String[] args) {
		Couple<Man,Woman> couple = new Couple<Man,Woman>(new Man("ö��","20",'��'), new Woman("��ȸ","20",'��'));
		couple.Showinfo();
		Couple<Man,Woman> couple1 = new Couple<Man,Woman>(new Man("����","24",'��'), new Woman("�̿�","22",'��'));
		couple1.Showinfo();
		Couple<Man,Dog> couple2= new Couple<Man,Dog>(new Man("������","40",'��'), new Dog("�ð� �ں���"));
		couple2.Showinfo();
		}
}
