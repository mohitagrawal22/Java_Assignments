package com.masai;

public class SumOfNaturalNos {
	
	
	static void sum(int N)
	{
		int sum = ( N * (N + 1) ) / 2 ;
		System.out.println("Sum of first "+N+" Natural numbers is: "+sum);
	}
	
	
	public static void main(String[] args) {
		
		
		sum(5);

	}


}
