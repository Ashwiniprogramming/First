package com.xworkz.collectionconcept.Collectionofobject;

public class Sanitizers {
	
	private String brand;
	private double price;
	private boolean isalcoholbased;
	
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

	public boolean isIsalcoholbased() {
		return isalcoholbased;
	}

	public void setIsalcoholbased(boolean isalcoholbased) {
		this.isalcoholbased = isalcoholbased;
	}

	public Sanitizers(String brand, double price, boolean isalcoholbased) {
		super();
		this.brand = brand;
		this.price = price;
		this.isalcoholbased = isalcoholbased;
	}

	@Override
	public String toString() {
		return "Sanitizers [brand=" + brand + ", price=" + price + ", isalcoholbased=" + isalcoholbased + "]";
	}
	
	
	

}
