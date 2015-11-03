package strings;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			
			System.out.println( getIndexToRemoveAndMakePalindrome(scan.next() ) );
			
		}
		
		
	}

	private static int getIndexToRemoveAndMakePalindrome(String next) {
		// TODO Auto-generated method stub
		
		int beginIndex = 0;
		int endIndex = next.length()-1;
		
		while(beginIndex < endIndex)
		{
			
			if( next.charAt(beginIndex) != next.charAt(endIndex) )
			{
				
				if( isPalindrome( removeChar(beginIndex, next) ) )
					return beginIndex;
				
				if( isPalindrome( removeChar(endIndex, next) ) )
					return endIndex;				
			}
			
			
			beginIndex++;
			endIndex--;
		}
			
		return -1;
	}

	private static boolean isPalindrome(String potentialPalindrome) {
		// TODO Auto-generated method stub
		
		int beginIndex = 0;
		int endIndex = potentialPalindrome.length()-1;
		
		while(beginIndex < endIndex)
		{
			
			if( potentialPalindrome.charAt(beginIndex) != potentialPalindrome.charAt(endIndex) )
			{
				return false;
			}
			
			
			beginIndex++;
			endIndex--;
		}
		
		return true;
	}

	private static String removeChar(int endIndex, String next) {
		// TODO Auto-generated method stub
		
		StringBuilder strBldr = new StringBuilder();
		
		String left = next.substring(0, endIndex);
		String right = next.substring(endIndex+1, next.length());
		
		return strBldr.append(left).append(right).toString();
	}
	
}
