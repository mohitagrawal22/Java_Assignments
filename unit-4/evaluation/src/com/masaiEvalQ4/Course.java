package com.masaiEvalQ4;

public class Course {
	
	 int courseId;
	 String courseName;
	 int courseFee;
	 
	 void displayCourseDetails() {
		 
		 System.out.println(courseId +" "+ courseName +" "+ courseFee );
		 
	 }
	 
	 static void authenticate( String  username, String password ) {
		 
		 if( username=="Admin" && password=="1234" )
		 {
			 Course obj=new Course();
			 obj.courseId=123;
			 obj.courseName="Java";
			 obj.courseFee=300000;
			 obj.displayCourseDetails();
			 
			 
		 }
		 else
		 {
			 System.out.println("Invalid Username or password");
		 }

		  
		 
	 }

	public static void main(String[] args) {
		
		authenticate("Admin","1234");
		
		authenticate("Admi","123");
		

	}

}
