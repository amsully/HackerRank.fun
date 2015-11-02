package strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			
			System.out.println(isFunny(scan.next()));
			
		}
		
	}

	private static String isFunny(String notChecked) {
		// TODO Auto-generated method stub
		
		String reversed = reverse(notChecked);
		
		for(int i = 1; i < notChecked.length(); i++)
		{
			int valOne = Math.abs(notChecked.charAt(i)-notChecked.charAt(i-1));
			int reversedVal = Math.abs(reversed.charAt(i) - reversed.charAt(i-1));
			
			if(valOne != reversedVal) return "Not Funny";

		}
		
		return "Funny";
	}

	private static String reverse(String notChecked) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		
		for(int i = notChecked.length()-1; i >= 0; i--)
		{
			str.append(notChecked.charAt(i));
		}
		
		return str.toString();
	}
	
}
