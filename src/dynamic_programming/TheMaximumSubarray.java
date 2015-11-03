package dynamic_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class TheMaximumSubarray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int trials = scan.nextInt();

		for (int i = 0; i < trials; i++) {

			int size = scan.nextInt();

			ArrayList<Integer> array = new ArrayList<Integer>();

			for (int j = 0; j < size; j++) {
				array.add(scan.nextInt());
			}

			printMaxSubarray(array);

		}

	}

	private static void printMaxSubarray(ArrayList<Integer> array) {
		// TODO Auto-generated method stub

		int sumOfPositiveValues = 0;
		int currentSum = 0;
		int currentIndex = 0;
		int bestSum = 0;
		int bestStartingIndex = -1;
		int bestEndingIndex = -1;
		int biggestNegative = Integer.MIN_VALUE;
		boolean hasZero = false;
		
		for (int i = 0; i < array.size(); i++) 
		{

			int val = currentSum + array.get(i);
			
			if(array.get(i) > 0)
			{
				sumOfPositiveValues += array.get(i);
				
			}else if(array.get(i) == 0)
				hasZero =true;

			if(array.get(i) > biggestNegative)
				biggestNegative = array.get(i);
			
			if (val > 0) 
			{
				
				if (currentSum == 0)
					currentIndex = i;

				currentSum = val;
			} else 
			{
				currentSum = 0;
			}

			if (currentSum > bestSum) 
			{
				bestStartingIndex = currentIndex;
				bestSum = currentSum;
				bestEndingIndex = i;
			}

		}
		
		if(sumOfPositiveValues > 0 || bestSum > 0)
		{
			System.out.print(bestSum);
		
			System.out.println(" " + sumOfPositiveValues);
		}
		else 
		{
			System.out.print(biggestNegative);
			System.out.println(" " + biggestNegative);
		}
	}

}
