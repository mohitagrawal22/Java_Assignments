package com.masaiDay4Q3;

public class StudentNit {
      
	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	
	  public StudentNit(int roll, String name, String address, String collageName) {
			super();
			this.roll = roll;
			this.name = name;
			this.address = address;
			this.collageName = collageName;
		}
	  
	  public StudentNit(int roll, String name, String address) {
			super();
			this.roll = roll;
			this.name = name;
			this.address = address;
			this.collageName = "NIT";
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
	  
	  
	      public static StudentNit getStudentNit(boolean isFromNIT)
	       {
		
		  if(isFromNIT)
		  {
			  
			  StudentNit s1 = new StudentNit(25,"Mohit","Mumbai");
			  
			  return s1;
	           
		  }
		  else
		  {
			  StudentNit s2 = new StudentNit(25,"Rohit","Pune","PIT");
			  return s2;
		  }
		  
		  
		 
	}
	
	
     public static void main(String[] args) {
		  
	     StudentNit sNit = getStudentNit(true);
	     StudentNit sOther = getStudentNit(false);
	    
	     System.out.println("Student one Details");
	     
	     System.out.println("Student Name : "+s2.getName());
	     System.out.println("Student Roll No : "+s2.getRoll());
	     System.out.println("Student Address : "+s2.getAddress());
	     System.out.println("Student Collage Name : "+s2.getCollageName());
	     
	     System.out.println("Student two Details");
	     
	     System.out.println("Student Name : "+s3.getName());
	     System.out.println("Student Roll No : "+s3.getRoll());
	     System.out.println("Student Address : "+s3.getAddress());
	     System.out.println("Student Collage Name : "+s3.getCollageName());
		 

	}

}
