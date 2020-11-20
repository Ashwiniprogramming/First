package com.xworkz.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AdharNumber {

	public static void main(String[] args) {
		
		//AdharNumber=PersonName
		LinkedHashMap<Integer,String> adharnumber = new LinkedHashMap<Integer,String>();
		
		adharnumber.put(12356,"Ashwini");
		adharnumber.put(56238, "Divya");
		adharnumber.put(32564, "Amiksha");
		adharnumber.put(45678, "Gagana");
		
		System.out.println(adharnumber);
		
		//corresponding key value will be displayed
		System.out.println("Adharnumber person name is:" + adharnumber.get(12356));
		System.out.println("Adharnumber person name is:" + adharnumber.get(32564));
		System.out.println("Adharnumber person name is:" + adharnumber.get(56238));
		System.out.println("Adharnumber person name is:" + adharnumber.get(45678));
		
		
		//Traversing
		Set<Entry<Integer,String>> entry = adharnumber.entrySet();
		for(Entry<Integer,String> e : entry) {
			System.out.println("key: " + e.getKey() + " value: " + e.getValue());
		}
		
		
	}

}
