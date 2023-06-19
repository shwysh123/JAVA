package Ch20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	C04GUI(){
		super("네번째 프레임창입니다.");
		setBounds(100,100,700,700);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JButton btn1 = new JButton("살다");
		btn1.setBounds(10,10,100,50);
		JButton btn2 = new JButton("죽다");
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
