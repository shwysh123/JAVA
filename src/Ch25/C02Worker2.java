package Ch25;

public class C02Worker2 implements Runnable {

	@Override
	public void run() {
		for(int i= 0; i<800000 ; i++) {
			System.out.println("손님 죄송한데 여기서 이러시면 다른손님들에게 방해가 되서요.....");
			try {
				Thread.sleep(5100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
}