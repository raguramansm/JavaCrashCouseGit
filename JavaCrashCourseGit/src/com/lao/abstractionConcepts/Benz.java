package com.lao.abstractionConcepts;

public class Benz extends Car{
	
	@Override
	public void engineSecret()
	{
		System.out.println("Benz engine secret");
	}

	@Override
	public void companyValut()
	{
		System.out.println("Benz company vault");
	}

	public static void main(String[] args) {
		Car obj = new Benz(); // Parent reference, Child object
		obj.companyValut();
		obj.engineSecret();
	}

}
