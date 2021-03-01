
public class Test {
	public Test() {
		System.out.println("test");
	}
	protected void doSomething() {
		System.out.println("doSomething");
	}
	protected Test doIt() {
		return new Test();
	}
	
}
