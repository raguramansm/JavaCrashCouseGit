package com.lao.staticKeyword;

public class staticVar1 {
	
	static String name1 = "Amma"; // Static variable
	String name2 = "Neighbour"; // Non static variable
	
	public static void main(String[] args) {
		
		System.out.println(name1); // No need to create object for static variable
		
		staticVar1 obj = new staticVar1(); // Need to create object for non static variable
		System.out.println(obj.name2);		

	}

}
