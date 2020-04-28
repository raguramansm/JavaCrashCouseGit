// 50% Abstraction

package com.lao.abstractionConcepts;

public abstract class Car {  // If any one of the method in the class is abstract, then the class is called abstract class
	
	public abstract void engineSecret(); // No implementation and only specification is called abstract method
	
	public abstract void companyValut(); // No implementation and only specification is called abstract method
	
	public void employees1() // Abstract class can have concrete method (Non abstract) as well 
	{
		System.out.println("employees1");
	}
	
	public void employees2() // Concrete method 
	{
		System.out.println("employees2");
	}
}
