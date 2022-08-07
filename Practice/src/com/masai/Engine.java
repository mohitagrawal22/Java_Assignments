package com.masai;

public class Engine {
	
	int rmp=100;
	int power=500;
	String manufacturer="AutoZone Pvt.Ltd";
	boolean hasTurbo=false;
	
	Engine(){
		
	}
	

	public Engine(int rmp, int power, String manufacturer) {
		//super();
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;

	}



	public void makeTurbo() {
		
		hasTurbo=true;
		
	}
	
	public void displayEngine() {
	//	System.out.println("Engine Details:");
		System.out.println("Rmp: "+rmp);
		System.out.println("Power: "+power);
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println("Turbo: "+hasTurbo);
		System.out.println("-----------------------------------");

		
	}
	

}
