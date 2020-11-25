package com.xworkz.Synchronized;

public class MultiplesTester {

	public static void main(String[] args) {

		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		Multiples m1 = new Multiples();
		
		Runnable r1 =()->m1.print(5);
		Thread t1 = new Thread(r1);
		t1.start();
			

		Multiples m2 = new Multiples();
		
		Runnable r2 =()->m2.print(6);
		Thread t2 = new Thread(r2);
		t2.start();
			
		System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		
		
		}

	}


