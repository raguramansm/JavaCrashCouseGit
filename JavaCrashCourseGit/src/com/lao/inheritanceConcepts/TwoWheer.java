package com.lao.inheritanceConcepts;

public class TwoWheer extends Vehicles{
	
	int spl_wheels = 3;
	public String type;
	
	public void type1()
	{
		System.out.println("Gents bike");
	}
	
	public void type2()
	{
		System.out.println("Ladies bike");
	}
	
	public static void main(String[] args) 
	{
		TwoWheer obj = new TwoWheer();
		obj.drive();
		System.out.println(obj.bike_wheels);
		System.out.println(obj.spl_wheels);
	}

}
