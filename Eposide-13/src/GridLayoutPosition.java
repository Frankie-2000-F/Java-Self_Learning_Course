import java.awt.*;
import javax.swing.*;

public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition() {
		Container c = getContentPane();
		setLayout(new GridLayout(7, 3, 5, 5));
		for (int i = 0; i < 20; i++) {
			c.add(new JButton("button" + i));
		}
		setSize(300, 300);
		setTitle("这是一个网格布局管理器的窗体");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutPosition();
	}

}
