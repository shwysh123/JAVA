package Ch17;

//throw 1��Ī
//throws 3��Ī

public class C06ThrowThrowsMain {
	
		public static void Ex1(){
			try {
			throw new NullPointerException("Ex1���� �߻���Ų NULL����");
		}catch (Exception e) {
			System.out.println("Ex1�Լ������� ����ó����..");
		}
	}
		public static void Ex2() throws NullPointerException{
			throw new NullPointerException("Ex1���� �߻���Ų NULL����");
		}
		
			public static void main(String [] args) {
				
				System.out.println("�����ڵ�1");
				System.out.println("�����ڵ�2");
				try {
				Ex2();
				}
				catch(Exception e) {
				System.err.println(e);	
				}
				System.out.println("�����ڵ�3");
			}
		
}
