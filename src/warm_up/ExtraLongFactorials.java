package warm_up;

import java.math.BigInteger;
import java.util.*;

public class ExtraLongFactorials {


	
	public static void main(String[] args)
	{
		
		int n;
		BigInteger factorial= BigInteger.ONE;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		
		for(int i = n; i > 0; i--)
		{
			
			factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
			
		}
		
		
		System.out.println(factorial);
		
		
	}
	
}
