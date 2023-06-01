package Ch01;

public class C02SystemOut {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		// 단축키
		// 복사 : 컨트롤 + 알트 + 아래
		// 주석 : 컬트롤 + /
		// System : OS
		// System.out : OS가 관리하는 표준 출력 스트림
		// System.out.print();
		// ESCAPE 문자 :
		// \n : 개행, 줄바꿈 \b : 백스페이스 \t : 탭길이(기본 8칸) 만큼 커서이동
		System.out.print(30);
		System.out.print("30");
		System.out.print("E");
		System.out.print("I'm Gooo\ting");

//		System.out.printf();
		// format : 형식,서식
		// %d = 10진수 정수 서식문자 double
		// %f = 10진수 실수 서식문자 float
		// %c = 한문자 서식문자 char
		// %s = 문자열 서식문자 String
		System.out.printf("%d %d %d \n", 10, 20, 30);
		System.out.printf("%f %f %f \n", 10.2, 20.3, 30.1);
		System.out.printf("%c %c %c \n", 'a', 'b', 'c');
		System.out.printf("%d %s %d \n", 1, "국어", 100);
	}

}
