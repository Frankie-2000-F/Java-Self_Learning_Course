
public class ThreadTest extends Thread {
	private int count = 10;
	public void run() {
		while(true) {
			System.out.print(count + " ");
			if(--count == 0) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTest().start();
	}

}
