package item;

public class MathRandom {
	/**
	 * 定义产生偶数的方法
	 * @param num1 起始范围参数
	 * @param num2 终止范围参数
	 * @return 随机的范围内偶数
	 */
	public static int GetEvenNum(double num1, double num2) {
		//产生num1~num2之间的随机数
		int s = (int)num1 + (int)(Math.random()*(num2 - num1));
		if(s % 2 == 0) {
			return s;
		}else
			return s+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("任意一个2~32之间的偶数：" + GetEvenNum(2, 32));
	}

}
