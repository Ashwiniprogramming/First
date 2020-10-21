package com.xworkz.mutipleinheritanceininterface;

public class TwowheelerTester {

	public static void main(String[] args) {
		
		Twowheeler twowheeler = new Twowheeler();
		twowheeler.totaldistance();
		twowheeler.speed();
		
				
		MotorBike motorbike  = new Twowheeler();//upcasting
		motorbike.totaldistance();
		
		//motorbike.speed=10;//we cannot change the variable value in calling method because this is final field we cannot change the value
		
		Cycle cycle  = new Twowheeler();
		cycle.speed();
		
		
		
	}

	
	}


