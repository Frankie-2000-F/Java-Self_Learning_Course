import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyJDialog extends JDialog{
	private static final long serialVersionUID = 1L;
	public MyJDialog(MyFrame frame) {
		super(frame, "第一个JDialog窗体", true);
		Container container = getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setBounds(120, 120, 100, 100);
	}
}
public class MyFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public static void main(String args[]) {
		new MyFrame();
	}
	public MyFrame() {
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("这是一个JFrame窗体"); // 在窗体中设置标签
		// 将标签的文字置于标签中间位置
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("弹出对话框"); // 定义一个按钮
		bl.setBounds(10, 10, 100, 21);
		bl.addActionListener(new ActionListener() { // 为按钮添加鼠标单击事件
					public void actionPerformed(ActionEvent e) {
						// 使MyJDialog窗体可见
						new MyJDialog(MyFrame.this).setVisible(true);
					}
				});
		container.add(bl); // 将按钮添加到容器中
		container.setBackground(Color.white);
		setSize(200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
