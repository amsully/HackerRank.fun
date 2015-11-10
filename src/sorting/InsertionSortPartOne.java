package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortPartOne {

	public static void main(String[] args )
	{
		
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		int[] arr = new int[trials];
		for(int i = 0; i < trials; i++)
		{
			
			arr[i] = scan.nextInt();
			
		}
		
		insertionPrint(arr);
		
	}

	private static void insertionPrint(int[] arr) {
		// TODO Auto-generated method stub
		

			int moveVal = arr[arr.length-1];
			
			for(int j = arr.length-2; j >= 0; j--)
			{

				if(arr[j] > moveVal)
				{
					arr[j+1]=arr[j];
					System.out.println(print(arr));

				}else
				{
					arr[j+1] = moveVal;
					break;
				}
				
				if(j == 0) arr[0] = moveVal;
				
				
			}
			
		
		System.out.println(print(arr));

		
	}
	
	public static String print(int[] arr)
	{
		return Arrays.toString(arr).replace(", ", " ").replace("[", "").replace("]", "");
	}
	

	
}
