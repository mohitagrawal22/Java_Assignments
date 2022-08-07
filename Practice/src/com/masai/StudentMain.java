package com.masai;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
		
		s1.setAge(17);
		s1.setMarks(600);
		s1.setName("Mohit");
		s1.setRoll(459);
		
		s1.displayStudent();
				
		Student s2= new Student(123,"Rohit",100,25);
		s2.displayStudent();
		
		
	}

}
