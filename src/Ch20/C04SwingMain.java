package Ch20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	C04GUI(){
		super("�׹�° ������â�Դϴ�.");
		setBounds(100,100,700,700);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JButton btn1 = new JButton("���");
		btn1.setBounds(10,10,100,50);
		JButton btn2 = new JButton("�״�");
		btn2.setBounds(120,10,100,50);
		
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,50, 100, 30);
		
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C04SwingMain {
		public static void main(String[] args) {
			new C04GUI();
		}
}
