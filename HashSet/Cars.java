package com.xworkz.HashSet;

public class Cars {
	
	private String company;
	private double price;
	private String color;
	
	
	public Cars(String company, double price, String color) {
		super();
		this.company = company;
		this.price = price;
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Cars [company=" + company + ", price=" + price + ", color=" + color + "]";
	}
	
	

}
