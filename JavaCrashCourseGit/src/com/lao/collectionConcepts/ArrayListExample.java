package com.lao.collectionConcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> arrList1 = new ArrayList<String>();
		arrList1.add("Honda");
		arrList1.add("Toyota");
		arrList1.add("Benz");
		arrList1.add("BMW");
		arrList1.add("BMW");
		arrList1.add("Chevy");
		arrList1.add("Audi");
		arrList1.add("Lexus");
		System.out.println(arrList1);
		
		Object[] arr = arrList1.toArray(); 
		for (Object object : arr) {
			System.out.println(object);
		}
		
		List<String> arrList2 = new ArrayList<String>();
		arrList2.addAll(arrList1);
		System.out.println(arrList2);
		
		System.out.println(arrList1.get(3));
		
		arrList2.clear();
		System.out.println(arrList2);
		
		arrList1.remove(3);
		System.out.println(arrList1);
				
	}

}
