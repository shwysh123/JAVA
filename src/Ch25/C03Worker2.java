package Ch25;

public class C03Worker2 implements Runnable {

	C01GUI gui;

	C03Worker2(C01GUI gui) {
		this.gui = gui;
	}

	@Override
	public void run() {
		while (true) {
			
			try {
				gui.area2.append("��...���������....��\n");
				Thread.sleep(2500);
			}
			catch(InterruptedException e1) {
				break;}
				catch (Exception el) {
				el.printStackTrace();
			}
		}

	}
}
