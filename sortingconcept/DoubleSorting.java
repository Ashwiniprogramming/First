package com.xworkz.collectionconcept.sortingconcept;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleSorting {

	public static void main(String[] args) {
		
		ArrayList<Double> Numbers =new ArrayList<Double>();
		Numbers.add(1.00);
		Numbers.add(4.50);
		Numbers.add(3.00);
		Numbers.add(5.00);
		Numbers.add(4.00);
		Numbers.add(1.50);
		Numbers.add(2.00);
		Numbers.add(2.50);
		Numbers.add(3.50);
		Numbers.add(5.50);
		
       System.out.println("Before sorting:" +Numbers);
		
		 Collections.sort(Numbers);//ascending order
		 System.out.println("After sorting:" +Numbers);
		 
		 System.out.println("================================");
			
			
		 Collections.sort(Numbers,Collections.reverseOrder());//descending order
		 System.out.println("After sorting:" +Numbers);
		
		

	}

}
