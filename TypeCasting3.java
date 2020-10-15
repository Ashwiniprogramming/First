package com.xworkz.WcandTc.assignment;

public class TypeCasting3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long l=30;
		int i=50;
		short s=60;
		byte b=70;
		
		int sum=(int) (l + i + s + b);
		//int sum=(l+i+s+b)//gives  compile time error
		System.out.println("sum= " +sum);
		
		

	}

}
//output=210


