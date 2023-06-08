package Ch13;

class Parent{
	int x;
	int y;
	Parent(){
		System.out.println("Parent() ������ ȣ��");
	}
	Parent(int x){
		this.x=x;
		System.out.println("Parent(int x) ������ ȣ��");
	}
	Parent(int x,int y){
		this.y=y;
		this.x=x;
		System.out.println("Parent(int x,y) ������ ȣ��");
	}
	Parent(int x,int y,int z){

		System.out.println("Parent(int x,y,z) ������ ȣ��");
	}
}
class Son extends Parent{
	int z;
	Son(){
		super(); //����Ŭ������ ����Ʈ������(Parent())�� ȣ��
		System.out.println("Son() ������ ȣ��");
	}
	Son(int x){
		super(x);	//����Ŭ������ Parent(int x)�� ȣ��
		System.out.println("Son(int x) ������ ȣ��");
	}
	Son(int x,int y){
		super(x , y);
		this.z=0;
		System.out.println("Son(int x,y) ������ ȣ��");
		//����Ŭ������ Parent(int x,int y)�� ȣ��
	}
	Son(int x,int y,int z){
		super(x,y);
		this.z=z;
		System.out.println("Son(int x,y,z) ������ ȣ��");
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
