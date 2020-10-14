package com.xworkz.methodoverride.assignment;



public class Tester2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("display the overriden method in child class");
		
	    Teacher M1=new MathTeacher ();
		M1.duty();
		M1.givingtest();
		System.out.println("display the parent class method");
		Teacher T =new Teacher();
		T.duty();
		T.givingtest();
		T.supportforlearning();
		
		

	}


}
