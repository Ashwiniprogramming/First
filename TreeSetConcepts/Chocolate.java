package com.xworkz.TreeSetConcepts;

public class Chocolate {

	private String brand;
	private int price;
	private String type;
	
	public Chocolate(String brand, int price, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Chocolate [brand=" + brand + ", price=" + price + ", type=" + type + "]";
	}
	
	

}


