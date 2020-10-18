package com.xworkz.abstraction.assignment;

public class LenovoLaptop extends Laptop{
	
	int RAM;
	String Operatingsystem;
	double Price;
	
	@Override
	
	void videocall() {
		System.out.println("laptop is used for video call purpose ");
		
	}
	
	@Override
	void powerpoint() {
		System.out.println("used for preparing presentation slides");
	}
	@Override
	void displaydetails() {
		System.out.println("Brand: "+Brand+    "Processor: "+Processor+   "RAM: "+RAM+   "Operatingsystem: "+Operatingsystem+    "Price: " +Price);
	}

}
