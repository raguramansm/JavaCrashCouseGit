package com.lao.constructors;

public class J04GrandChildClass extends J04ChildClass {
	
	public J04GrandChildClass() {
		//super(); - this is invisible when this class has parent
		System.out.println("I am in grand child class");
	}

	public static void main(String[] args) {
		J04GrandChildClass obj1 = new J04GrandChildClass();

	}

}
