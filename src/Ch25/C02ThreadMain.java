package Ch25;

public class C02ThreadMain {

	public static void main(String[] args) throws Exception{
		
		//Main Thread������ �����帧
		
		//1 �۾������尴ü ����
		C02Worker1 worker1 = new C02Worker1();
		C02Worker2 worker2 = new C02Worker2();
		//2 ������ ������ �۾������� �۾������带 �Ҵ�
		Thread th1 = new Thread(worker1);
		Thread th2 = new Thread(worker2);
		
		//3 �۾������� ����
		th1.start();
		th2.start();
		
		for(int i = 0 ; i < 1000000 ; i++) {
			System.out.println(" ����...�� ���� �� �� ���ִϱ� ���� ���� �߳��پ˾ƿ� ������ ");
			Thread.sleep(5000);
		}

	}

}
