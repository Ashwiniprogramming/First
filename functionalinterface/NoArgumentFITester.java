package com.xworkz.functionalinterface;

public class NoArgumentFITester {

	public static void main(String[] args) {
		
		//lambda expressions
		NoArgumentFI noargu=()->{
			System.out.println("Hello World");
			return null;
		};
		noargu.PrintHello();
	}

}
