package implementation;

import java.util.Scanner;

public class FindDigits {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			System.out.println(divisorsCount(scan.nextInt()));
		}
		
		
		scan.close();
	}
	
	public static int divisorsCount( int number )
	{
		
		int[] numberArray = toIntArray(number);
		int count = 0;
		for(int i = 0; i < numberArray.length; i++)
			if(numberArray[i] != 0 && number % numberArray[i] == 0)
				count++;
		
		return count;
		
		
	}
	
	public static int[] toIntArray(int number)
	{
		int i = 0;
		int[] arr = new int[number];
		do { 
			arr[i] = number % 10; 
			number /= 10; 
			i++; 
			} while (number != 0); 	
		return arr;
	}
	
	
}
