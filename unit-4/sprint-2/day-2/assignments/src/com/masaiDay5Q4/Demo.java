package com.masaiDay5Q4;
import java.util.Scanner;

public class Demo {
	
	void printStudentDetails(Student[] students) {
		for(Student s: students) {
			System.out.println("Roll No: " + s.getRoll());
			System.out.println("Name: " + s.getName());
			System.out.println("Address: " + s.getAddress());
			System.out.println("Marks: " + s.getMarks());
		}
	}
	
	double getStudentsAverage(Student[] students) {
		int totalMarks = 0;
		for(Student s: students) {
			totalMarks += s.getMarks();
		}
		
		return (totalMarks/students.length);
	}
	
	public static void main(String[] args) {
		
		Demo demoObj = new Demo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total number of students:");
		int totalStudents = sc.nextInt();
		
		Student[] students = new Student[totalStudents];
		
		for(int i=0; i<totalStudents; i++) {
			System.out.println("Student " + (i+1) + " data");
			Student stud = new Student();
			
			System.out.println("Enter Roll no:");
			stud.setRoll(sc.nextInt());
			
			System.out.println("Enter Student Name:");
			stud.setName(sc.next());
			
			System.out.println("Enter Address:");
			stud.setAddress(sc.next());
			
			System.out.println("Enter Student Marks");
			stud.setMarks(sc.nextInt());
			
			students[i] = stud;
		}
		
		demoObj.printStudentDetails(students);
		
		double studentsAvg = demoObj.getStudentsAverage(students);
		
		System.out.println("Average of Marks: " + studentsAvg);
		
		sc.close();
	}
}