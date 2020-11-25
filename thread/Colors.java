package com.xworkz.thread;

import java.util.ArrayList;

public class Colors implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		
		
		ArrayList<String> clrs = new ArrayList<String> ();
		clrs.add("Pink");
		clrs.add("Red");
		clrs.add("Yellow");
		clrs.add("Blue");
		clrs.add("Black");
		clrs.add("White");
		clrs.add("Voilet");
		System.out.println(clrs);
		
		System.out.println("Traversing using Foreachloop");
		for(String i : clrs) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
			
		
		
		
	}
	
	

}
