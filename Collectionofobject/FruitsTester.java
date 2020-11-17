package com.xworkz.collectionconcept.Collectionofobject;

import java.util.ArrayList;

public class FruitsTester {

	public static void main(String[] args) {
		
		Fruits fruit1=new Fruits("Guva", 50, 1.00);
		Fruits fruit2=new Fruits("Mango", 80, 2.00);
		Fruits fruit3=new Fruits("Apple", 280, 2.5);
		Fruits fruit4=new Fruits("Grapes",400, 3.00);
		
		
		ArrayList<Fruits> fruitsarraylist = new ArrayList<Fruits>();
		
		fruitsarraylist.add(fruit1);
		fruitsarraylist.add(fruit2);
		fruitsarraylist.add(fruit3);
		fruitsarraylist.add(fruit4);
		
		System.out.println(fruitsarraylist);
		
		System.out.println("========================");
		
		for(Fruits m :fruitsarraylist ) {
			System.out.println(m);
		}
	
		System.out.println("==============================");
		
		for(int i=0;i<fruitsarraylist.size();i++) {
		   
		Fruits h=fruitsarraylist.get(i);
		
		String fruits=h.getFruitname();
		h.setFruitname(fruits+ "fruit");
		System.out.println(h);
		}
		System.out.println("==============================");
		
		System.out.println(fruitsarraylist.get(3));
		
		System.out.println("==============================");
		
		Fruits fruit5=new Fruits("Orange" ,150,3.5);
		fruitsarraylist.set(2, fruit5);
		System.out.println(fruitsarraylist);
		
		System.out.println("===============================================");
		
		Fruits fruit6=new Fruits("Banana" ,200,5.00);
		fruitsarraylist.add(0, fruit6);
		System.out.println(fruitsarraylist);
		
		}
	}
	





