package implementation;

import java.util.ArrayList;
//NOTES
//Max Min ->
//4,4 -> (0 3 0 3) (1 2 1 2)
//6,6 -> (0 5 0 5) (1 4 1 4) (2 3 2 3)
//6,7 -> ~~(0 6 0 5) (1 5 1 4) (2 4 2 3)
import java.util.Scanner;

public class MatrixRotationAlgoMulti {

	public static ArrayList<ArrayList<Integer[]>> indexMapping = new ArrayList<ArrayList<Integer[]>>();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int n = scan.nextInt();
		int rotations = scan.nextInt();

//		rotations = rotations % ((2 * n) + (2 * (m - 2)));

		int[][] currMatrix = getMatrix(scan, m, n);

		// for (int i = 0; i < rotations; i++) {
		int rowMin = 0;
		int rowMax = m - 1;
		int colMin = 0;
		int colMax = n - 1;

		while (rowMin < rowMax && colMin < colMax) {
			int subRotations = rotations
					% ((2 * ((colMax - colMin) + 1)) + (2 * (((rowMax - rowMin) + 1) - 2)));

			indexMapping = createMapping(subRotations, m, n, rowMin, rowMax, colMin, colMax);

			rowMin++;
			rowMax--;
			colMin++;
			colMax--;
		}

		// }
//		for (int i = 0; i < currMatrix.length; i++)// int[] i : currMatrix)
//		{
//			if (i != 0)
//				System.out.println("");
//			for (int j : currMatrix[i])
//				System.out.print(j + " ");
//		}
		
		int[][] newMatrix = new int[m][n];
		for(int i = 0; i < indexMapping.size();i++)
		{
			ArrayList<Integer[]> arr = indexMapping.get(i);
//			System.out.println("");
			for(int j = 0; j < arr.size(); j++ )
			{
				Integer[] indexTo = arr.get(j);
//				System.out.print(indexTo[0]+""+indexTo[1] + " ");
				newMatrix[indexTo[0]][indexTo[1]] = currMatrix[i][j];
				
			}
		}
		for (int i = 0; i < newMatrix.length; i++)// int[] i : currMatrix)
		{
			if (i != 0)
				System.out.println("");
			for (int j : newMatrix[i])
				System.out.print(j + " ");
		}
		
	}

	private static ArrayList<ArrayList<Integer[]>> createMapping(int rotations, int m, int n, int rowMin,
			int rowMax, int colMin, int colMax) {

		// for (int i = 0; i < m; i++) {
		// for (int j = 0; j < n; j++) {
		for (int i = rowMin; i <= rowMax; i++) {

			for (int j = colMin; j <= colMax; j++) {
				if (i == rowMin || i == rowMax || j == colMin || j == colMax) {

					int newI = i;
					int newJ = j;
					int tmpRotations = rotations;
					int[] updatedValue = new int[2];
					while (tmpRotations != 0) {
						
						if(newJ == colMin && newI != rowMax)
						{
							updatedValue = wrapAroundColMin(newI, rowMax, tmpRotations);
							newI = updatedValue[0];
							tmpRotations = updatedValue[1];
						}else
						if(newJ == colMax && newI != rowMin)
						{
							updatedValue= wrapAroundColMax(newI, rowMin, tmpRotations);
							newI = updatedValue[0];
							tmpRotations = updatedValue[1];
						}else
						if(newI == rowMin && newJ!=colMin)
						{
							updatedValue = wrapAroundRowMin(newJ, colMin, tmpRotations);
							newJ = updatedValue[0];
							tmpRotations = updatedValue[1];
						}else
						if(newI== rowMax && newJ != colMax)
						{
							updatedValue = wrapAroundRowMax(newJ, colMax, tmpRotations);
							newJ = updatedValue[0];
							tmpRotations = updatedValue[1];
						}
						//System.out.println(newI + " " + newJ);
					}
					indexMapping.get(i).get(j)[0] = newI;
					indexMapping.get(i).get(j)[1] = newJ;
//					System.out.println(i + " " + j);
//					System.out.println(newI + " " + newJ);
//					System.out.println(indexMapping.get(i).get(j)[0]+" "+indexMapping.get(i).get(j)[1]);
//					System.out.println("");
				}

			}
		}
		return indexMapping;
	}

	private static int[] wrapAroundColMin(int newI, int rowMax, int tmpRotations) {
		// TODO Auto-generated method stub
		int[] updatedValue = new int[2];
		if(newI+ tmpRotations > rowMax)
		{
			tmpRotations =  (tmpRotations)-(rowMax - newI);// - colMin +1);

			newI = rowMax;
			
		}else
		{
			newI = newI + tmpRotations;
			tmpRotations = 0;
		}
		updatedValue[0] = newI;
		updatedValue[1] = tmpRotations;
		return updatedValue;
	}

	private static int[] wrapAroundRowMax(int newJ, int colMax, int tmpRotations) {
		// TODO Auto-generated method stub
		int[] updatedValue = new int[2];

		if(newJ+tmpRotations > colMax)
		{
			tmpRotations =  (tmpRotations)-(colMax - newJ);//- rowMin + 1);

			newJ = colMax;
		}
		else
		{
			newJ = newJ + tmpRotations;
			tmpRotations= 0;
//			tmpRotations = (newJ+tmpRotations)-(rowMax - rowMin + 1);
		}		
		updatedValue[0] = newJ;
		updatedValue[1] = tmpRotations;
		return updatedValue;
	}

	private static int[] wrapAroundRowMin(int newJ, int colMin, int tmpRotations) {
		// TODO Auto-generated method stub
		int[] updatedValue = new int[2];

		if(newJ-tmpRotations < colMin)
		{
			tmpRotations = tmpRotations - (newJ- colMin);

			newJ = colMin;
		}
		else
		{
			newJ = newJ - tmpRotations;
			tmpRotations = 0;
		}		
		updatedValue[0] = newJ;
		updatedValue[1] = tmpRotations;
		return updatedValue;
	}

	private static int[] wrapAroundColMax(int newI, int rowMin, int tmpRotations) {
		// TODO Auto-generated method stub
		int[] updatedValue = new int[2];

		if(newI - tmpRotations < rowMin)
		{
			tmpRotations = tmpRotations - (newI- rowMin);

			newI = rowMin;
		}
		else
		{
			newI = newI - tmpRotations;
			tmpRotations = 0;
		}
		updatedValue[0] = newI;
		updatedValue[1] = tmpRotations;
		return updatedValue;
	}

	private static int[][] getMatrix(Scanner scan, int m, int n) {
		// TODO Auto-generated method stub

		int[][] currMatrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			indexMapping.add(new ArrayList<Integer[]>());
			for (int j = 0; j < n; j++) {

				currMatrix[i][j] = scan.nextInt();

				Integer[] index = { i, j };
				indexMapping.get(i).add(index);
			}
		}

		return currMatrix;
	}

}
