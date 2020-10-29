package com.xworkz.Functionalinterfacelibraries.assignment;

import java.util.function.Consumer;

public class ConsumerFI {

	public static void main(String[] args) {
		
		Consumer<String>printName=(str)->System.out.println("the enter name is:"+str);
		printName.accept("Ashwini");
	}

}
