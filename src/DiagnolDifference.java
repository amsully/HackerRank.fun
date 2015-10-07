import java.util.*;

public class DiagnolDifference {
	
	
	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner(System.in);
		
		int dimensions = scan.nextInt();
		
		int[][] matrix = new int[dimensions][dimensions];
		
		int sumUp = 0;
		int sumDown = 0;
		
		for(int i = 0; i < dimensions; i++)
		{
			for(int j = 0; j < dimensions; j++)
			{
				int val = scan.nextInt();
				if( i == j )
				{
					sumDown += val;
				}
				if( (i+j) == dimensions-1)
				{
					sumUp += val;
				}
				
			}
		}
		
		System.out.println(Math.abs(sumDown - sumUp));
		System.out.println(sumDown);
		
		System.out.println(sumUp);
		
	}
	
}
