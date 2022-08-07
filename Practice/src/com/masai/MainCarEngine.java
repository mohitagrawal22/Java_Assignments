package com.masai;

public class MainCarEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		Engine e1=new Engine();
		
		c1.displayCar();
		e1.displayEngine();
		
		
		
		
		Engine e2=new Engine(1000,8000,"G-Class");
		Car c2 = new Car("Gwagon-G63","Mercerdez","Black",e2);
		e2.makeTurbo();
		
		c2.displayCar();
		e2.displayEngine();

	}
	
}
