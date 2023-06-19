package Ch17;

//throw 1인칭
//throws 3인칭

public class C06ThrowThrowsMain {
	
		public static void Ex1(){
			try {
			throw new NullPointerException("Ex1에서 발생시킨 NULL예외");
		}catch (Exception e) {
			System.out.println("Ex1함수내에서 예외처리함..");
		}
	}
		public static void Ex2() throws NullPointerException{
			throw new NullPointerException("Ex1에서 발생시킨 NULL예외");
		}
		
			public static void main(String [] args) {
				
				System.out.println("실행코드1");
				System.out.println("실행코드2");
				try {
				Ex2();
				}
				catch(Exception e) {
				System.err.println(e);	
				}
				System.out.println("실행코드3");
			}
		
}
