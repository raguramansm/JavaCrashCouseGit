package com.lao.strings;

public class StringExample {

	public static void main(String[] args) {
		
		String name = " Raguraman ";
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.concat(" S M"));
		
		System.out.println(name.contains("m"));
		
		System.out.println(name.contentEquals(" Raguraman "));
		
		System.out.println(name.equalsIgnoreCase(" raguraman "));
		
		System.out.println(name.indexOf("g"));
		
		System.out.println(name.toCharArray());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.substring(1));
		
		System.out.println(name.substring(1, 6));
		
		System.out.println(name.replace("a", "D"));
		
		System.out.println(name.replace("Ragu", "Seeni"));
		
		System.out.println(name.trim());
		
		System.out.println(String.join("-", "Learn", "Automation", "Online"));
		
		String text = "I-am-on-the-way";
		String [] splitted = text.split("-");
		for (String obj : splitted) {
			System.out.println(obj);
		}
	}

}
