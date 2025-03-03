package com.inh;
class A{
	int a=10;
	String name = "rohit";
	public void userDetails() {
		System.out.println("id = "+a+" Name = "+name);
	}
}
class B extends A{
	String city = "Chennai";
	public void stdInfo() {
		System.out.println("id = "+a+" Name = "+name+" City = "+city);
	}
}
public class Inheritance {
	public static void main(String args[]) {
		B obj = new B();
		obj.stdInfo();
	}

}
