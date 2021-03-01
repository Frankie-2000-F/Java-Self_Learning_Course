import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;

import javax.swing.*;

public class WindowFocusListener_Example extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowFocusListener_Example focusListener = new WindowFocusListener_Example();
		focusListener.setVisible(true);
	}

	public WindowFocusListener_Example() {
		super();
		addWindowFocusListener(new MyWindowFocusListener());
		setBounds(100, 100, 500, 375);
		setTitle("捕获窗体焦点事件");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private class MyWindowFocusListener implements WindowFocusListener{
		@Override
		public void windowGainedFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口获得焦点");
		}
		
		@Override
		public void windowLostFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("窗口失去焦点");
		}
	}
	
	
}
