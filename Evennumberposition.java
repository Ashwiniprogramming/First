package com.xworkz.Stringmethod.assignment;

public class Evennumberposition {
	
	public static void evenpositionwords(String s) {
		
		for(String word:s.split(" ")) 
			
			if(word.length()%2==0)
				System.out.println(word);
				
			
		}
	

	public static void main(String[] args) {
		
		String s="Welcome to xworkz and you are learning string methods in java";
		 evenpositionwords(s);
		
		

	}

}
