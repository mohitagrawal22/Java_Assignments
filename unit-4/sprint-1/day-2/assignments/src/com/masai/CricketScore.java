package com.masai;

public class CricketScore {
	
	static void totalRuns(int one, int two, int three, int four, int six)
	{
		//int one, int two, int three, int four, int six
		int total= one + two*2 + three*3 + four*4 + six*6;
		System.out.println("Total runs scored by Sachin: "+total);
		
		
	}
	
	public static void main(String[] args)
	{
		totalRuns(23,8,1,12,2);    // No of 1s,2s,3s,4s, and 6s.
		
	}

}
