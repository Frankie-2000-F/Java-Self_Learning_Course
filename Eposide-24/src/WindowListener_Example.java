import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowListener_Example extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowListener_Example windowListener = new WindowListener_Example();
		windowListener.setVisible(true);
	}
	
	public WindowListener_Example() {
		super();
		setTitle("捕获其他窗体事件");
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(new MyWindowListener());
	}
	
	private class MyWindowListener implements WindowListener{
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口被激活");
		}
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口已被关闭");
		}
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口要被关闭");
		}
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口不再处于激活状态");
		}
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口被非最小化");
		}
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口被最小化");
		}@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口被打开");
		}
	}

}
