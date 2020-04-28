package com.lao.collectionConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> obj1 = new LinkedList<Integer>();
		obj1.add(10);
		obj1.add(15);
		obj1.add(20);
		obj1.add(25);
		obj1.add(30);
		System.out.println(obj1);

		LinkedList<Integer> obj2 = new LinkedList<Integer>();
		obj2.addAll(obj1);
		System.out.println(obj2);

		System.out.println(obj1.get(3));
		System.out.println(obj1.getFirst());
		System.out.println(obj1.getLast());

		obj1.addFirst(5);
		obj1.addLast(35);
		System.out.println(obj1);
		
		
		System.out.println("-----------------");
		Object obj3 = obj1.clone();
		System.out.println(obj3);
		
		
		System.out.println("-----------------");

		obj1.poll();
		System.out.println(obj1);
		
		obj1.pollFirst();
		System.out.println(obj1);

		obj1.pollLast();
		System.out.println(obj1);
		
		obj1.remove();
		System.out.println(obj1);
		
		obj1.removeFirst();
		System.out.println(obj1);

		obj1.removeLast();
		System.out.println(obj1);
		
		Iterator<Integer> obj4 = obj2.iterator();
		while (obj4.hasNext())
		{
			System.out.println(obj4.next());
		}

	}

}
