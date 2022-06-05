package com.masaiEvalQ3;

public class DayOfWeek {

	public static void main(String[] args) {
	
		
		int dayOfTheWeek = 7;
		boolean holiday=false;
		
		
		switch(dayOfTheWeek)
		{
				
		case 1:
			holiday=false;
			break;
		case 2:
			holiday=false;
			break;
		case 3:
			holiday=false;
			break;
		case 4:
			holiday=false;
			break;
		case 5:
			holiday=false;
			break;
		case 6:
			holiday=true;
			break;
		case 7:
			holiday=true;
			break;
			
		}
		
		if(holiday==false)
		{
			System.out.println("Wake up at 7:00");
		}
		else
		{
			System.out.println("Sleep in!");
		}
		

	}

}
