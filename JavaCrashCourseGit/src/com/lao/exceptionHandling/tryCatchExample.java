package com.lao.exceptionHandling;

public class tryCatchExample {

	public static void main(String[] args) {
		try {
			String [] array = new String [5];
			System.out.println(array.length);
			System.out.println(array [6]);
		} catch (Exception e) {
			//e.printStackTrace(); // This will print the exception
			System.out.println("Oops, something went wrong");
		}
		
		finally {
			System.out.println("Finally block");
		}
	}

}
