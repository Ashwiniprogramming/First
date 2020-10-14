package com.xworkz.methodoverride.assignment;

public class MathTeacher extends Teacher {
	
	String subject;
	 String teachername;
	
	public MathTeacher() {
		System.out.println("default constructor of mathteacher class");
	}
	public MathTeacher(String insubject,String inteachername) {
		subject=insubject;
		teachername=inteachername;
		
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	@Override
	public void duty() {
		System.out.println("teaching mathematics......");
		
	}
	@Override
	public void givingtest() {
		System.out.println("giving test......");
	}
	
	}





