package implementation;

import java.util.*;

public class ChocolateFeast {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			amountOfCandy(scan.nextInt(), scan.nextInt(), scan.nextInt());
		}
		
		
	}
	
	public static void amountOfCandy( int spendingMoney, int  candyCost, int wrappers)
	{
		long totalCandy = spendingMoney/candyCost;
		long totalWrappers = totalCandy;
		
		while( !(totalWrappers < wrappers) )
		{
			totalCandy += totalWrappers / wrappers;
			totalWrappers = ((totalWrappers%wrappers) + (totalWrappers/wrappers));
		}
//		
//		long redeemableCandy = totalWrappers/wrappers;
//		long remainingWrappers = totalWrappers%wrappers + redeemableCandy;
//		
//		long overflowCandy = remainingWrappers/wrappers;
		
		System.out.println(totalCandy);  //+ redeemableCandy + overflowCandy);
		
	}
	
}
