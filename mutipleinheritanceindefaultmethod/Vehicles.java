package com.xworkz.mutipleinheritanceindefaultmethod;

public class Vehicles implements Car,Bus {
	
	//Overriding the default method 
	
	@Override
	public void moving() {
		
		//use super keyword to call the method moving 
		//method of car interface
		Car.super.moving();
		Bus.super.moving();//method of Bus interface
	}	
		@Override
	     public void price() {
		System.out.println("the price of car is:600000");
	}

	     @Override
	      public void breaking() {
		System.out.println("bus breaking");
	}

	     @Override
	     public void steering() {
		System.out.println("car steering");
	}

}
