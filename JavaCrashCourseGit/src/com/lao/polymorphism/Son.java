package com.lao.polymorphism;

public class Son extends Parent{
	
	@Override               // Annotation is not mandatory, Just to show that we have used same method as Parent but overriding
	public void marriage()  // Method name same as Parent class method
	{
		System.out.println("Nope! My marriage, My rules!!");
	}

	public static void main(String[] args) {
		Parent obj = new Son(); // Parent class reference, Child class object
		obj.properties();
		obj.marriage();
	}

}
