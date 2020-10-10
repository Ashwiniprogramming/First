package Arrayassignment.xworkz.com;

public class Findlargestsmallestnumber {

	public static void main(String[] args) {
		
		int number[]=new  int[]{21,3,52,43,86,39,70};
		
		int largest=number[0];
		int smallest=number[0];
		
		for( int i=1;i<number.length;i++) {
			
			if(number[i]>largest) 
				largest=number[i];
				
			else if(number[i]<smallest) 
				smallest=number[i];
				
			}
			System.out.println("largest number is:" + largest);
			System.out.println("smallest number is:" + smallest);
		}
	}
			
		
			
			
		
		
		

	


