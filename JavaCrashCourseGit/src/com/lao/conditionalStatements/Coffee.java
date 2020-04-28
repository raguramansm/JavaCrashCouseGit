package com.lao.conditionalStatements;

public class Coffee {
	
	boolean isEmpty = true; // Default value is false

	public static void main(String[] args) {
		
		Coffee obj = new Coffee();
		if (obj.isEmpty)
		{
			System.out.println("Fill the coffee");
		}
		else
		{
			System.out.println("Drink the coffee");
		}

	}

}
