package com.xworkz.accessmodifires.assignment;

public class Switches {
	int price;
	
   private void on() {
		System.out.println("Switch on the power");
	}
     void off() {
    	System.out.println("Switch off the power");
    	
    }
    protected void quailty() {
    	System.out.println("quality of switch");
    }
    public void costofswitch() {
    	System.out.println("cost of switch");
    }
    public void displaydetails() {
    	System.out.println("price: "+price);
    }
}
