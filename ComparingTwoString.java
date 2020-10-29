package com.xworkz.String.assignment;

public class ComparingTwoString {

	public static void main(String[] args) {

      //String compare
		String str1="Welcome";
		String str2="Welcome";
		
		boolean result =str1.equals(str2);
		System.out.println("Result of str1.equals(str2):" + result);//true
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		String s3=new String("hello");
		boolean result2 =s1.equals(s2);//values are compared
		System.out.println("Result of s1.equals(s2):" + result2);//true
		System.out.println("Result of s1.equals(s3):" + s1.equals(s3));//false 
		
		boolean result3=(s1==s2);//relational  //memory location
		System.out.println("Result of (s1==s2):" + result3);
		
		String name1="Ashwini";
		String name2="Ashwini";
		int compRes=name1.compareTo(name2);
		System.out.println("compRes:" +compRes);
		
		String name3 = "A";//depending on the ASCII value 
		String name4 = "B";
		int compRes2=name3.compareTo(name4);
		System.out.println("compRes:" +compRes2);
		
		String name5 = "B";
		String name6 = "A";
		int compRes3=name5.compareTo(name6);
		System.out.println("compRes:" +compRes3);
		
		
		
	}

}
