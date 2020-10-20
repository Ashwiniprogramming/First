package com.xworkz.accessmodifires.assignment;


public class ElectricSwitches extends Switches {
	
	String color;
	//we cannot override the private method
	
	@Override
	public void off() {
		System.out.println("Switch off the power");
    	
	}
	@Override
     protected void quailty() {
		System.out.println("quality of switch");
    }
	@Override
	public void costofswitch() {
		System.out.println("cost of switch");
	}
	 public void displaydetails() {
	    	System.out.println("price: "+price+  "color: "+color);
}
	 
}
