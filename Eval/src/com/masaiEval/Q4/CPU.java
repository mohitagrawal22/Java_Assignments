package com.masaiEval.Q4;

public class CPU {

	private String manufacturer;
	private String processor;
	private double clockSpeed;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getClockSpeed() {
		return clockSpeed;
	}
	public void setClockSpeed(double clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

	void displayDetails() {
		System.out.println("Cpu's Manufacturer"+manufacturer);
		System.out.println("Cpu's Processor =>"+processor);
		System.out.println("Cpu's ClockSpeed =>"+clockSpeed);
		
		
	}
	
}
