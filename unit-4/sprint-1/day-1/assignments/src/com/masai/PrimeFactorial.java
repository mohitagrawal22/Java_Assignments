package com.masai;

public class PrimeFactorial {
	
	static void primeFact(int num)
	{
		if(num>1 && num<101)
		{
			System.out.println("The Prime Factors of "+num+" are:");
			
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)    // every number is divisible by one so not checking num%1==0
				{
					System.out.print(i+" ");
				}
			}
		}
		else
		{
			System.out.println("Invalid number");
		}
	}

	public static void main(String[] args) {
		
		
		primeFact(12);

	}

}
