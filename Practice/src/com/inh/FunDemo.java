package com.inh;
interface FunInf{
	void greetUser();
	static void human() {
		System.out.println("static");
	}
	default void animal() {
		System.out.println("deafult");
	}
	private void fox(){
		System.out.println("private method");
	}
}
public class FunDemo {

	public static void main(String args[]) {
		FunInf obj1 = new FunInf() {
			public void greetUser() {
				System.out.println("funinf method overrided");
			}
		};
		obj1.greetUser();
		new FunInf() {
			public void greetUser() {
				System.out.println("nameless object");
			}
		}.greetUser();
		//java8 feature
		FunInf obj2 = ()->System.out.println("java 8 new feature");
		obj2.greetUser();
	}
}
