package com.xworkz.Functionalinterfacelibraries.assignment;

import java.util.function.Function;

public class FunctionFI {

	public static void main(String[] args) {
		
		//R(T,t);
		Function<String,Integer>func=(str)->Integer.parseInt(str);
		System.out.println("the integer is:"+func.apply("456"));
		System.out.println("second integer is:"+func.apply("ashwini"));//number formate exception
			
		}
	}


