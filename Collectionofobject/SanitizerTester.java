package com.xworkz.collectionconcept.Collectionofobject;

import java.util.ArrayList;

public class SanitizerTester {

	public static void main(String[] args) {

        
		Sanitizers s1=new Sanitizers("Dettol", 80.00, true);
		Sanitizers s2=new Sanitizers("Godrej", 100.0,false );
	    Sanitizers s3=new Sanitizers("Savlon", 150.0, true);
	    Sanitizers s4=new Sanitizers("Dabur",   90.0, true);

		
		ArrayList<Sanitizers> sanitizerarraylist = new ArrayList<Sanitizers>();
		
		sanitizerarraylist.add(s1);
		sanitizerarraylist.add(s2);
		sanitizerarraylist.add(s3);
		sanitizerarraylist.add(s4);
		
		System.out.println(sanitizerarraylist);
		
		System.out.println("========================");
		
		for(Sanitizers m :sanitizerarraylist ) {
			System.out.println(m);
		}
	
		System.out.println("==============================");
		
		for(int i=0;i<sanitizerarraylist.size();i++) {
		   
		Sanitizers h=sanitizerarraylist.get(i);
		
		String fruits=h.getBrand();
		h.setBrand(fruits+ "sanitizer");
		System.out.println(h);
		}
		System.out.println("==============================");
		
		System.out.println(sanitizerarraylist.get(3));
		
		System.out.println("==============================");
		
		Sanitizers s5=new Sanitizers("Lifebuoy" ,160,false);
		sanitizerarraylist.set(2, s5);
		System.out.println(sanitizerarraylist);
		
		System.out.println("===============================================");
		

		Sanitizers s6=new Sanitizers("Sterillium" ,85,true);
		sanitizerarraylist.add(0, s6);
		System.out.println(sanitizerarraylist);
		}
	
	}


