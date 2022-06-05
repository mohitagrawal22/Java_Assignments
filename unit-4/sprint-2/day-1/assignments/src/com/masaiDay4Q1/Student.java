
package com.masaiDay4Q1;

public class Student {
     
	  private int roll;
	  private String name;
	  private int age;
	  private int marks;
	  
	  
	  Student()
	  {
		  
		   
	  }
	  
	public Student(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

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
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public void showDetails(){
		  
		if( (age>18 && age<60) && (marks>0 && marks<500) )
		{
			System.out.println("Roll is :"+roll);
			System.out.println("Name is :"+name);
			System.out.println("Age is :"+age);
			System.out.println("Marks is :"+marks);
		}
		else
		{
			System.out.println("Please give details in Valid Range Only!");
		}
		
		
		}


	public static void main(String[] args) {
		  
		Student student1 = new Student();
		student1.setRoll(125);
		student1.setName("Rohit");
		student1.setAge(15);
		student1.setMarks(80);
		
		Student student2 = new Student(123,"Mohit",25,100);
		System.out.println("Student1 details:");
		student1.showDetails();
		System.out.println("Student2 details:");
		student2.showDetails();
 
	}

}
