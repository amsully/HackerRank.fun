package implementation;

import java.sql.Time;
import java.util.Scanner;

public class TheTimeInWords {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int minutes = scan.nextInt();
		
		TheTimeInWords timeInWords = new TheTimeInWords();
		
		System.out.println( timeInWords.solve(hour, minutes) );
		
	}
	
	public String solve(int hour, int minutes)
	{
		
		
		if( minutes == 0 )
		{
			return getClockNumber(hour) + " o' clock";
		}
		
		if( minutes == 30 )
		{
			return "half past " + getClockNumber(hour);
		}
		
		if( minutes == 15 )
		{
			return "quarter past " + getClockNumber(hour);
		}
		
		if( minutes == 45 )
		{
			return "quarter to " + getClockNumber(hour+1);
		}
		
		String minutesToPast = (minutes == 59 || minutes == 1) ? ("minute") : ("minutes");
		
		if( minutes > 30 )
		{
			
			return getMinutes( 60 - minutes ) + " " + minutesToPast +" to " + getClockNumber(hour+1);	
		}else
		{
			return getMinutes( minutes ) + " " + minutesToPast + " past " + getClockNumber(hour);
		}		
	}
	
	public String getMinutes(int i) {
		// TODO Auto-generated method stub
		
		 if( i <= 12 )
		 {
			 return getClockNumber(i);
		 }
		 else if( i < 20 )
		 {
			 return getTeen(i);
		 }
		 else if(i == 20)
		 {
			 return "twenty";
		 }
		 else
		 {
			 return "twenty " + getClockNumber(i % 20);
		 }
		
	}

	private String getTeen(int i) {
		// TODO Auto-generated method stub
		switch(i)
		{
		case 13: return "thirteen";
		case 14: return "fourteen";
		case 15: return "fifteen";
		case 16: return "sixteen";
		case 17: return "seventeen";
		case 18: return "eighteen";
		case 19: return "nineteen";
		default: return "";
		}
		
	}

	public String getClockNumber(int hour)
	{
		
		switch(hour)
		{
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		case 10: return "ten";
		case 11: return "eleven";
		case 12: return "twelve";
		case 13: return "one";

		default: return "";
		}
		
		
	}
}
