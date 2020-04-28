package com.lao.staticKeyword;

public class staticBlock {

	static // 1. Static block can be written. This will execute first before Main method.  
	{
		System.out.println("Static block 1");
	}
	
	static // 2. This static block will be executed next
	{
		System.out.println("Static block 2");
	}
	
	public static void main(String[] args) {  // 5. Main method will be executed after all static block execution
		System.out.println("Main method");
	}
	
	static // 3. Next static block
	{
		System.out.println("Static block 3");
	}
	
	static // 4. Next static block
	{
		System.out.println("Static block 4");
	}

}
