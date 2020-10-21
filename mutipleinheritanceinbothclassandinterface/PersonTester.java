package com.xworkz.mutipleinheritanceinbothclassandinterface;

public class PersonTester {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.singing();
		person.voice();
		person.facereaction();
		person.dancingsteps();
		
		System.out.println("============================================");
		Singer singer = new Person();//upcasting
		singer.voice();
		singer.singing();
		
		System.out.println("============================================");
		Dancer dancer = new Person();
		dancer.dancingsteps();
		dancer.facereaction();

		
	}

}
