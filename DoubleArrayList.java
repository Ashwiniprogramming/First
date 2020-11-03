package com.xworkz.collectionconcept.ArrayList;

import java.util.ArrayList;

public class DoubleArrayList {

	public static void main(String[] args) {
		
		ArrayList<Double> values = new ArrayList<Double>();
		values.add(52.63);
		values.add(56.8);
		values.add(2,56.23);//add 3rd element as 56.23
		values.add(54.23);
		values.add(25.6);
		values.add(45.32);
		
		System.out.println("Double values are: " +values);
		System.out.println("Size of arraylist:" +values.size());//display size of arraylist
		
		//For loop
				for(int i=0;i<values.size();i++) {
					System.out.println(values.get(i));
					
				}
		System.out.println("=======================================");		
	  //enhanced for loop
				for(Double k : values) {
					System.out.println(k);
				}
				
		System.out.println("last element: " +values.get(5));//display the last element
		
		values.remove(new Double(52.63));//remove the first element
		System.out.println("the double vales of Arraylist:" +values);
		
		values.remove(new Double(56.23));//remove 56.23
		System.out.println("the double vales of Arraylist:" +values);
		
		
	}

}
