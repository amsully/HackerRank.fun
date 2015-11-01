package implementation;

// NOTES
// Max Min ->
// 4,4 -> (0 3 0 3) (1 2 1 2)
// 6,6 -> (0 5 0 5) (1 4 1 4) (2 3 2 3)
// 6,7 -> ~~(0 6 0 5) (1 5 1 4) (2 4 2 3)
import java.util.Scanner;

public class MatrixRotationAlgoOptimization {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int n = scan.nextInt();
		int rotations = scan.nextInt();

		rotations = rotations % ((2 * n) + (2 * (m - 2)));

		int[][] currMatrix = getMatrix(scan, m, n);

		// for (int i = 0; i < rotations; i++) {
		int rowMin = 0;
		int rowMax = m - 1;
		int colMin = 0;
		int colMax = n - 1;

		while (rowMin < rowMax && colMin < colMax) {
			int subRotations = rotations
					% ((2 * ((colMax - colMin) + 1)) + (2 * (((rowMax - rowMin) + 1) - 2)));

			// System.out.println(subRotations);

			for (int i = 0; i < subRotations; i++) {

				currMatrix = rotateSquare(m, n, rowMin, rowMax, colMin, colMax,
						currMatrix);
			}
			rowMin++;
			rowMax--;
			colMin++;
			colMax--;
		}

		// }
		for (int i = 0; i < currMatrix.length; i++)// int[] i : currMatrix)
		{
			if (i != 0)
				System.out.println("");
			for (int j : currMatrix[i])
				System.out.print(j + " ");
		}
	}

	private static int[][] rotateSquare(int m, int n, int rowMin, int rowMax,
			int colMin, int colMax, int[][] rotatedMatrix) {

		int[][] tempValues = new int[m][n];
		boolean[][] visitedValues = new boolean[m][n];

		// for (int i = 0; i < m; i++) {
		// for (int j = 0; j < n; j++) {
		for (int i = rowMin; i <= rowMax; i++) {

			for (int j = colMin; j <= colMax; j++) {
				if (i == rowMin || i == rowMax || j == colMin || j == colMax) {
					int col = j;
					int row = i;

					if (j == colMin && i != rowMax) {
						// && i >= rowMin && i >= rowMin
						// && i <= rowMax && j <= colMax && j >= colMin) {
						row = i + 1;
						if (visitedValues[i][j]) {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = tempValues[i][j];
						} else {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = rotatedMatrix[i][j];
						}
					} else if (j == colMax && i != rowMin) {
						// && i >= rowMin
						// && i >= rowMin && i <= rowMax && j <= colMax
						// && j >= colMin) {
						row = i - 1;
						if (visitedValues[i][j]) {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = tempValues[i][j];
						} else {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = rotatedMatrix[i][j];
						}
					} else if (i == rowMin && j != colMin) {
						// && i >= rowMin
						// && i <= rowMax && j <= colMax && j >= colMin) {
						col = j - 1;
						if (visitedValues[i][j]) {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = tempValues[i][j];
						} else {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = rotatedMatrix[i][j];
						}
					} else if (i == rowMax && j != colMax) {
						// && i >= rowMin
						// && i <= rowMax && j <= colMax && j >= colMin) {
						col = j + 1;
						if (visitedValues[i][j]) {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = tempValues[i][j];
						} else {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = rotatedMatrix[i][j];
						}
					} else {
						if (visitedValues[i][j]) {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = tempValues[i][j];
						} else {
							tempValues[row][col] = rotatedMatrix[row][col];
							visitedValues[row][col] = true;
							rotatedMatrix[row][col] = rotatedMatrix[i][j];
						}
					}
					// System.out.println(i + " " + j);
					// System.out.println(row + " " +
					// col);System.out.println("");
				}

			}
		}

		// for (int i = rowMin; i <= rowMax; i++) {
		// for (int j = colMin; j <= colMax; j++) {
		// rotatedMatrix[i][j] = newMatrix[i][j];
		// }
		// }

		// for (int i = 0; i < newMatrix.length; i++)// int[] i : currMatrix)
		// {
		// if (i != 0)
		// System.out.println("");
		// for (int j : newMatrix[i])
		// System.out.print(j + " ");
		// }
		return rotatedMatrix;
	}

	private static int[][] getMatrix(Scanner scan, int m, int n) {
		// TODO Auto-generated method stub

		int[][] currMatrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				currMatrix[i][j] = scan.nextInt();
			}
		}

		return currMatrix;
	}

}
