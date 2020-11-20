package com.xworkz.TreeMap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Months {

	public static void main(String[] args) {
		
		//Months=NumberofDays
		TreeMap<String,Integer> months = new TreeMap<String,Integer>();
		months.put("January", 31);
		months.put("February",28 );
		months.put("March", 31);
		months.put("April",30);
		months.put("May",31);
		months.put("June", 30);
		months.put("july",31);
		months.put("August", 30);
		months.put("September", 30);
		months.put("October", 31);
		months.put("November", 30);
		months.put("December", 31);
		
		System.out.println(months);
		
		
		//Traversing
		System.out.println("Traversing using keyset");
		Set<String> keyset =months.keySet();
		for(String i : keyset) {
			System.out.println("Key: " + i +  "Value: "  + months.get(i));
			
		}
		
		//Traversing
		System.out.println("Traversing using entryset");
		Set<Entry<String,Integer>> entry = months.entrySet();
		for(Entry<String,Integer> e : entry) {
			System.out.println("Key: " + e.getKey() +  " Value: "  + e.getValue() );
		}
		
		//Traversing
		System.out.println("Traversing using foreach method");
		months.forEach((k,v)->System.out.println("Key: " + k +  " Value: " + v));
		

	}

}
