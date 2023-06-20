package Ch25;

public class C02Worker1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i<900000;i++) {
			System.out.println("  아니 니가 갱을 똑바로 와야지 그따구로 와서 졌잖아 이 유미없는 놈이...");
			try {
				Thread.sleep(4800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.5초 일시정지
		
	}

}
}
