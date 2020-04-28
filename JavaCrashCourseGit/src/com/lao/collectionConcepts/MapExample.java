package com.lao.collectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(84, "Ragu");
		hashMap.put(4, "Vaish");
		hashMap.put(2, "Rakshana");
		hashMap.put(9, "Mohan");
		hashMap.put(123, "Vaijayanthi");
		hashMap.put(12, "Seenu");
		System.out.println(hashMap);
		System.out.println("==============");
		
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(84, "Ragu");
		linkedHashMap.put(4, "Vaish");
		linkedHashMap.put(2, "Rakshana");
		linkedHashMap.put(9, "Mohan");
		linkedHashMap.put(123, "Vaijayanthi");
		linkedHashMap.put(12, "Seenu");
		System.out.println(linkedHashMap);
		System.out.println("==============");

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(84, "Ragu");
		treeMap.put(4, "Vaish");
		treeMap.put(2, "Rakshana");
		treeMap.put(9, "Mohan");
		treeMap.put(123, "Vaijayanthi");
		treeMap.put(12, "Seenu");
		System.out.println(treeMap);
	}

}
