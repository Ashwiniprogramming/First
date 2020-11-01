package com.xworkz.Stringmethod.assignment;

public class UppercaseCharactertoend {
	
	public static String move(String str) {
		
		int len=str.length();
		String low="";
		String upper="";
		char ch;
		for(int i=0;i<len;i++) {
			
			ch=str.charAt(i);
			
			if(ch>='A'&&ch<='Z') {
				upper+= ch;
			}
			else {
				low+= ch;
			}
			
		}
		return low + upper;

		}

	public static void main(String[] args) {
		
		String str="How Are You Folks";
		System.out.println("output is :" + move(str));
		

	}

}
