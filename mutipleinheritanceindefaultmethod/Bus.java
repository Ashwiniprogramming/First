package com.xworkz.mutipleinheritanceindefaultmethod;

public interface Bus {
	
	void breaking();
	
	
	default void moving() { // default method
	System.out.println("bus will be moving");
	}

}
