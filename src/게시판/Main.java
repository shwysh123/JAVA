package 게시판;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class 글쓰기 extends JFrame {
	글쓰기(){
		super("다 같이 게시판");
		setBounds(900,900,900,900);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JButton btn2 = new JButton("글쓰기");
		btn2.setBounds(650,810,100,25);
	
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(150,150,600,650);
		JTextField txt2 = new JTextField();
		txt2.setBounds(150,100,600,40);
		
		panel.add(btn2);
		
		panel.add(txt1);
		panel.add(txt2);
		
		
		add(panel);
		
		Color col = new Color(71,199,109); //RGB
		panel.setBackground(col);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class Main {
	public static void main(String[] args) {

		new 글쓰기();

	}
}
