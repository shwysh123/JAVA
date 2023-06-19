package Ch20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

class C06GUI extends JFrame implements ActionListener, KeyListener, MouseListener {

	JButton btn1;
	JButton btn2;
	JTextField txt1;
	JTextField txt2;
	JTextArea area1;
	JScrollPane scroll1;

	C06GUI() {
		// Frame
		super("5��° ������â�Դϴ�");
		setBounds(100, 100, 700, 700);

		// Panel
		JPanel panel = new JPanel(); // �гλ���
		panel.setLayout(null);

		// Btn_Component
		btn1 = new JButton("Button1");
		btn1.setBounds(10, 10, 100, 30);
		btn2 = new JButton("Button2");
		btn2.setBounds(120, 10, 100, 30);

		// Txt_Component
		txt1 = new JTextField();
		txt1.setBounds(10, 50, 100, 30);
		txt2 = new JTextField();
		txt2.setBounds(120, 50, 100, 30);

		// TxtArea_Component
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		area1.setEditable(false);

		// ScrollPan_Component
		scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10, 90, 210, 300);

		// Eventó��
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		txt1.addKeyListener(this);
		area1.addMouseListener(this);

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
//			panel.add(area1);
		panel.add(scroll1);

		// Frame
		add(panel); // �����ӿ� panel�߰�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// System.out.println("�̺�Ʈ �߻�");
		if (e.getSource() == btn1) {
			System.out.println("Button1 Ŭ��");

		} else if (e.getSource() == btn2) {
			System.out.println("Button2 Ŭ��");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Ű�� ��������/������(UNICODE ����)
//			System.out.println("keyTyped() : "+e.getKeyChar());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Ű�� ��������
//			System.out.println("keyPressed() : "+e.getKeyChar());
//			System.out.println("keyPressed() : "+e.getKeyCode());
		if (e.getSource() == txt1) {
			if (e.getKeyCode() == 10) {
				System.out.println("txt1's Enter");
				String str = txt1.getText();
				area1.append(str + "\n");
				txt1.setText("");
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Ű�� ������(UNICODE ������)
//			System.out.println("keyReleased() : " + e.getKeyChar());
//			System.out.println("keyReleased() : " + e.getKeyCode());

	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("mouseCliked..");
//		System.out.println(e.getPoint().x+" "+e.getPoint().y+" ");
		int offset = area1.viewToModel(e.getPoint());
//		System.out.println(offset);
		try {
			int row=area1.getLineOfOffset(offset);
			System.out.println(row);
			int startOffset = area1.getLineStartOffset(row);
			int endOffset = area1.getLineEndOffset(row);
			String txt = area1.getText(startOffset,endOffset-startOffset);
			System.out.println(txt);
		}
		catch(BadLocationException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("mousePressed..");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("mouseReleased..");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("mouseEntered..");
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("mouseExited..");
	}

}

public class C06SwingMain {

	public static void main(String[] args) {

		new C06GUI();
	}
}
