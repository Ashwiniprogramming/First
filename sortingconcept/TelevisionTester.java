package com.xworkz.collectionconcept.sortingconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TelevisionTester {

	public static void main(String[] args) {

		Television T1 = new Television("Sony" , 40 , "LED");
		Television T2 = new Television("Samsung" , 28 , "LCD");
		Television T3 = new Television("Thoshiba" , 55 , "OLED");
		Television T4 = new Television("Panasonic" , 32 , "QLED");
		
		ArrayList<Television> televisionAL = new ArrayList<Television>();
		televisionAL.add(T1);
		televisionAL.add(T2);
		televisionAL.add(T3);
		televisionAL.add(T4);
		
		for(Television T : televisionAL) {
			System.out.println(T);
		}
		System.out.println("========================================");
		
		
	    Collections.sort(televisionAL,new SortTelevisionbyInches());
	    System.out.println(televisionAL);
	    
	    System.out.println("========================================");
	    Collections.sort(televisionAL,new SortTelevisionbyBrand());
	    Collections.reverse(televisionAL);
	    System.out.println(televisionAL);
	    
	    System.out.println("========================================");
	    Collections.sort(televisionAL,new SortTelevisionbyType());
	    Collections.reverse(televisionAL);
	    System.out.println(televisionAL);
	     
	    
	}

}
