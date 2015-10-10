package implementation;

import java.util.Scanner;



public class SherlockAndTheBeast {

	static Scanner  scan = new Scanner(System.in);

	public static void main(String args[])
	{
		
		int numberOfTrials = scan.nextInt();
		
		for(int i = 0; i < numberOfTrials; i++)
		{
			
			int n = scan.nextInt();
			
			System.out.println(largestKeyValue(n));
			
		}
		
	}
	
	public static String largestKeyValue(int n)
	{
		
		int fives = n;
		int threes = 0;
		
		for(int i = n; i > 0; i--)
		{
			if( fives%3 == 0 && threes%5 == 0)
				return stringTogether(fives,threes);
			fives--;
			threes++;
		}
		
		if(n%5 == 0)
		{
			return stringTogether(0, n);
		}
		
		return "-1";
	}
	
	public static String stringTogether(int fives, int threes)
	{
		int[] A = new int[fives];
		int[] B= new int[threes];
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < fives; i++)
			builder.append("5");
		for(int i = 0; i < threes; i++)
			builder.append("3");
		
		return builder.toString();
			
		
	}
	
}
