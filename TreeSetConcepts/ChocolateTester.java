package com.xworkz.TreeSetConcepts;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ChocolateTester {

	public static void main(String[] args) {
		
		Comparator<Chocolate> comp = (o1,o2)->{
			return o1.getBrand().compareTo(o2.getBrand());
		};
		
		TreeSet<Chocolate> chocoal = new TreeSet<Chocolate>(comp);
		
		Chocolate c1 = new Chocolate("Dairymilk",20,"milk choco");
		Chocolate c2 = new Chocolate("Milkybar",30,"white choco");
		Chocolate c3 = new Chocolate("Fivestar",25,"caramel choco");
		Chocolate c4 = new Chocolate("KitKat",15,"Dark choco");
		
		chocoal.add(c1);
		chocoal.add(c2);
		chocoal.add(c3);
		chocoal.add(c4);
		System.out.println(chocoal);
        System.out.println("------------------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<Chocolate> chitr = chocoal.iterator();
		while(chitr.hasNext()) {
			System.out.println(chitr.next());
		}
		System.out.println("------------------------------");
		
		System.out.println("Traversing using descendingiterator");
		Iterator<Chocolate> chlitr = chocoal.descendingIterator();
		while(chlitr.hasNext()) {
			System.out.println(chlitr.next());
		}
      System.out.println("------------------------------");
		
		//floor,ceiling,first,last,pollfirst,polllast
      
		System.out.println(chocoal.floor(c2));
		System.out.println("------------------------------");
		System.out.println(chocoal.ceiling(c3));
		System.out.println("------------------------------");
		System.out.println(chocoal.first());
		System.out.println("------------------------------");
		System.out.println(chocoal.last());
		System.out.println("------------------------------");
		System.out.println(chocoal.pollFirst());
		System.out.println("------------------------------");
		System.out.println(chocoal.pollLast());
		

	}

		

		


	}


