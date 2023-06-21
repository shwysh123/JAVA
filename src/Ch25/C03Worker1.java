package Ch25;

public class C03Worker1 implements Runnable {

	C01GUI gui;

	C03Worker1(C01GUI gui) {
		this.gui = gui;
	}

	@Override
	public void run() {
		while (true) {

			try {
				gui.area1.append("³¢...³¢±â±ã\n");
				Thread.sleep(2500);
			}catch(InterruptedException e1) {
				break;
			}
			catch (Exception el) {
				el.printStackTrace();
			}
		}

	}
}
