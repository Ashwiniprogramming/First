package com.xworkz.mutipleinheritanceinbothclassandinterface;

public class Person extends Singer implements Dancer{

	@Override
	public void facereaction() {
		System.out.println("dancer have good face reaction while dancing");
	}

	@Override
	public void dancingsteps() {
		System.out.println("dancer practices steps for dance function");
	}

}
