package com.lao.polymorphism;

public class Overloading {
	
	public void operation(int a) 
	{
		System.out.println(a);
	}
	
	public void operation(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public void operation(String FN, String LN)
	{
		System.out.println(FN+LN);
	}

	public static void main(String[] args) {
	
		Overloading obj = new Overloading();
		obj.operation(5);
		obj.operation(6, 4);
		obj.operation("Ragu", "Raman");
		
	}

}
