package Ch25;

public class C02Worker1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i<900000;i++) {
			System.out.println("  �ƴ� �ϰ� ���� �ȹٷ� �;��� �׵����� �ͼ� ���ݾ� �� ���̾��� ����...");
			try {
				Thread.sleep(4800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.5�� �Ͻ�����
		
	}

}
}
