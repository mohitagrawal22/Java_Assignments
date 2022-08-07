package com.masai;

public class Car {

	String model="StingRay";
	String companyName="Maruti Suzuki";
	String color="Silver";
	Engine engine = new Engine();
	
	
	Car(){
		
	}

	public Car(String model, String companyName, String color, Engine engine) {
		super();
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
	}

	public void displayCar() {
	//	System.out.println("Car Details:");
		System.out.println("Name: "+companyName);
		System.out.println("Model: "+model);
		System.out.println("Colour: "+color);
		
	}
	
}
