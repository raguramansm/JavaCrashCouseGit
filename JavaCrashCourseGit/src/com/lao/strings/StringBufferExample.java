package com.lao.strings;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		System.out.println("I am executing String");
		String name1= "Rakshana";
		System.out.println(name1.concat(" Raguraman"));
		System.out.println(name1);  // String is immutable
		
		System.out.println("I am executing String Buffer");
		StringBuffer name2 = new StringBuffer("Rakshana");
		System.out.println(name2.append(" Raguraman"));
		System.out.println(name2); // String Buffer is mutable
		
		
		System.out.println(name2.capacity());
		
		System.out.println(name2.reverse());
		
		System.out.println(name2.subSequence(2, 8));
		
		System.out.println(name2.insert(2, "H"));
	}

}
