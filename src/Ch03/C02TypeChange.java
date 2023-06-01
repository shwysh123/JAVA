package Ch03;

public class C02TypeChange {
	public static void main(String[] args) {
		//강제형변환
		//좁은범위공간에 큰값을 넣으려고 하는경우
		//기본적으로 불가능하기 때문에 강제로 자료형을 바꾸어 전달한다
		//데이터 손실의 염려가 있다
		
		int intvalue = 44032;
		char charvalue = (char)intvalue;
		System.out.println(charvalue);
		
		long longvalue = 500;
		intvalue = (int)longvalue;
		System.out.println(intvalue);
		
		//데이터 손실!
		double doublevalue = 3.14;
		intvalue = (int)doublevalue;
		System.out.println(intvalue);
	}
}
