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
		setTitle("�������������¼�");
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(new MyWindowListener());
	}
	
	private class MyWindowListener implements WindowListener{
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("���ڱ�����");
		}
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("�����ѱ��ر�");
		}
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("����Ҫ���ر�");
		}
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("���ڲ��ٴ��ڼ���״̬");
		}
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("���ڱ�����С��");
		}
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("���ڱ���С��");
		}@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("���ڱ���");
		}
	}

}
