package implementation;

import java.util.*;

public class ServiceLane {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int lengthOfArray = scan.nextInt();
		int numberOfTrials = scan.nextInt();
		int[] highway = new int[lengthOfArray];
		
		for(int i = 0; i < lengthOfArray; i++)
		{
			highway[i] = scan.nextInt();
		}
		
		
		for(int i = 0; i < numberOfTrials; i++)
		{
			
			System.out.println( maxVehicle(scan.nextInt(), scan.nextInt(), highway) );
			
		}
		
	}
	
	public static int maxVehicle( int enter, int exit, int[] highway )
	{
		int max = 3;
		
		for(int i = enter; i <= exit; i++)
		{
			if( highway[i] < max )
			{
				max = highway[i];
			}
		}
		
		return max;
	}
	
}
