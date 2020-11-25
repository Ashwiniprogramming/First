package com.xworkz.runnable;

public class HelloWelcomeTester {

	public static void main(String[] args) {
		
        System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		
        //Anonymous 
		Runnable h5 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
				
				for(int i=1; i<=5; i++) 
					
					System.out.println("Hello");
					
				
				
				System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		        
		        
			}
		};
		Thread t1 = new Thread(h5);
		t1.start();
		
		//Lambdaexpression
		Runnable w10  = () ->{
			
		        System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
				
				for(int i=1; i<=10; i++) 
					
					System.out.println("Welcome");
					
				
				
				System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		        
		};
	    Thread t2 = new Thread(w10);
	    t2.start();
				
		
		
		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
        
        

	}

}
