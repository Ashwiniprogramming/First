package com.xworkz.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {


		HashSet<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Pink");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Black");
		colors.add("Yellow");
		System.out.println(colors);
		
		System.out.println("-----------------");
		
		System.out.println("Traversing using foreach");
		colors.forEach((m)->System.out.println(m));
		System.out.println("-----------------");
		
		System.out.println("Traversing using iterator");
		Iterator<String> colitr = colors.iterator();
		while(colitr.hasNext()) {
			System.out.println(colitr.next());
		}

	}

}
