package com.xworkz.UpcastingandDowncasting.assignment;

public class VijayaBank extends Bank{

	private String branch="mysore";
	private long Accountnum=1395815451;
	
	public VijayaBank() {
		
		System.out.println("default constructor for vijayabank");
	}

	public VijayaBank(String branch, long accountnum) {
		super();
		this.branch = branch;
		Accountnum = accountnum;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getAccountnum() {
		return Accountnum;
	}

	public void setAccountnum(long accountnum) {
		Accountnum = accountnum;
	}

	@Override
	public void display(){
		System.out.println("branch : " + getBranch() +  " ,Accountnum : " + getAccountnum() +   " ,name: " +getName() +   " ,Passbook:" +getPassbook() );

	}
	public void withdrawmoney() {
		System.out.println("withdraw money from your account");
		
	}
	@Override
	public void depositingmoney() {
		System.out.println("deposting money to your account");
	}
	
	

}
