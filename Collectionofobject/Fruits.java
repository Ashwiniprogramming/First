package com.xworkz.collectionconcept.Collectionofobject;

public class Fruits {

	private String fruitname;
	private int price;
	private double weight;
	
	public Fruits(String fruitname, int price, double weight) {
		super();
		this.fruitname = fruitname;
		this.price = price;
		this.weight = weight;
		
	}

	public String getFruitname() {
		return fruitname;
	}

	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Fruits [fruitname=" + fruitname + ", price=" + price + ", weight=" + weight + "]";
	}
	
	
}


