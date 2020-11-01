package com.xworkz.Stringmethod.assignment;

public class CountingCharacter {
	
	public static int count (String s,char ch) {
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==ch)
				count++;
			
		}
		return count;
	}

	public static void main(String[] args) {
		
		String str="hheeeeellllloooo";
		char ch='e';
		System.out.println(" number of e is:" +count(str,ch));
		
	}

}
