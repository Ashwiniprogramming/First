package com.xworkz.exceptionhandlingassignment;

public class Exceptionpropogation {

	public static void main(String[] args) {
	
		Exceptionpropogation ep=new Exceptionpropogation();
		ep.p();
		ep.m();
	
		

	}
	
	void m() {
		
		System.out.println("in method m");
		
	}
	void n() {
		System.out.println("in method n");
		m();
		
	}
	void p() {
		System.out.println("in method p");
		
				
	}
	

}
