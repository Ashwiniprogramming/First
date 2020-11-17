package com.xworkz.linkedHashset;

public class Pencils {
	
	private String type;
	private int price;
	private boolean iscolorpencil;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getIscolorpencil() {
		return iscolorpencil;
	}
	public void setIscolorpencil(boolean iscolorpencil) {
		this.iscolorpencil = iscolorpencil;
	}
	public Pencils(String type, int price, boolean iscolorpencil) {
		super();
		this.type = type;
		this.price = price;
		this.iscolorpencil = iscolorpencil;
	}
	
	@Override
	public String toString() {
		return "Pencils [type=" + type + ", price=" + price + ", iscolorpencil=" + iscolorpencil + "]";
	}
	
	

}
