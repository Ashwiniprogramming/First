package com.xworkz.thread;

public class WholeNumber1to50 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Thread start: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		for(int i=1;i<=50;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread end: Id: " + Thread.currentThread().getId() + " Id: " + Thread.currentThread().getName());
		
	}

}
