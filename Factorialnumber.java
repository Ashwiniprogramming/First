package com.xworkz.excetionhandling.customexception;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		int number,fact=1;
	
	
     System.out.println("prog begin");
		
		int length=args.length;
		System.out.println("Length: " +length);
		
		Scanner num=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		try {
			
			number=num.nextInt();
			if(number==0) {
				
				InputcustomException ex=new InputcustomException();
				throw ex;
			}else {
				
				for(int i=1;i<=number;i++) {
					
					fact*=i;
				}
			System.out.println("Factorial of a number "+number+" is :"+fact);
			
				}
			}
		    catch(Exception e) {
			System.out.println(e);
			System.out.println("please enter only integer");
				
				
			}
		
				
			}

	}


