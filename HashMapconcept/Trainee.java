package com.xworkz.HashMapconcept;

public class Trainee {
	
	private String name;
	private int traineeid;
	private String technologies;
	
	
	public Trainee(String name, int traineeid, String technologies) {
		super();
		this.name = name;
		this.traineeid = traineeid;
		this.technologies = technologies;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTraineeid() {
		return traineeid;
	}


	public void setTraineeid(int traineeid) {
		this.traineeid = traineeid;
	}


	public String getTechnologies() {
		return technologies;
	}


	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}


	@Override
	public String toString() {
		return "Trainee [name=" + name + ", traineeid=" + traineeid + ", technologies=" + technologies + "]";
	}
	
	
	

}
