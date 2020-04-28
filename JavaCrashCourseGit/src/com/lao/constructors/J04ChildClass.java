package com.lao.constructors;

public class J04ChildClass extends J04ParentClass{
	
	public J04ChildClass() 
	{
		//super(); - this is invisible when this class has parent
		System.out.println("I am in child class");
	}
}
