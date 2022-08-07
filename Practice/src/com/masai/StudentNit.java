package com.masai;

public class StudentNit {
	
	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	
	StudentNit(int roll, String name, String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName="NIT";
	}
	
	StudentNit(int roll, String name, String address, String collageName){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	
	/*
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	*/
	
	public void display() {
		System.out.println("***********Student Details:**************");
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+roll);
		System.out.println("Address: "+address);
		System.out.println("College: "+collageName);
	}
	
	public static StudentNit getStudent(boolean isFromNIT) {
		
		if(isFromNIT) {
			
			return new StudentNit(123,"Mohit","Mumbai");
			//display();
			
		}
		else {
			
			return new StudentNit(321,"Rohit","Pune","Symboysis");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		StudentNit s1=getStudent(true);
		s1.display();
		
		StudentNit s2=getStudent(false);
		s2.display();
		
		
	}
	
	

}
