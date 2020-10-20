package com.xworkz.accessmodifires.assignment;

public class ElectricSwitchTester {

	public static void main(String[] args) {
		
		 Switches switches =  new ElectricSwitches();
		 switches.off();
		 switches.quailty();
		 switches.costofswitch();
		 switches.price=2000;
		 switches.displaydetails();
		 
		 ElectricSwitches electricswitch = new  ElectricSwitches();
		 electricswitch.color="White";
		 electricswitch.price=2000;
		 electricswitch.costofswitch();
		 electricswitch.off();
		 electricswitch.quailty();
		 electricswitch.displaydetails();
		
	}

}
