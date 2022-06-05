package com.masaiEval;

public class AlarmClock {
	
	static void vacationCheck(int day , boolean vacation )
	{
		if(vacation==true && (day==1 || day==2 || day==3 || day==4 || day==5 ) )
		{
			System.out.println("10:00");
		}
		if(vacation==true && (day==0 || day==6) )
		{
			System.out.println("off");
		}
		if(vacation==false && (day==1 || day==2 || day==3 || day==4 || day==5 ) )
		{
			System.out.println("7:00");
		}
		if(vacation==false && (day==0 || day==6) )
		{
			System.out.println("10:00");
		}
		if(  ( day!=1 && day!=2 && day!=3 && day!=4 && day!=5 && day !=6 && day !=0 )   ||  (vacation !=true && vacation !=false)  )
		{
			System.out.println("error");
		}
		
		
	}
		
	public static void main(String[] args) {
		
		vacationCheck(2,true );
		vacationCheck(0,true );
		vacationCheck(3,false );
		vacationCheck(6,false );
		
		vacationCheck(9,true );
				
		
	}

}









