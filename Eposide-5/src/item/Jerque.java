package item;

public class Jerque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			str = str + i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("String消耗时间:" + time);
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			builder.append(i);
		}
		endTime = System.currentTimeMillis();
		time = endTime - startTime;
		System.out.println("StringBuilder消耗时间：" + time);
	}

}
