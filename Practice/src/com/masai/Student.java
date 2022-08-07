package com.masai;

public class Student {
	
	private int roll;
	private String Name;
	private int marks;
	private int age;
	
	Student(){
		
	}
	
	
	public Student(int roll, String name, int marks, int age) {
		super();
		this.roll = roll;
		Name = name;
		this.marks = marks;
		this.age = age;
	}

	//18<age<60, 0<marks<500

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age = age;
		}
		
	}
	
	
	public void displayStudent() {
		
		System.out.println("********** Details of Student: ********** " );
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge() );
		System.out.println("RollNo: "+getRoll());
		System.out.println("Marks: "+getMarks());
		
	}
	
	

}
