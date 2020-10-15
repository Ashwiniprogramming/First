package com.xworkz.WcandTc.assignment;

public class WrapperClassfordouble {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.out.println("progr begins");
		
		double y=10.56;
		
	    Double a=new Double(y);//Boxing
		System.out.println("the value of a is : " + a);
		
		double b=a; //AutoBoxing
		System.out.println("the value of b is : " + b);
		
		double c=Double.valueOf(a); //UnBoxing
		System.out.println("the value of c is : " + c);
		
		double d=a; //AutounBoxing
		System.out.println("the value of d is : " + d);
		
		System.out.println("progr ends");
		
		}


}
