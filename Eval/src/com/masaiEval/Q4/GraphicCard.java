package com.masaiEval.Q4;

public class GraphicCard {
	
	private String manufacturer;
	private String capacity;
	private String series;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	void displayDetails(){
		System.out.println("Graphic card's Manufacturer"+manufacturer);
		System.out.println("Graphic card's capacity =>"+capacity);
		System.out.println("Graphic card's series =>"+series);

	}
}
