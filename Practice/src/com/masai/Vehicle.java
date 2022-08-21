package com.masaiEvalC3;

public interface Vehicle {
	
	public void run(); 
	
	default void service() {
		System.out.println("Car needs service");
	}


}
