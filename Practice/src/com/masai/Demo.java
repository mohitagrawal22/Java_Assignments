package com.masai;

public class Demo {
	
	 Demo(){
		 this("Mohit");
		 System.out.println("Zero Constructor");
	 }
	 Demo(String s){
		 
		 this(22);
		 System.out.println("String "+s+" Constructor");
		 
	 }
	 Demo(int i){
		 
		 this(22.55f);
		 System.out.println("Integer "+i+" Constructor");
		 
	 }
	 Demo(float f){
		 
		 System.out.println("Float "+f+" Constructor");
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 Demo d1= new Demo();
		
	}

}
