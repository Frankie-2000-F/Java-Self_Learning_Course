package com.lzw;

class Parent{
	private void doit() {
		System.out.println("∏∏¿‡doit()");
	}
}
class Sub extends Parent{
	void doit() {
		System.out.println("◊”¿‡doit()");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.doit();
	}

}
