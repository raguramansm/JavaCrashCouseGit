package com.lao.looping;

public class forEachLoop {

	public static void main(String[] args) {
		
		String[] arrData = {"alpha","beta","gamma","delta","sigma"};
		int l = arrData.length;
		
		System.out.println("Conventional for Loop");
		for (int i = 0;i<l;i++)
		{
			System.out.println(arrData[i]);
		}
		
		System.out.println("\nEnhanced for Loop or foreach loop");
		for (String obj : arrData) {
			System.out.println(obj);
		}
	}

}
