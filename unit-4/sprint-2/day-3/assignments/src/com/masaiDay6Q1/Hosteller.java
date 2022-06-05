package com.masaiDay6Q1;

public class Hosteller extends Student {
	
	private double hostelFee;
	
	public Hosteller()
	{
		
	}

	public Hosteller(double hostelFee) {
		super();
		this.hostelFee = hostelFee;
	}

	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	
	@Override
	public double payFee()
	{
		Hosteller hs = new Hosteller();
		double fee = hs.getExamFee();
		return this.hostelFee+fee;
	}

	
}