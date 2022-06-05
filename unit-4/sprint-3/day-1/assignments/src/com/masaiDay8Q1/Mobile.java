package com.masaiDay8Q1;


public class Mobile {
	
	static String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void displayMobile(String mobileCompany, String... mobileModels) {
		
		System.out.println("Mobile Brand: " + mobileCompany);
		
		boolean check = false;
		
		if(mobileModels.length == 0) {
			System.out.println("No mobile models provided");
		}
		else {
			for(String mobile: mobileModels) {
				check = false;
				
				for(String model: outdatedModels) {
					if(model.equals(mobile)) {
						check = true;
						break;
					}
				}
				
				if(check)
					System.out.println(mobile+"_OUTDATED");
				else
					System.out.println(mobile);
			}
			
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		
		mob.displayMobile("Xiaomi", "note4", "note5", "Note10", "Poco");
		mob.displayMobile("Samsung", "Galaxy");
		mob.displayMobile("Apple");
	}
	
}