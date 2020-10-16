package com.xworkz.UpcastingandDowncasting.assignment;

public class VijayaBankTester {

	public static void main(String[] args) {
	
        System.out.println("Instance of child class");
		
		VijayaBank vijayabank=new VijayaBank();
		vijayabank.setName("Syndicatebank");
		vijayabank.setPassbook("syndicatebank passbook");
		vijayabank.display();
		System.out.println();
		
		vijayabank.setBranch("Mysore");
		vijayabank.setAccountnum(12345678);
		
		System.out.println("Name: "+vijayabank.getName());
		System.out.println("Passbook: "+vijayabank.getPassbook());
		System.out.println("Branch: "+vijayabank.getBranch());
		System.out.println("Accountnum: "+vijayabank.getAccountnum());
		System.out.println();
		vijayabank.depositingmoney();
		vijayabank.display();
		vijayabank.withdrawmoney();
		System.out.println("===================================================");
		System.out.println("Instance of child class");
		Bank bank=new Bank();
		
		bank.setName("SBI Bank");
		bank.setPassbook("SBI passbook");
		System.out.println("Name: "+bank.getName());
		System.out.println("Passbook: "+bank.getPassbook());
		bank.display();
		bank.depositingmoney();
		
	}

}
