package com.xworkz.methodoverride.assignment;

public class GoldBangles extends Bangles{

	int price ;
	String color;
	String type;
	
	public GoldBangles() {
		
	}
	public GoldBangles(int inprice,String incolor,String intype) {
		price=inprice;
		color=incolor;
		type=intype;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public void usedforbride() {
		System.out.println("bride wear bangles in marriage");
	}
	@Override
	public void material() {
		System.out.println("bangles made up of gold");
	
		
		
	}
	

}




