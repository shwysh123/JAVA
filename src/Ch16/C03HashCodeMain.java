package Ch16;

class C03Simple{
	int n;
	private int id;
		C03Simple(int id,int n){
			this.n=n;
			this.id=id;
		}
	@Override
	public int hashCode() {
	return 1;
	}
	
//toString() ������
//equals() ������
//hashcode() ������
}

public class C03HashCodeMain {

		public static void main (String[]args) {
			
			C03Simple ob1 = new C03Simple(1,10);
			C03Simple ob2 = new C03Simple(1,20);
			
			System.out.println(ob1);
			System.out.println(ob1.toString());
			System.out.println(ob1.hashCode()); // �����ǵ� hashcode
			
			System.out.println(System.identityHashCode(ob1));
		}
}
