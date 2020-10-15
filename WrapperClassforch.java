package com.xworkz.WcandTc.assignment;

public class WrapperClassforch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("progr begins");
		
		char x='A';//int-Integer
		
		char j=Character.valueOf(x); //unboxing
		System.out.println("the value of  is j: " + j);
		
		char val=x; //AutounBoxing
		System.out.println("the value of val is : " + val);
			
		Character i=new Character(x);//boxing
		System.out.println("the value of i is : " + i);
		
		Character v=x;//autoboxing
		
		char a=i.charValue();
		
		char k=i; //AutounBoxing
		System.out.println("the value of k is : " + k);
		
		System.out.println("progr ends");
		
		}


}
