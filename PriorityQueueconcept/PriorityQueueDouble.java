package com.xworkz.PriorityQueueconcept;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueDouble {

	public static void main(String[] args) {
		
		ArrayList<Double> doubleAL = new ArrayList<Double>();
		doubleAL.add(4.5);
		doubleAL.add(6.0);
		doubleAL.add(5.5);
		doubleAL.add(4.0);
		doubleAL.add(5.0);
		
		PriorityQueue<Double> queue = new PriorityQueue<Double>();
		queue.add(2.5);
		queue.add(1.5);
		queue.add(3.0);
		queue.add(1.0);
		queue.add(2.0);
		queue.addAll(doubleAL);
		
		
		System.out.println(queue);
		
		for(Double P : queue) {
			System.out.println(queue);
		}
		System.out.println("peek of first element: " + queue.peek());
		System.out.println("poll of first element: " +queue.poll());
		System.out.println(queue);
		
		queue.offer(3.5);
		System.out.println(queue);//similar to add
		
		System.out.println("element of queue: " + queue.element());
	    System.out.println(queue);

	    queue.remove();
	    System.out.println(queue);
	    
	    queue.removeAll(doubleAL);
	    System.out.println(queue);
	    
	    queue.clear();
	    System.out.println(queue);

	}

}
