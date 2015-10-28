package implementation;
import java.util.Scanner;


public class TaumAndBday {
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++ )
		{
			
			long black = scan.nextInt();
			long white = scan.nextInt();
			
			long large = (black > white) ? black : white;
			long small = (black < white) ? black : white;
			
			long costBlack = scan.nextInt();
			long costWhite = scan.nextInt();
			long costSwitch = scan.nextInt();
			
			System.out.println(printCost(black, white, costBlack, costWhite, costSwitch));
			

		}
		
	}

	public static long printCost(long black, long white, long costBlack,
			long costWhite, long costSwitch) {
		// TODO Auto-generated method stub

		if( costBlack + costSwitch < costWhite )
		{
			return( (costBlack + costSwitch)*white + costBlack*black );
		}else
		if( costWhite + costSwitch < costBlack )
		{
			return( (costWhite + costSwitch)*black + costWhite*white);
		}
		else
		{
			return (costWhite*white + costBlack*black);
		}
		
	}
	
	
	
}
