

public class OverWriteEquals{
	public static void main(String[] args) {
		String s1 = "123";
		String s2 = "123";
		System.out.println(s1.equals(s2));
		OverWriteEquals a1 = new OverWriteEquals();
		OverWriteEquals a2 = new OverWriteEquals();
		System.out.println(a1.equals(a2));
	}
}
