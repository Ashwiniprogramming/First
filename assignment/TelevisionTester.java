package com.xworkz.This.assignment;

public class TelevisionTester {
	String  typesofscreen;
	

	public static void main(String[] args) {
		
		Television television =new Television();
        television.company="Sony";
        television.price=40000.00;
        television.inches=40;
        television.displaydetails();
        //system.out.println(this.typeofscreen);//this cannot be used
	}
	
	void method() {
		System.out.println(this.typesofscreen);
	}

}
