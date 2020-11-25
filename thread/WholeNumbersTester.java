package com.xworkz.thread;

public class WholeNumbersTester {

	public static void main(String[] args) {
		
		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: "+ Thread.currentThread().getName());
        
		WholeNumber1to50 wn1= new WholeNumber1to50();
		wn1.start();
		
		WholeNumber51to100 wn2= new WholeNumber51to100();
		wn2.start();
		
		System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
        
	}

}
