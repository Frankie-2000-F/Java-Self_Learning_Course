import java.awt.Container;

import javax.swing.*;

public class AbsolutePosition extends JFrame{
	public AbsolutePosition() {
		setTitle("������ʹ�þ��Բ���");
		setLayout(null);
		setBounds(500, 300, 600, 400);
		Container c = getContentPane();
		JButton b1 = new JButton("��ť1");
		JButton b2 = new JButton("��ť1");
		b1.setBounds(10, 30, 80, 30);
		b2.setBounds(60, 70, 100, 20);
		c.add(b1);
		c.add(b2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AbsolutePosition();
	}

}
