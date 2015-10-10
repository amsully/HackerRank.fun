package warm_up;

import java.util.*;

public class PlusMinus {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for(int i = 0; i < total; i++)
		{
			int val = scan.nextInt();
			
			if(val > 0)
				pos++;
			if(val < 0)
				neg++;
			if(val == 0)
				zero++;
		}
		System.out.println((double)pos/total);
		System.out.println((double)neg/total);
		System.out.println((double)zero/total);
	}
}
