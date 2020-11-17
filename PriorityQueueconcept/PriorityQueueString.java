package com.xworkz.PriorityQueueconcept;

import java.util.PriorityQueue;

public class PriorityQueueString {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Rashmi");
		queue.add("Ashwini");
		queue.add("Surabhi");
		queue.add("Priya");
		queue.add("Divya");
		
		
		System.out.println(queue);
		
		for(String P : queue) {
			System.out.println(queue);
		}
		System.out.println("peek of first element: " + queue.peek());
		System.out.println("poll of first element: " +queue.poll());
		System.out.println(queue);
		
		queue.offer("Baby");
		System.out.println(queue);//similar to add
		
		System.out.println("element of queue: " + queue.element());
	    System.out.println(queue);

	    queue.remove();
	    System.out.println(queue);


	}

}
