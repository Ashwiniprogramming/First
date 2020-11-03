package com.xworkz.collectionconcept.ArrayList;

import java.util.ArrayList;

public class CollectionExample {

	public static void main(String[] args) {


		ArrayList value = new ArrayList<>();
		value.add("name");
		value.add(20);
		value.add(true);
		value.add(30.00);
		value.add(null);
		
		System.out.println(value);
		System.out.println("is collection empty: "  +value.isEmpty());//check collection is empty
		System.out.println("size of collection:" +value.size());//check no of element in collection
		System.out.println("remove 30.0 element from colloection: " +value.remove(30.0));//remove the element
		System.out.println(value);
		System.out.println("size of collection: " +value.size());
		System.out.println("does arraylist have 5:  " +value.contains(5));
	}

}
