package com.xworkz.exceptionhandlingassignment;

public class Finallyblock {

	public static void main(String[] args) {
		
		int div;
		try {
			  div=10/0;
			  System.out.println("div:" +div);
		}
		catch(Exception e) {
			
			System.out.println("Exception is handled by catch");
		}
        finally {
        	
        	System.out.println("the div is printed");
        }
	}

}
