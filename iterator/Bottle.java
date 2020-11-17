package com.xworkz.iterator;

public class Bottle {
	
	private String brand;
	private double price;
	private String material;
	
	
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


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public Bottle(String brand, double price, String material) {
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
	}


	@Override
	public String toString() {
		return "Bottle [brand=" + brand + ", price=" + price + ", material=" + material + "]";
	}
	
	
	
	

}
