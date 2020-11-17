package com.xworkz.collectionconcept.sortingconcept;

public class Country implements Comparable<Country> {
	
	private Integer noofstates;
	private String name;
	private int countrycode;
	
	public int getNoofstates() {
		return noofstates;
	}
	public void setNoofstates(int noofstates) {
		this.noofstates = noofstates;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	public Country(int noofstates, String name, int countrycode) {
		super();
		this.noofstates = noofstates;
		this.name = name;
		this.countrycode = countrycode;
	}
	@Override
	public String toString() {
		return "Country [noofstates=" + noofstates + ", name=" + name + ", countrycode=" + countrycode + "]";
	}
	@Override
	public int compareTo(Country o) {
		int result=this.noofstates.compareTo(o.noofstates);
		return result;
	}
	
	

}
