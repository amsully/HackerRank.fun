package strings;

import java.util.Scanner;

public class TheLoveLetterMystery {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			
			
			System.out.println( operationsToFormPalindrome(scan.next()));
			
			
		}
		
	}

	private static int operationsToFormPalindrome(String next) {
		// TODO Auto-generated method stub
		
		int beginIndex = 0;
		int endIndex = next.length()-1;
		
		int operationSum =0;
		while(beginIndex < endIndex)
		{
			
			operationSum+= Math.abs((next.charAt(beginIndex)-'a') - (next.charAt(endIndex)-'a'));
			
			beginIndex++;
			endIndex--;
		}
		
		return operationSum;
	}
	
}
