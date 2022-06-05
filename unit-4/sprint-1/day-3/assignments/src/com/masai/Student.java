package com.masai;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails()
	{
		
		System.out.println("Roll is : "+roll);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks);
		
	}

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.roll=459;
		s1.name="Mohit";
		s1.marks=90;
		s1.displayStudentDetails();

		
		Student s2=new Student();
		s2.roll=999;
		s2.name="Rohit";
		s2.marks=90;
		s2.displayStudentDetails();
		
		s1=null;
		s1.displayStudentDetails();
		
		s2=null;
		s2.displayStudentDetails();

	}

}
