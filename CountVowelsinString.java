package com.xworkz.String.assignment;

public class CountVowelsinString {

	public static void main(String[] args) {
		
		int vcount=0;
		
		String str="Welcome to Xworkz";
		
		str=str.toLowerCase();//converting to lowercase
		
		for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')	{
			 vcount++;
		 }
			
		}
		
		System.out.println("Number of Vowels: " +vcount );

		}

}
