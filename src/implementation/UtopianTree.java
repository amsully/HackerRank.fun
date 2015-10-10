package implementation;

import java.util.*;

public class UtopianTree {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			
			System.out.println( (int) treeLength( scan.nextInt() ));
			
		}
		
	}
	
	public static double treeLength(double growthCycles)
	{
		
		if(growthCycles %2 == 0)
		{
			return (Math.pow(2, growthCycles/2 + 1) -1 );
		}
		
		return (Math.pow(2, Math.floor(growthCycles/2 + 1) + 1) - 1) - 1 ;
		
	}
	
}
