package com.lao.staticKeyword;

public class staticMethod {

	public static void method1() // Static method
	{
		System.out.println("I am in static method");
	}
	
	public void method2() // Non Static method
	{
		System.out.println("I am in non static method");
	}
	
	public static void main(String[] args) {
		
		method1();  // No need to create object to call static method
		
		staticMethod obj = new staticMethod(); // Need to create object for Non static method
		obj.method2();
	}

}
