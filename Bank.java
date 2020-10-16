package com.xworkz.UpcastingandDowncasting.assignment;

public class Bank {
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String Name;
	private String Passbook;
	
	public void Bank() {
		
		System.out.println("default constructor for bank");
		
	}

	public Bank(String Name, String passbook) {
		super();
		this.Name = Name;
		Passbook = passbook;
	}

	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getPassbook() {
		return Passbook;
	}
	public void setPassbook(String Passbook) {
		this.Passbook=Passbook;
	}
	public void display() {
		System.out.println("display : "+ Name +" ," +Passbook );
		
	}
	public void depositingmoney() {
		System.out.println("depositing the money ");
		
	}
	
	
	

}
