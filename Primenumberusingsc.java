package com.xworkz.excetionhandling.customexception;

import java.util.Scanner;

public class Primenumberusingsc {

	public static void main(String[] args) {
		
		int number,count=0,i=1;
      System.out.println("prog begin");
		
		int length=args.length;
		System.out.println("Length: " +length);
		
		Scanner num=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		try {
			
			number=num.nextInt();
			if(number==0) {
				
				InputequaltozeroException ex=new InputequaltozeroException();
				throw ex;
			}else {
				
				while(i<=number) {
					
					
					if(number%i==0) {
						
						count+=1;
						
					}
					
					i++;
				}
				if(count==2) {
					System.out.println(number+ "is prime number");
					}
				else{
					System.out.println(number+ "is not prime number");
					
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("please enter only integer");
				
				
			}
		System.out.println("prog ends");
		}
		
}
		
		
		



