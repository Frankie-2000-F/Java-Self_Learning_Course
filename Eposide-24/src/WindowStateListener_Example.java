import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class WindowStateListener_Example extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowStateListener_Example stateListener = new WindowStateListener_Example();
		stateListener.setVisible(true);
	}

	public WindowStateListener_Example() {
		super();
		addWindowStateListener(new MyWindowStateListener());
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("捕获窗体状态事件");
		
	}
	
	private class MyWindowStateListener implements WindowStateListener{
		@Override
		public void windowStateChanged(WindowEvent e) {
			// TODO Auto-generated method stub
			int newState = e.getNewState();
			int oldState = e.getOldState();
			String from = "";
			String to = "";
			switch (oldState) {
			case Frame.NORMAL:
				from = "正常化";
				break;
			case Frame.ICONIFIED:
				from = "最小化";
				break;
			default:
				from = "最大化";
				break;
			}
			switch (newState) {
			case Frame.NORMAL:
				to = "正常化";
				break;
			case Frame.MAXIMIZED_BOTH:
				to = "最大化";
				break;
			default:
				to = "最小化";
				break;
			}
			System.out.println(from + "————>" + to);
		}
	}
}
