package com.masaiEval.Q4;

public class Laptop {

	private String color;
	private String companyName;
	private String name;
	private String purpose;
	CPU cpu;
	GraphicCard graphicCard;
	void displayDetails() {
		System.out.println("Laptop Name =>"+name);
		System.out.println("Company name =>"+companyName);
		System.out.println("Laptop Color =>"+color);
		System.out.println("Laptop Color =>"+purpose);
		
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
}
