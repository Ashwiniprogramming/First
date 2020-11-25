package com.xworkz.thread;

import java.util.ArrayList;

public class Names implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ashwini");
		names.add("Surabhi");
		names.add("Rashmi");
		names.add("Divya");
		names.add("Amiksha");
		names.add("Priya");
		names.add("Swathi");
		System.out.println(names);
		
		System.out.println("Traversing using Foreachloop");
		for(String i : names) {
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
