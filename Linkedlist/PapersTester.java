package com.xworkz.Linkedlist;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PapersTester {

	

	public static void main(String[] args) {
		
		LinkedList<Papers> papersal = new LinkedList<Papers>();
		
		Papers p1 = new Papers("A4",1.2,"ruled");
		Papers p2 = new Papers("A3",1.3,"unruled");
		Papers p3 = new Papers("A4",1.2,"ruled");
		Papers p4 = new Papers("A5",1.5,"unruled");
		
		papersal.addFirst(p3);
		papersal.add(p4);
		papersal.addLast(p2);
		papersal.offer(p1);
		
       System.out.println(papersal);
		
		System.out.println("------------------------------");
		System.out.println("Traversing using foreachloop");
		for(Papers p : papersal) {
			System.out.println(p);
		}
		System.out.println("------------------------------");
		
		System.out.println("Traversing using Iterator");
		Iterator<Papers> papitr =papersal.iterator();
		while(papitr.hasNext()) {
			System.out.println(papitr.next());
		}
      System.out.println("------------------------------");
		
		System.out.println("Traversing using listiterator");
		ListIterator<Papers> paplitr = papersal.listIterator();
		while(paplitr.hasNext()) {
			System.out.println(paplitr.next());
		}
		while(paplitr.hasPrevious()) {
			System.out.println(paplitr.previous());
		}
		System.out.println("------------------------------");
		
		System.out.println("Displaying 1st element:" +papersal.peek());
		System.out.println("------------------------------");
		System.out.println("Displaying 1st element:" +papersal.getFirst());
		System.out.println("------------------------------");
		System.out.println("Displaying last element:" +papersal.getLast());
		System.out.println("------------------------------");
		System.out.println("Displaying 1st element:" +papersal.element());
		
		//remove,removeall,poll,pollfirst,polllast,pop,push
		
		System.out.println(papersal.remove());
		System.out.println("------------------------------");
		System.out.println(papersal.poll());
		System.out.println(papersal);
		System.out.println("------------------------------");
		System.out.println(papersal.pollFirst());
		System.out.println("------------------------------");
		System.out.println(papersal.pollLast());
		System.out.println("------------------------------");
		System.out.println(papersal);
		System.out.println(papersal.pop());
		System.out.println("------------------------------");
		papersal.removeAll(papersal);
		System.out.println(papersal);
	
	}




}

