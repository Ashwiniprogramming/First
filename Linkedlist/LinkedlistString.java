package com.xworkz.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistString {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new  LinkedList<String>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.addFirst("Guva");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		fruits.offer("Banana");
		fruits.add("Strawberry");
		System.out.println(fruits);
		
		System.out.println("------------------------------");
		
		System.out.println("Traversing using iterator");
		Iterator<String> fruitr = fruits.iterator();
		while(fruitr.hasNext()) {
			System.out.println(fruitr.next());
		}
		System.out.println("------------------------------");
		
		System.out.println("Traversing using listiterator");
		ListIterator<String> frulitr = fruits.listIterator();
		while(frulitr.hasNext()) {
			System.out.println(frulitr.next());
		}
		while(frulitr.hasPrevious()) {
			System.out.println(frulitr.previous());
		}
		System.out.println("------------------------------");
		
		System.out.println("Displaying 1st element:" +fruits.peek());
		System.out.println("------------------------------");
		System.out.println("Displaying 1st element:" +fruits.getFirst());
		System.out.println("------------------------------");
		System.out.println("Displaying last element:" +fruits.getLast());
		System.out.println("------------------------------");
		System.out.println("Displaying 1st element:" +fruits.element());
		
		//remove,removeall,poll,pollfirst,polllast,pop,push
		
		System.out.println(fruits.remove());
		System.out.println("------------------------------");
		System.out.println(fruits.poll());
		System.out.println("------------------------------");
		System.out.println(fruits.pollFirst());
		System.out.println("------------------------------");
		System.out.println(fruits.pollLast());
		System.out.println("------------------------------");
		System.out.println(fruits.pop());
		System.out.println("------------------------------");
		fruits.push("Watermelon");
		System.out.println(fruits);
		System.out.println("------------------------------");
		fruits.removeAll(fruits);
		System.out.println(fruits);
	
	}

}
