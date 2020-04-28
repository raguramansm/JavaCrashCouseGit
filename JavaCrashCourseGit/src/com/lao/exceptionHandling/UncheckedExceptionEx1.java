package com.lao.exceptionHandling;

public class UncheckedExceptionEx1 {

	static String name=null;
	
	public static void main(String[] args) {
		System.out.println(name.length());  // On running the program, It will throw null pointer exception as name is not contains any values.
	
	}

}
