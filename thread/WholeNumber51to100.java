package com.xworkz.thread;

public class WholeNumber51to100 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Thread start: Id: " +Thread.currentThread().getId()+ "Id: "+Thread.currentThread().getName());
		for(int i=51;i<=100;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread end: Id: " +Thread.currentThread().getId()+ "Id: "+Thread.currentThread().getName());
		
	}

}


