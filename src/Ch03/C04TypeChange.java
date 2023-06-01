package Ch03;

public class C04TypeChange {
	public static void main(String[] args) {
		
		//int로 자동 형변환
		byte x = 10;
		byte y = 20;
		byte result = (byte)(x+y); //컴파일 에러 x,y는 각각 int형 자료로 담아서 처리가되고
									// 왼쪽 byte형으로 저장시 작은공간에 큰자료형타입 넣으려는 문제발생
		int result1 = x + y;
		System.out.println(result);
		
		
		//큰타입으로 자동 형변환
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		int result3 = (int)(var1+var2+var3);
		// 요른쪽 변수들은 long으로 자동형변환
		// but, 왼쪽 공간이 작은공간이기 때문에 문제발생
//		long result2 = var1+var2+var3;
		System.out.println(result3);
		
		
		//실수연산식
		//큰타입으로 자동 형변환
		
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		double result4 = intvar + flvar + dbvar; 	// intvar,flvar가 각각 double형으로 자동형변환
		
		System.out.println(result4);
	}
}
