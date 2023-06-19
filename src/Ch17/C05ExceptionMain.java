package Ch17;

public class C05ExceptionMain {
	
		public static void main(String[] args) {
		try {
			String str = null;
			String r = str.toString(); //null예외
			int arr[] = {10,20,30};
			arr[5]=100;				//배열제외
			System.out.println(15/0); //산술제외
		}
//		catch(NullPointerException e) {System.out.println("Null 예외");}
//		catch(ArrayIndexOutOfBoundsException e) {System.out.println("Arr 예외");}
//		catch(ArithmeticException e) {System.out.println("산술예외");}
		catch(Exception e) {
			System.out.println(e);
		}
}
}