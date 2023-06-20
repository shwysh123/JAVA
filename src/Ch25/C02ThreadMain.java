package Ch25;

public class C02ThreadMain {

	public static void main(String[] args) throws Exception{
		
		//Main Thread에서의 실행흐름
		
		//1 작업스레드객체 생성
		C02Worker1 worker1 = new C02Worker1();
		C02Worker2 worker2 = new C02Worker2();
		//2 각각의 독립된 작업공간에 작업스레드를 할당
		Thread th1 = new Thread(worker1);
		Thread th2 = new Thread(worker2);
		
		//3 작업스레드 실행
		th1.start();
		th2.start();
		
		for(int i = 0 ; i < 1000000 ; i++) {
			System.out.println(" 어휴...좀 같이 좀 쳐 해주니까 아주 지가 잘난줄알아요 ㅋㅋㅋ ");
			Thread.sleep(5000);
		}

	}

}
