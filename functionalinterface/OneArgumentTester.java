package com.xworkz.functionalinterface;

public class OneArgumentTester {

	public static void main(String[] args) {
		
		OneArgumentFI onearg=(int a)->{
			
			System.out.println("the value is :"+(a+5));
			return a;
			
		};
		onearg.incrementByFive(5);
	}

}
