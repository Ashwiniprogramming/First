package com.xworkz.mutipleinheritanceindefaultmethod;

public interface Car {
	
	void steering();
	void price();
	
	default void moving() { //default method
		System.out.println("car will be moving");
	}

}
