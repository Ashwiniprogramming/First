package com.xworkz.This.assignment;

public class Television {
	
	double price;
	String company;
	int inches;
	
	public Television() {
		this(40000.00,"Sony",40);
		System.out.println("default constructor of television");
	}
	public Television(double price,String company ,int inches)
	{
		this.price=price;
		this.company=company;
		this.inches=inches;
	}
	
	public void entertainmentpurpose() {
		System.out.println("for entertainment purpose");
	}
	public void displaydetails() {
		System.out.println("price:" +this.price);
		System.out.println("company:" +this.company);
		System.out.println("inches:" +this.inches);
	}
}
