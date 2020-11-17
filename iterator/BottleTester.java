package com.xworkz.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BottleTester {

	public static void main(String[] args) {


           ArrayList<Bottle> bottleAL = new ArrayList<Bottle>();
           
           bottleAL.add(new Bottle ("Prestige" , 724.50, "Steel"));
           bottleAL.add(new Bottle ("Peacock" ,  700.00, "Stainless steel"));
           bottleAL.add(new Bottle ("Tupperware" ,739.2, "Plastic"));
           bottleAL.add(new Bottle ("Pigeon" ,     500,  "Stainless steel"));
           
          System.out.println("Bottle:" +bottleAL);
   		
   		System.out.println("===========================");
   		
        for(Bottle m:bottleAL) {
			
			System.out.println(m);
		}
		
        System.out.println("===========================");
		
		
		
		
	Iterator<Bottle> itr = bottleAL.iterator();
		while(itr.hasNext()) {
			Bottle bl=itr.next();
			System.out.println(bl);
			if(bl.getBrand().equals("Pigeon")){
					itr.remove();
		       System.out.println("Removed:" + bl.getBrand());
					
	}
          
	}
		
		System.out.println("the final array list:");
		System.out.println(bottleAL);
		
		System.out.println("Iterating using List iterator");
		ListIterator<Bottle> litr = bottleAL.listIterator();
		while(litr.hasNext()) {
			Bottle bl= litr.next();
			System.out.println(bl);
		}
		System.out.println("==============");
		while(litr.hasPrevious()) {
			Bottle bl = litr.previous();
			System.out.println(bl);
			}
		

	}

}
