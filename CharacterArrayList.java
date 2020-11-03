package com.xworkz.collectionconcept.ArrayList;

import java.util.ArrayList;

public class CharacterArrayList {

	public static void main(String[] args) {
		
		ArrayList<Character> charvalue = new ArrayList<Character>();
		charvalue.add('A');
		charvalue.add('B');
		charvalue.add('C');
		charvalue.add('D');
		charvalue.add('E');
		
		System.out.println("ArrayList had element: " +charvalue.containsAll(charvalue));
		
		//For loop
		for(int i=0;i<charvalue.size();i++) {
			System.out.println(charvalue.get(i));
			
		}
         System.out.println("=======================================");	
         
        //enhanced for loop
		for(Character C : charvalue) {
			System.out.println(C);
		}
		
		charvalue.add(0, 'Z');
		System.out.println(charvalue);
		
		System.out.println("5th  element is: " +charvalue.get(4));
		
		charvalue.remove(new Character('B'));//remove the 3rd element
		System.out.println("the Arraylist:" +charvalue);
		
		System.out.println("does arraylist have character Z:  " +charvalue.contains('Z'));
		
		charvalue.remove(new Character('Z'));
		System.out.println("the Arraylist:" +charvalue);
		
	}

}
