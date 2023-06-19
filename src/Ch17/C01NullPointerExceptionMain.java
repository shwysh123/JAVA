package Ch17;
/* 오류 : 참 값과의 거리
 	-컴파일 오류 : 문법오류(Syntxt error)
 	-실행오류 : Runtime error
 		- 시스템 오류 : 구조상 오류
 		- 예외 : 경미한 오류
 	-버그 : ............ */
public class C01NullPointerExceptionMain {

		public static void main(String[] args) {
			
			try {
				String str = null;
				System.out.println(str.toString()); // NullPointerException 예외처리가 생성되는 시점
			}
			catch(NullPointerException e)
			{
				System.err.println("예외발생!!");
//				System.out.println(e.getCause()); // 예외원인
//				System.out.println(e.toString()); // 예외객체 메세지
//				System.out.println(e.getStackTrace()); // 예외객체 식별정보
				
				e.printStackTrace();   // 예외내용
			}
			
			System.out.println("실행해야되는 코드1");
			System.out.println("실행해야되는 코드2");
			
		}
}
