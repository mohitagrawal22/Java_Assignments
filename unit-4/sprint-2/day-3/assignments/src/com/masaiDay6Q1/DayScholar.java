package com.masaiDay6Q1;

public class DayScholar extends Student {
	
	 
	private double transportFee;
	
	
	public DayScholar()
	{
		
	}
	
	public DayScholar(double transportFee) {
		super();
		this.transportFee = transportFee;
	}

	public double getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}

	@Override
	public double payFee()
	{
		DayScholar ds = new DayScholar();
		double examFee = ds.getExamFee();
		
		return examFee + this.transportFee;
	}

}