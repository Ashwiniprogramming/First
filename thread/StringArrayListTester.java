package com.xworkz.thread;

public class StringArrayListTester {

	public static void main(String[] args) {
		
		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		
		Colors clrs = new Colors();
		Thread t1 = new Thread(clrs);
        t1.start();
        
        Names names = new Names();
		Thread t2 = new Thread(names);
        t2.start();
        
        System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		
        
	}

}
