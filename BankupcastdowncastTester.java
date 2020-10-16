package com.xworkz.UpcastingandDowncasting.assignment;

public class BankupcastdowncastTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("upcasting");
		Bank bank=new VijayaBank();
		bank.setName("Syndicate bank");
		bank.setPassbook("Syndicatebank passboook");
		
		System.out.println("Name: " +bank.getName());
		System.out.println("Passbook: " +bank.getPassbook());
	    bank.display();
	    
	    System.out.println("===================================================");
	    System.out.println("downcasting");
	    
	    VijayaBank vijayabank=  (VijayaBank) new Bank();
	    vijayabank.setName("Syndicatebank");
		vijayabank.setPassbook("syndicatebank passbook");
		vijayabank.setBranch("Mysore");
		vijayabank.setAccountnum(12345678);
		
		System.out.println("Name: "+vijayabank.getName());
		System.out.println("Passbook: "+vijayabank.getPassbook());
		System.out.println("Branch: "+vijayabank.getBranch());
		System.out.println("Accountnum: "+vijayabank.getAccountnum());
		vijayabank.display();
	}

}
