package Ch25;

public class C01ThreadMain {

	public static void main(String[] args) throws Exception{
		//Main Thread������ �����帧
		for(int i = 0 ; i<5;i++) {
			System.out.println("TASK1..");
			Thread.sleep(500);//0.5�� �Ͻ�����
		}
		for(int i= 0; i<5 ; i++) {
			System.out.println("TASK2..");
			Thread.sleep(500);
		}

	}

}
