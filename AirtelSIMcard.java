package com.xworkz.interfaceconcept.assignment;

public abstract class AirtelSIMcard implements SIMcard {
	
	String name;
	int price;
	
	
	public void networkconnection() {
		System.out.println("for mobile network connection");
	}
	
	public void internetservices() {
		System.out.println("for mobile internet services ");
		
	}
	
	abstract public void internetpackages();
	
	abstract public void displaydetails();
	

}
