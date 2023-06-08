package Ch11;

class C04Person{
	 String name;
	 int age;
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}
	 
 }

public class C04ClassArrayMain {
			public static void main(String[] args) {

				C04Person [] list = new C04Person[3];
				list[0] = new C04Person();
				list[0].name="½ÅÁöµå";
				list[0].age=36;

				list[1] = new C04Person();
				list[1].name="ºıºıÀÌ";
				list[1].age=40;
				
				list[2] = new C04Person();
				list[2].name="•¾•¾ÀÌ";
				list[2].age=54;
				
				System.out.println(list[0]);
				System.out.println(list[1]);
				System.out.println(list[2]);
			}
}
