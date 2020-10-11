package com.xworkz.exceptionhandlingassignment;

public class checkpalindrome {

	public static void main(String[] args) {
		
		int num=0;
		
		checkpalindrome p=new checkpalindrome();
		try {
			p.ispalindrome(num);
		}
		
		catch(Exception e) {
			System.out.println("Exception occured");
			
		}
		
	}
			
	public static void ispalindrome(int num)throws Exception{
		
		int sum=0,rem,temp;
		
		temp=num;
		
		if(num==0) {
			Exception e=new Exception();
			throw e;
		}else {
			
			while(num>0)
			{
				rem=num/10;
				sum=(sum*10)+rem;
				num=num/10;
			}
			
			if(temp==num)
				System.out.println("the number is palindrome");
			
			     System.out.println("the number is not palindrome");
			}
		
	}
	
}
		
		
		
	