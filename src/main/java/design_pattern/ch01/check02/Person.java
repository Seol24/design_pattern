package design_pattern.ch01.check02;

import java.util.Arrays;

public class Person {
	private Phone homephones;
	private Phone officephones;
	
	public Person(Phone homephones, Phone officephones) {
		this.homephones = homephones;
		this.officephones = officephones;
	}

	public Phone getHomephones() {
		return homephones;
	}

	public void setHomephones(Phone homephones) {
		this.homephones = homephones;
	}

	public Phone getOfficephones() {
		return officephones;
	}

	public void setOfficephones(Phone officephones) {
		this.officephones = officephones;
	}
	
	
	
	
	public Person() {}

	@Override
	public String toString() {
		return "Person [homephones=" + homephones + ", officephones=" + officephones + "]";
	}
	
	
	
	
	
}
