package com.lao.abstractionConcepts;

public class Bmw extends Car{
	
	@Override
	public void engineSecret()
	{
		System.out.println("BMW engine secret");
	}

	@Override
	public void companyValut()
	{
		System.out.println("BMW company vault");
	}

	public static void main(String[] args) {
		Car obj = new Bmw();  // Parent reference, Child object
		obj.companyValut();
		obj.engineSecret();
		
	}

}
