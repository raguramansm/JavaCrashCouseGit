package com.lao.staticKeyword;

public class staticVar2 {

	static String name;
	int salary;

	public static void main(String[] args) {
		
		staticVar2 obj1 = new staticVar2();
		obj1.name = "Seenu";
		obj1.salary = 50000;
		
		staticVar2 obj2 = new staticVar2();
		obj2.name = "Ragu"; // Only a single copy can be created. Now the name value is Ragu for obj1 as well.
		obj2.salary = 80000;
		
		System.out.println(obj1.name);
		System.out.println(obj1.salary);
		System.out.println(obj2.name);
		System.out.println(obj2.salary);
		
	
	}

}
