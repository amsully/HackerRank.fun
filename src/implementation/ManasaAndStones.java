package implementation;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class ManasaAndStones {

	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++ )
		{
			SolverManasaAndStone solver = new SolverManasaAndStone();
			
			solver.printAllValue(scan.nextInt(), scan.nextInt(), scan.nextInt());
		}
		
	}
	
}

class SolverManasaAndStone
{
	
	public void printAllValue(int numberOfStones, int differenceA, int differenceB)
	{
		int overallDifference;
		
		if( differenceA > differenceB )
		{
			overallDifference = differenceA - differenceB;
			printDifferences(numberOfStones, differenceA, overallDifference);
		}
		else
		{
			overallDifference = differenceB - differenceA;
			printDifferences(numberOfStones, differenceB, overallDifference);
		}
		
	}

	private void printDifferences(int numberOfStones, int biggerValue,
			int overallDifference) {
		
		HashSet<Integer> endValues = new HashSet<Integer>();
		
		for(int i = 0; i < numberOfStones; i++)
		{
			
			int value = (numberOfStones * biggerValue)-biggerValue - (i * overallDifference);
			endValues.add(value);
		}
		
		Integer[] values = endValues.toArray(new Integer[endValues.size()]);
		LinkedList<Integer> valLL = new LinkedList<Integer>();
		for(Integer val : values)
		{
			valLL.add(val);
		}
		
		Collections.sort(valLL);
		
		System.out.println(valLL.toString().replace("[", "").replace("]", "").replace(", ", " "));
	}

}
