
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

public class JButtonTest extends JFrame{

	public JButtonTest() {
		URL url = MyImageIcon.class.getResource("/imageButton.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3, 2, 5, 5));
		Container c = getContentPane();
		for(int i = 0; i < 5; i++) {
			JButton J =new JButton("button" + i);
			J.setIcon(icon);
			c.add(J);
			if(i%2 == 0) {
				J.setEnabled(false);
			}
		}
		JButton jb = new JButton();
		jb.setMaximumSize(new Dimension(90, 30));
		jb.setIcon(icon);
		jb.setHideActionText(true);
		jb.setToolTipText("ͼƬ��ť");
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "�����Ի���");
			}
		});
		c.add(jb);
		setTitle("������������ͼƬ�İ�ť");
		setBounds(350, 150, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonTest();
	}

}
