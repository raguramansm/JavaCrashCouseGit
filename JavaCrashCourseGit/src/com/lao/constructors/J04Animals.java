//No argument constructor
//Parameterized constructor
//Constructor overloading

package com.lao.constructors;

public class J04Animals {
	
	String animal_name;
	String animal_type;
	
	public J04Animals() {
		
		animal_name = "Lion";
		animal_type = "Wild";
		
		System.out.println("Animal name is "+animal_name + "Animal type is "+animal_type);	
	}
	
	public J04Animals (String name, String type) 
	{
//		animal_name = name;
//		animal_type = type;
//		System.out.println("Animal name is "+animal_name + "Animal type is "+animal_type);	
		System.out.println("Animal name is "+name + "Animal type is "+type);	

	}
	
	public J04Animals (int numberOfAnimals, String country)
	{
		System.out.println("Number of animals are "+numberOfAnimals+" in country "+country);
	}

	public static void main(String[] args) {
		J04Animals animalobj1 = new J04Animals(); 
		J04Animals animalobj2 = new J04Animals("Fish", "Sea");
		J04Animals animalobj3 = new J04Animals(500, "India");
		}

}
