package Ch25;

public class C02Worker2 implements Runnable {

	@Override
	public void run() {
		for(int i= 0; i<800000 ; i++) {
			System.out.println("�մ� �˼��ѵ� ���⼭ �̷��ø� �ٸ��մԵ鿡�� ���ذ� �Ǽ���.....");
			try {
				Thread.sleep(5100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
}