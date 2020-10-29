package com.xworkz.Functionalinterfacelibraries.assignment;

import java.util.function.Predicate;

public class PredicateFI {

	public static void main(String[] args) {

       Predicate <Integer> predicate=(a)->a%2==0;
       System.out.println(predicate.test(20));
       
       Predicate <Integer> predicate2=(b)->b>10;
       System.out.println(predicate.test(5));
	}
	

}
