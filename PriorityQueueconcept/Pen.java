package com.xworkz.PriorityQueueconcept;

public class Pen implements Comparable<Pen> {
	
	private String brand;
	private double price;
	private String color;
	
	
	public Pen(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
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
		return "Pen [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}


	@Override
	public int compareTo(Pen o) {
		int res=this.brand.compareTo(o.brand);
		return res;
	}
	
	
	

}
