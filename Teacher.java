package com.xworkz.methodoverride.assignment;

public class Teacher {

	 String schoolname;
	 String designation;
	
	public Teacher() {
		
	}
	public Teacher(String inschoolname,String indesignation) {
		
		schoolname=inschoolname;
		designation=indesignation;
		
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void duty() {
		System.out.println("teaching......");
		
	}
	public void supportforlearning() {

		System.out.println("teacher helped to student for learning...");
	}
	public void givingtest() {
		System.out.println("giving test.....");
	}

}



