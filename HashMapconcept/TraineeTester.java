package com.xworkz.HashMapconcept;

import java.util.HashMap;

public class TraineeTester {

	public static void main(String[] args) {
		
		//Traniee-NoofClasses
		HashMap<Trainee,Integer> trainee = new HashMap<Trainee,Integer>();
		
		Trainee t1=new Trainee("Ashwini", 19,"Java");
		Trainee t2=new Trainee("Rashmi", 20,"HTML");
		Trainee t3=new Trainee("Surabhi", 25,"Sql");
		Trainee t4=new Trainee("Priya", 35,"Frameworks");
		
		trainee.put(t1, 60);
		trainee.put(t2,30);
		trainee.put(t3,45);
		trainee.put(t4,40);
		
		System.out.println(trainee);
		
		//Traversing
		trainee.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));

	}

}
