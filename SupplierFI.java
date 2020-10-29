package com.xworkz.Functionalinterfacelibraries.assignment;

import java.util.function.Supplier;

public class SupplierFI {

	public static void main(String[] args) {
		
		//T get()
		
		Supplier <String>  a=()->"Ashwini";
		System.out.println(a.get());

	}

}
