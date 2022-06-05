package com.masaiDay6Q1;

public class Student {
	
	private int studentId;
	private String studentName;
	private double examFee;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, double examFee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.examFee = examFee;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
  public void displayDetails()
  {
	   System.out.println("Student Id: "+studentId);
	   System.out.println("Student Name is: "+studentName);
	   System.out.println("Exam Fee: "+examFee);   
  }
  
  public double payFee()
  {
	  return this.examFee;
  }
  
  
}