package com.xworkz.abstraction.assignment;

public abstract class Laptop {
	
	String Brand;
	String Processor;
	
	abstract void videocall();
	abstract void powerpoint();
	
	
	void officeworks() {
		
		System.out.println("used for  office work");
	}
	void displaydetails() {
		System.out.println("Brand:  "+Brand +        "Processor:  "+Processor);
	}

}
