package Ch20;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	C03GUI(){
		super("�ι�° ������â�Դϴ�.");
		setBounds(100,100,700,700);
		
		JPanel panel = new JPanel(); // �гλ���
		//��������
		
		Color col = new Color(71,199,109); //RGB
		panel.setBackground(col);
		
		add(panel); //�����ӿ� panel�߰�
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C03SwingMain {

	public static void main(String[] args) {
		new C03GUI();
	}
}
