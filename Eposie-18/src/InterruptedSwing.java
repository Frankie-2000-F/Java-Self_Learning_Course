import java.awt.*;

import javax.swing.*;

public class InterruptedSwing extends JFrame{
	Thread thread;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init(new InterruptedSwing(), 100, 100);
	}
	public InterruptedSwing() {
		super();
		final JProgressBar progressBar = new JProgressBar();
		getContentPane().add(progressBar, BorderLayout.NORTH);
		progressBar.setStringPainted(true);
		thread = new Thread(new Runnable() {
			int count = 0;
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					progressBar.setValue(++count);
					try {
						thread.sleep(1000);
					}catch(Exception e) {
						System.out.println("当前线程被中断");
						break;
					}
				}
			}
		});
		thread.start();
		thread.interrupt();
	}
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

}
