package Ch20;

import javax.swing.JFrame;

class C02GUI extends JFrame {
	
	C02GUI(){
		super("�ι��� ������â�Դϴ�");
		setBounds(100,100,700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class C02SwingMain {
	public static void main(String[] args) {
		
		new C02GUI();
	}
}
	