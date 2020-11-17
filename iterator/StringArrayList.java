package com.xworkz.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StringArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> weekdays = new ArrayList<String>();
		
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		
		System.out.println("Weeks:" +weekdays);
		
		System.out.println("===========================");
		
		for(String m:weekdays) {
			
			System.out.println(m);
		}
		System.out.println("===========================");
		
		
		
		
		Iterator<String> itr = weekdays.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
			//if(weekdays.get(0).equals("Monday")){
			//	itr.remove();
				//System.out.println("Removed:" +weekdays.get(0));
				
			//}
		}
		System.out.println("the final array list:");
		System.out.println(weekdays);
		
		System.out.println("Iterating using List iterator");
		ListIterator<String> litr = weekdays.listIterator();
		while(litr.hasNext()) {
			String str= litr.next();
			System.out.println(str);
		}
		System.out.println("==============");
		while(litr.hasPrevious()) {
			String str = litr.previous();
			System.out.println(str);

			}
		

	}

}
