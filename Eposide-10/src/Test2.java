
public class Test2 extends Test{
	public Test2() {
		super();
		super.doSomething();
	}
	public void doSomethingnew() {
		System.out.println("doSomethingnew");
	}
	public void doSomething() {
		System.out.println("doSomething2");
	}
	protected Test2 doIt() {
		return new Test2();
	}

	public static void main(String args[]) {
		Test t1 = new Test();
		Test t2 = new Test2();
		t1.doSomething();
		t2.doSomething();
	}
}