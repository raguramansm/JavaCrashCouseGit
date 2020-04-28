package com.lao.inheritanceConcepts;

public class Car extends Vehicles{
	
	private static String spl = "AC";
	
	public static void main(String[] args) {
		Vehicles obj = new Vehicles();
		obj.transport();
		
		System.out.println(spl);
	}

}
