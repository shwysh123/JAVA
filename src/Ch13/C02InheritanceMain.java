package Ch13;

class Parent{
	int x;
	int y;
	Parent(){
		System.out.println("Parent() 생성자 호출");
	}
	Parent(int x){
		this.x=x;
		System.out.println("Parent(int x) 생성자 호출");
	}
	Parent(int x,int y){
		this.y=y;
		this.x=x;
		System.out.println("Parent(int x,y) 생성자 호출");
	}
	Parent(int x,int y,int z){

		System.out.println("Parent(int x,y,z) 생성자 호출");
	}
}
class Son extends Parent{
	int z;
	Son(){
		super(); //상위클래스의 디폴트생성자(Parent())를 호출
		System.out.println("Son() 생성자 호출");
	}
	Son(int x){
		super(x);	//상위클래스의 Parent(int x)를 호출
		System.out.println("Son(int x) 생성자 호출");
	}
	Son(int x,int y){
		super(x , y);
		this.z=0;
		System.out.println("Son(int x,y) 생성자 호출");
		//상위클래스의 Parent(int x,int y)를 호출
	}
	Son(int x,int y,int z){
		super(x,y);
		this.z=z;
		System.out.println("Son(int x,y,z) 생성자 호출");
	}
	public String toString() {
		return "Son [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
}

public class C02InheritanceMain {
		public static void main(String [] args) {
		
			Son ob = new Son(15);
			System.out.println(ob.toString());
			Son ob1 = new Son(10,20);
			Son ob2 = new Son(10,20,30);
			System.out.println(ob1.toString());
			System.out.println(ob2.toString());
			
		}
}
