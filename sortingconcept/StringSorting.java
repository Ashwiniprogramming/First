package com.xworkz.collectionconcept.sortingconcept;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorting {

	public static void main(String[] args) {
		
		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Surabhi");
		Names.add("Ashwini");
		Names.add("Rashmi");
		Names.add("Keerthana");
		Names.add("Namitha");
		
		System.out.println("Before sorting:" +Names);
		
		Collections.sort(Names);
		
		System.out.println("After sorting:" +Names);
		
	}

}
