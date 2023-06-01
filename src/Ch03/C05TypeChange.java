package Ch03;

public class C05TypeChange {
		public static void main(String[] args) {
			int num1 = 10, num2 =4;
			double dnum1 = num1 / num2;
			
			double dnum2 = (double)num1 / num2;  // 피연산자는 int 형이기떄문에 연산후에 소수점 X
			
			double dnum3 = (1.0*num1) / num2;  
			
			System.out.println("dnum1 :" + dnum1);
			System.out.println("dnum2 :" + dnum2);
			System.out.println("dnum3 :" + dnum3);
		}
}
