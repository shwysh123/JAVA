package Ch02;

public class C03변수상수자료형 {

	public static void main(String[] args) {

		// 수 : 선 저장 / 후 처리
		// 변수 : 개발자의 유지보수 측면에서 바뀔 예정이 큰 수
		// 변수명 : 저장되어져 있는 변수 공간에 접근하기 위한 문자형태의 주소
		// 자료형 : 수를 저장하기 위해 공간을 형성하는 예약어

		// 상수(리터럴) : 항상 같은 수
		// 대입연산자(=)
		// lv(공간) = rv(값 - 먼저처리)
		
		int num; // 4byte int num 만들기
		num = 1; // num 값 초기화
		int num2 = 4; // int num2 만듬과 동시 초기화
		int num3 = num + num2; // int num3 만듬과 동시 조건제시
		System.out.println(num3); // num3 출력
	}
}
