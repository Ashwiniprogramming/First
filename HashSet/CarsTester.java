package com.xworkz.HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class CarsTester {

	public static void main(String[] args) {
		
		
		
		HashSet<Cars> caral = new HashSet<Cars>();
		
		Cars c1 = new Cars("Audi",8500000,"Black");
		Cars c2 = new Cars("BMW",96000000.6,"White");
		Cars c3 = new Cars("Honda",1700000.76,"Red");
		Cars c4 = new Cars("Maruti Suzuki",900000,"Grey");
		
		caral.add(c1);
		caral.add(c2);
		caral.add(c3);
		caral.add(c4);
		
		System.out.println(caral);
		
      System.out.println("-----------------");
		
		System.out.println("Traversing using foreach");
		caral.forEach((m)->System.out.println(m));
		System.out.println("-----------------");
		
		System.out.println("Traversing using iterator");
		Iterator<Cars> caritr = caral.iterator();
		while(caritr.hasNext()) {
			System.out.println(caritr.next());
		}

	}

}
