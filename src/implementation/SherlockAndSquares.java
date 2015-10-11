package implementation;

import java.util.*;

public class SherlockAndSquares {

	
	public static void main(String[] args)
	{
		
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfTrials = scan.nextInt();
		
		for(int i = 0; i < numberOfTrials; i ++ )
		{
			
			System.out.println( numberOfSquares(scan.nextInt(), scan.nextInt() ) );
			
			
		}
	}
	
	
	public static int numberOfSquares( int begin, int last )
	{
		
		int start = (int)Math.floor(Math.sqrt(begin));
		int end = (int)Math.ceil(Math.sqrt(last));
		int count = 0;
		
		for(int i = start; i <= end; i++)
		{
			
			if( i*i <=last && i*i >= begin)
			{
				count++;
			}
			
		}
			
		return count;
		
	}
	
	
	
	
}
