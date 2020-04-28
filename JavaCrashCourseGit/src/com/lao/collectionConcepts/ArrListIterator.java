package com.lao.collectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrListIterator {

	public static void main(String[] args) {
		
		List<String> arrList3 = new ArrayList<String>();
		arrList3.add("Ragu");
		arrList3.add("Karthik");
		arrList3.add("Yogesh");
		arrList3.add("Maruthi");
		arrList3.add("Prakash");
		arrList3.add("Mani");
		arrList3.add("Senthil");
		arrList3.add("Balaji");
		System.out.println("Adding to the list");
		System.out.println(arrList3);
		
		System.out.println("For Loop");
		for (int i=0;i<arrList3.size();i++)
		{
			System.out.println(arrList3.get(i));
		}
		
		System.out.println("For each loop");
		for (String string : arrList3) {
			System.out.println(string);
		}

		System.out.println("List Iterator");
		ListIterator<String> iterator1 = arrList3.listIterator();
		while (iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		System.out.println("List Iterator - Reverse");
		while (iterator1.hasPrevious())
		{
			System.out.println(iterator1.previous());
		}
		
		System.out.println("Iterator");
		Iterator<String> iterator2 = arrList3.listIterator();
		while (iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
		
	}

}
