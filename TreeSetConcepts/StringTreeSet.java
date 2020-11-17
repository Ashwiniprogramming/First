package com.xworkz.TreeSetConcepts;

import java.util.Iterator;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> months = new TreeSet<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("june");
		System.out.println(months);
		System.out.println("------------------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<String> mitr = months.iterator();
		while(mitr.hasNext()) {
			System.out.println(mitr.next());
		}
		System.out.println("------------------------------");
		
		System.out.println("Traversing using descendingiterator");
		Iterator<String> mlitr = months.descendingIterator();
		while(mlitr.hasNext()) {
			System.out.println(mlitr.next());
		}
		
		System.out.println("------------------------------");
		
		//floor,ceiling,first,last,pollfirst,polllast
		System.out.println(months.floor("july"));
		System.out.println("------------------------------");
		System.out.println(months.ceiling("August"));
		System.out.println("------------------------------");
		System.out.println(months.first());
		System.out.println("------------------------------");
		System.out.println(months.last());
		System.out.println("------------------------------");
		System.out.println(months.pollFirst());
		System.out.println("------------------------------");
		System.out.println(months.pollLast());
		

	}

	}


