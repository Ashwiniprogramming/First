package com.xworkz.collectionconcept.sortingconcept;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTester {

	public static void main(String[] args) {

            Country c1 = new Country(28 , "India" , +91);
            Country c2 = new Country( 6  , "Australia", +61 );
            Country c3 = new Country( 34   ,"China", +86);
            Country c4 = new Country( 26 , "Switzerland", +41);
            Country c5 = new Country( 47 , "Japan" , +81);
	
	        ArrayList<Country> CountryAL = new ArrayList<Country>();
	        CountryAL.add(c1);
	        CountryAL.add(c2);
	        CountryAL.add(c3);
	        CountryAL.add(c4);
	        CountryAL.add(c5);
	        
	        for(Country c : CountryAL) {
	        	
	        	System.out.println(c);
	        }
	        
	        System.out.println("Before Sorting:" +CountryAL );
	        
	        Collections.sort(CountryAL,Collections.reverseOrder());
	
	        System.out.println("After Sorting:" +CountryAL);
	}
	
	

}
