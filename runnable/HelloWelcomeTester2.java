package com.xworkz.runnable;

public class HelloWelcomeTester2 {

	public static void main(String[] args) {
		
		 System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
			
		
		Hello h5 = new Hello();
		Thread t1 = new Thread(h5);
		t1.start();
		
		
		Welcome w10 = new Welcome();
		Thread t2 = new Thread(w10);
		t2.start();
		
		 System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
			
		
		
	}

}
