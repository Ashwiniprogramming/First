package com.xworkz.linkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.xworkz.HashSet.Cars;

public class PencilTester {

	public static void main(String[] args) {
		
		LinkedHashSet<Pencils> pal = new LinkedHashSet<Pencils>();
		
		Pencils p1 = new Pencils("Wooden",10,false);
		Pencils p2 = new Pencils("Golf",10,true);
		Pencils p3 = new Pencils("Mechanical",10,false);
		Pencils p4 = new Pencils("HB Scale",10,false);
		
		pal.add(p1);
		pal.add(p2);
		pal.add(p3);
		pal.add(p4);
        System.out.println(pal);
		
	    System.out.println("-----------------");
			
	    System.out.println("Traversing using foreach");
	    pal.forEach((m)->System.out.println(m));
	    System.out.println("-----------------");
			
		System.out.println("Traversing using iterator");
		Iterator<Pencils> pitr = pal.iterator();
		while(pitr.hasNext()) {
		System.out.println(pitr.next());
			}


	}

}
