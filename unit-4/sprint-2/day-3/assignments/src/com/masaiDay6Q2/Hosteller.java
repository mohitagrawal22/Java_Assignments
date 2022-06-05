package com.masaiDay6Q2;

public class Hosteller extends Student {
	private String hostelName;
	private int roomNumber;
	
	public Hosteller() {
		super();
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	
	@Override
	public String toString() {
		return "The Student Details: " + getStudentId() + " " + getName() + " " + getDepartmentId() + " " + getGender() + " " + getPhone() + " " + getHostelName() + " " + getRoomNumber();
	}
}