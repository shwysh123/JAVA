package Ch17;

public class C05ExceptionMain {
	
		public static void main(String[] args) {
		try {
			String str = null;
			String r = str.toString(); //null����
			int arr[] = {10,20,30};
			arr[5]=100;				//�迭����
			System.out.println(15/0); //�������
		}
//		catch(NullPointerException e) {System.out.println("Null ����");}
//		catch(ArrayIndexOutOfBoundsException e) {System.out.println("Arr ����");}
//		catch(ArithmeticException e) {System.out.println("�������");}
		catch(Exception e) {
			System.out.println(e);
		}
}
}