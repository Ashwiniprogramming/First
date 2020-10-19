package com.xworkz.interfaceconcept.assignment;

public class Airtel4GSIMcardTester {
	
	public static void main(String[] args) {
	
	System.out.println("Child class");
	Airtel4GSIMcard airtel4Gsim=new Airtel4GSIMcard();
	airtel4Gsim.name = "Airtel sim";
	airtel4Gsim.price= 50;
	airtel4Gsim.networkconnection();
	airtel4Gsim.internetservices();
	airtel4Gsim.internetpackages();
	airtel4Gsim.displaydetails();
	
	
	//System.out.println("parent class");
	//AirtelSIMcard airtelsimcard = new Airtel4GSIMcard();
	//airtelsimcard.name="Airtel 4G sim";
	//airtelsimcard.price=52;
	//airtelsimcard.displaydetails();


	}
}
