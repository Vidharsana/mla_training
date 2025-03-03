package com.inh;
interface Inf9{
	void add();
	interface Inf10{
	void mul();
	}
}
class Impl7 implements Inf9.Inf10{
	public void mul() {
		System.out.println("add()");
	}
	
}
public class NestedInfDemo {

	public static void main(String args[]) {
		Impl7 obj = new Impl7();
		obj.mul();
	}
}
