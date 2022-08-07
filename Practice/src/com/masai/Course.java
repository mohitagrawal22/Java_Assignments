package com.masai;

import java.util.Scanner;

public class Course {

	
	 int courseId;
	 String courseName;
	 int courseFee;
	 
	 
	 
	 public Course(int courseId, String courseName, int courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public void displayCourseDetails() {
		 
		 System.out.println("***********  Details of the Course  *********** \nCourse Name: " +courseName +"\nCorse Id:"+courseId +"\nCourse Fee:" +courseFee);
		 
	 }
	 
	 public static void authenticate( String username,String password)
	 {
		 if( username.equals("Admin") && password.equals("1234") ) {
			

			 Scanner sc=new Scanner(System.in);
				System.out.println("Enter Course Name");
				String courseName= sc.next();
				System.out.println("Enter Course Id");
				int courseId= sc.nextInt();
				System.out.println("Enter Course Fee:");
				int courseFee= sc.nextInt();
	 
			 Course c1=new Course(courseId,courseName,courseFee);
			 c1.displayCourseDetails();
			 
			 sc.close();
			 
		 }
		 else {
			 System.out.println("Invalid Credentials !");
		 }
	 }
	 
	public static void main(String[] args)
	{
		
		
		Scanner sc= new Scanner(System.in);
		
		int i=0;
		while(i<2) {
		System.out.println("Enter User Name");
		String user= sc.next();
		System.out.println("Enter Password");
		String pass= sc.next();
		
		Course.authenticate(user, pass);
		i++;
		
		}
		sc.close();
		
		 
	}
	 
	

	
	
}
