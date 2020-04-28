package com.lao.exceptionHandling;

public class UncheckedExceptionEx2 {

	public static void main(String[] args) {
		String [] array = new String [5];
		System.out.println(array.length);
		System.out.println(array [6]);  // It will throw Array Index Out Of Bounds Exception, as we are trying to print 6th element of array
	}  

}
