package com.xworkz.String.assignment;

public class Swapfirstandlastcharacter {
	
	public static String SwapFirstandLast(String str) {
		
		if(str.length()<2)
		return str;
		
		char[] ch =str.toCharArray();//converting the string into character array
		
		//swapping first and last character of string
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
	    return String.valueOf(ch);
	}
		
		
	public static void main(String args[]) {
		
		String str="Hello Folks";
		
		System.out.println(SwapFirstandLast(str));
	
		
		
	}

}
