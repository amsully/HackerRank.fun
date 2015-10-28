package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TheGridSearch {
	
	public static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) throws IOException
	{
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int trials = scan.nextInt();
		for(int i = 0; i < trials; i++)
		{
			Solver solve = new Solver();
			
			solve.gridSearch(scan);
			
			
		}
		
		scan.close();
		
	}
}

class Solver {
	
//	public Scanner scan = new Scanner(System.in);
	
	public void gridSearch(Scanner scan)
	{
		
		int bigMatrixRows = scan.nextInt();
		
		int bigMatrixColumns = scan.nextInt();

		String[] bigMatrix = getMatrix(bigMatrixRows, scan);
		
		int smallMatrixRows = scan.nextInt();
		int smallMatrixColumns = scan.nextInt();
		
		String[] smallMatrix = getMatrix(smallMatrixRows, scan);
				
		if( subMatrix(smallMatrix, bigMatrix) )
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
	
	public boolean subMatrix(String[] smallMatrix, String[] bigMatrix) {
		// TODO Auto-generated method stub
		
		
		String startingOfSmallMatrix = smallMatrix[0];
		
		for( int i = 0; i < bigMatrix.length; i++ )
		{
			String bigRow = bigMatrix[i];
			
			while(bigRow.length() >= startingOfSmallMatrix.length())
			{
				if( bigRow.contains(startingOfSmallMatrix) )
				{
					
					int startColumnOfSubMatrix = bigRow.indexOf(startingOfSmallMatrix);
					int endColumnOfSubMatrix = startColumnOfSubMatrix + smallMatrix[0].length();
					
//					System.out.println("index:" + i + " statCol: " + startColumnOfSubMatrix + " " + endColumnOfSubMatrix);
					
					if( checkAllRows(i, startColumnOfSubMatrix, endColumnOfSubMatrix, smallMatrix, bigMatrix) )
					{
						return true;
					}
					
					
				}
				bigRow = bigRow.substring(1);

				
			}
			
		}
		
		return false;
	}

	private boolean checkAllRows(int rowIndex, int startColumnOfSubMatrix,
			int endColumnOfSubMatrix, String[] smallMatrix, String[] bigMatrix) {
		// TODO Auto-generated method stub
		
		if(rowIndex + smallMatrix.length > bigMatrix.length ||   // If rows of sub matrix exceed big matrix
				endColumnOfSubMatrix > bigMatrix[0].length() )  // if end of column
			return false;
		
		for( int i = rowIndex ; i < rowIndex+smallMatrix.length; i++) //
		{
			
			String subBigRow = bigMatrix[i].substring(startColumnOfSubMatrix, endColumnOfSubMatrix);
//			System.out.println(subBigRow);
			if(!subBigRow.contains(smallMatrix[i - rowIndex]))
			{
				return false;
			}
			
		}
		
		return true;
	}

	public String[] getMatrix(int matrixRows, Scanner scan)
	{
		
		
		String[] bigMatrix = new String[matrixRows];
		
		for(int i = 0; i < matrixRows; i++)
		{
			bigMatrix[i] = scan.next();
		}
		
		return bigMatrix;
		
	}
	
	
	
}

