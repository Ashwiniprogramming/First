package com.xworkz.String.assignment;

public class Isstringcontainsonlyalphabet {

	public static void main(String[] args) {

       String str="Mick check 123 123 !!";
       boolean result=str.chars().allMatch(Character::isLetter);		   
       System.out.println("String contain only alphabet:" +result);
	}

}
