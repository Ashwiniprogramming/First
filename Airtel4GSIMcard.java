package com.xworkz.interfaceconcept.assignment;

public class Airtel4GSIMcard extends AirtelSIMcard{
	
	
	@Override
      public void networkconnection() {
		System.out.println("for mobile network connection");
	}
	
	
	
	@Override
	public void internetservices() {
		System.out.println("for mobile airtel SIM internet services ");
		
	}
	
	public void internetpackages() {
		System.out.println("Airtel SIM internet packages");
	}


	public void displaydetails() {
		System.out.println("name:" + name + "price: " + price);
	}
	
	

}
