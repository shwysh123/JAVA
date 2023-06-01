package Ch04;
// 값입력 받기 Scanner 사용하기   도구 소환 컨트롤 + 쉬프트 + O
import java.util.Scanner;

public class C01Scanner {
 public static void main(String[] args) {
	 	//System.out 	: 표준 출력 스트림 생성 - 모니터
		//System.in 	: 표준 입력 스트림 생성 - 키보드
		//new Scanner(System.in)
		//키보드로 부터 전달되는 데이터를 받을 수 있는 Scanner장치를 생성
		//Scanner sc = new Scanner(System.in);
		// Scanner장치를 main함수내에서 제어(사용)할 수 있도록 
		// 참조변수 sc 연결
	 
	 	Scanner scanner = new Scanner(System.in);
	 	
	 	int a = scanner.nextInt();
	 	int b = scanner.nextInt();
	 	int c = scanner.nextInt();
	 	int d = scanner.nextInt();
	 	int e = a+b+c+d;
	 	System.out.printf("%d+%d+%d+%d = %d \n" , a,b,c,d,e);
	 	scanner.close();
}
}
