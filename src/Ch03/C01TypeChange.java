package Ch03;

public class C01TypeChange {
	public static void main(String[] args) {
		//(자료)형변환 연산시 일치하지 않는 자료형을 일치시키는 작업
		// 자동형변환(암시적 형변환) : 컴파일러에 의해 자동 형변환
		// 강제형변환(명시적 형변환) : 프로그래머에 의해서 강제 형변환
		
		// 자동형변환 =
		// 범위가 넓은 공간에 작은값이 대입되는 경우
		// byte -> short, char -> int -> long -> float -> double
	
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println("intvalue :" + intvalue);
		
		char charvalue = '가';
		intvalue =charvalue;
		System.out.println("가 의 유니코드 :" + intvalue);
		
		intvalue = 50;
		long longvalue = intvalue;
		System.out.println("longvalue :"+ longvalue);
		
		longvalue = 100;
		float floatvalue = longvalue;
		System.out.println("longvalue :" + floatvalue);

		floatvalue = 100.5F;
		double doublevalue = floatvalue;
		System.out.println("doublevalue :" + doublevalue);
		
	}
}
