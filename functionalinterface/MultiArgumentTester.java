package com.xworkz.functionalinterface;

public class MultiArgumentTester {

	public static void main(String[] args) {
		
		MultiArgument mulargu=(String str1,String str2)->{
			
			System.out.println("concatinate of two string is :" +(str1+str2));
			
			//System.out.println("concatinate of two string is :" +(str1.concat(str2)));//we can use this also
		
			return null;
		
		};
		mulargu.ConcatTwoString("snow","ball" );
		

	}

}
