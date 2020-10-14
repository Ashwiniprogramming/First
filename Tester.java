package com.xworkz.methodoverride.assignment;


public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("display the overriden method in child class");
		Bangles G=new GoldBangles();
	      G.usedforbride();
		  G.material();
		System.out.println("display the parent class method");
		Bangles B =new Bangles();
		  G.usedforbride();
		   G.material();
		

	}


}
