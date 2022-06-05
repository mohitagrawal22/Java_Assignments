package com.masai;

public class VowelConsonant {
	
	void check(char letter)
	{
		if( (letter>=65 && letter<=90)  || (letter>=97 && letter<=122) ) //Directly given the ASCII/Unicodes
		{
			if( letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' ||
				letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U'	)
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		}
		else
		{
			System.out.println("Error!");
		}
	}

	
	
	public static void main(String[] args) 
	{
		VowelConsonant vc=new VowelConsonant();
		vc.check('a');
		vc.check('Z');
		vc.check('#');
	}
	
}
