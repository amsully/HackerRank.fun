package implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class KaprekarNumbers {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		long min = scan.nextLong();
		
		long max = scan.nextLong();
		
		KaprekarNumbers kN = new KaprekarNumbers();
		
		System.out.println( kN.solve(min, max) );
		
	}
	
	public String solve(long min, long max)
	{
		ArrayList<Long> kaprekarNumbers = new ArrayList<Long>();
		
		for( long i = min; i <= max; i++)
		{
			
			if( isKaprekar(i) )
				kaprekarNumbers.add(i);
			
		}
		
		if(kaprekarNumbers.isEmpty())
		{
			return "INVALID RANGE";
		}
		return kaprekarNumbers.toString().replace("]", "").replace("[", "").replace(", ", " ");
	}
	
	public boolean isKaprekar(long i)
	{
		long full  = i * i;
		
		String fullStr = Long.toString(full);
		
		String left = fullStr.substring(0, fullStr.length()/2);
		String right = fullStr.substring(fullStr.length()/2);
		
		long leftVal = (left.length() == 0) ? 0 : Long.parseLong(left);
		
		long rightVal = (right.length() == 0) ? 0 : Long.parseLong(right);
		
		return (leftVal + rightVal == i);
	}
	
}
