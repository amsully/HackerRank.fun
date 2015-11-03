package strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			
			System.out.println(numberOfDeletions(scan.next()));
			
		}
		
	}

	private static int numberOfDeletions(String next) {
		// TODO Auto-generated method stub
		
		int deletionCount = 0;
		
		char prev = next.charAt(0);
		char curr;
		for(int i = 1; i < next.length(); i++ )
		{
			curr = next.charAt(i);
			
			if(prev == curr)
			{
				deletionCount++;
			}
			prev = curr;
		}
		
		return deletionCount;
	}
}
